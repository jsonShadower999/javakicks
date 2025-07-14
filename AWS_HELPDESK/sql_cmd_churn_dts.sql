partitioned_tbl_customer_churn(
    customerId,
    gender,
    seniorcitizen,
    partner,
    dependent , 
    monthcharge,
    tenture,
    phoneservice,
    onlinebackup,
    streamTV,
    streamMovie,
    paymode,
    payamt,
    churn 

)

--- 10 record from partioned_tbl_customer_churn 
SELECT * FROM partioned_tbl_customer_churn;

--- count record where customer has churn 
select count(*) from partioned_tbl_customer_churn where churn='yes';
select sum(case when churn='yes' then 1 else 0 end) as churned from partioned_tbl_customer_churn;

--- max,min,avg churned customer changrges 

select AVG(monthcharge) as avgval, MIN(monthcharge) as minval, MAX(monthcharge) as maxval from partioned_tbl_customer_churn
where churn='yes';

--- top 10 customers by total charges 
select customer_id,customer_name
from partioned_tbl_customer_churn
order by payment desc 
limit 10;

-- provide me total no of churned user who are using internetservices , specify the count of people using different category of internet services

select SUM(CASE WHEN CHURN='yes' THEN 1 ELSE 0) AS TOTAL_CHURNED_USER , COUNT(*),INTERNETSERVICE 
FROM partioned_tbl_customer_churn
GROUP BY INTERNETSERVICE;

 -- MONTHLY CHARGE WHERE CHURN =NO
 SELECT SUM(CAST(payamt AS DOUBLE)) AS estimated_revenue
 from partioned_tbl_customer_churn
 where churn='No';


