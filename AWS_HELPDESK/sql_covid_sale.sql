create permanent table if not exist 
SALES_DECOR_ITEM(
    product_id STRING NOT NULL PRIMARY KEY,
    product_name STRING NOT NULL ,
    monthly_sales INT NOT NULL ,
    month_name STRING NOT NULL ,
    price_per_unit DOUBLE NOT NULL,
    total_buy INT DEFAULT 0,
    covid_status BOOLEAN DEFAULT FALSE,
    customer_ref foreign key reference(Buyer_leads(buyer_id))
)
partitioned by (month_name STRING)
LOCATION "s3:/folder/sale.json";


create permanent table if not exist 
Buyer_leads(
    buyer_id STRING NOT NULL PRIMARY KEY,
    buyer_name STRING NOT NULL ,
    buyer_occupation STRING,
    buyer_contact STRING ,
    buyer_screentime_hrs DOUBLE DEFAULT 0.0,

)
partitioned by (month_name STRING)
LOCATION "s3:/folder/buyer.json";


--- retrive all detail from customer n sales decort bl
select * from SALES_DECOR_ITEM s 
join 
select * from Buyer_leads b 
on s.customer_ref=b.buyer_id LIMIT 10;


--- select the customer who have month sale >70%
select buyer_tbl.buyer_id,buyer_tbl.buyer_name 
,sales_tbl.monthly_sales
from buyer_tbl.buyer_id=sales_tbl.customer_ref
where sales_tbl.monthly_sales>70;

---for each customer , each customer month ka total buy
select sum(s.total_buy) , b.*
over (
    partition by s.customerid 
    order by s.month_name

)as month_window_total_spent_per_person
from SALES_DECOR_ITEM s
Join 
Buyer_leads b on s.customer_ref=b.buyer_id LIMIT 10;


79 ---123ert--jan 

---buyer name where sales is o

if sales is o to buyer ka koi record nhi hoga sales me 

to buyer table ka record , jo sales pe na ho

select b.id,b.name,b.buyer_occupation
from Buyer_leads b 
left join 
--buyer ka full data 
SALES_DECOR_ITEM s 
On s.customer_ref=b.buyer_id where 
s.customer_ref IS NULL ;




SELECT
  sale_month,
  buyer_id
  name,
  total_spent,
  RANK() OVER (PARTITION BY sale_month ORDER BY total_spent DESC) AS monthly_rank
FROM (
  SELECT
    s.sale_month,
    s.customerid,
    b.name,
    SUM(s.price_product * s.totalbuy) AS total_spent
  FROM sales s
  JOIN customer c ON s.customerid = b.id
  GROUP BY s.sale_month, s.customerid, b.name
) t;


--- all customer who spent more then avg on covd 

select covid_status,AVG(price_product*total_buy) AS avg_sale_person_covid
from SALES_DECOR_ITEM 
Group by covid_status='yes';

--- monthly covid summary 
CREATE TABLE monthly_covid_summary
WITH (
  format = 'PARQUET',
  partitioned_by = ARRAY['sale_month']
) AS
SELECT
  sale_month,
  covid_status,
  COUNT(DISTINCT buyerid) AS unique_customers,
  SUM(totalbuy) AS total_buys,
  SUM(price_product * totalbuy) AS total_revenue
FROM sales
GROUP BY sale_month, covid_status;


SELECT *
FROM monthly_covid_summary
WHERE sale_month = '2025-10' AND covid_status = 'post_covid';

