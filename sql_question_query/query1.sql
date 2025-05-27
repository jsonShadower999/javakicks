-- Write a SQL query that retrieves the `first_name`, `last_name`, and `email` columns from a table named `users`, where the `email` domain is “example.com”. Assume that `email` is a `VARCHAR` type.

create table users (
    first_name VARCHAR(22) NOT NULL ,
    last_name VARCHAR(22) NOT NULL ,
    email  VARCHAR(22) NOT NULL UNIQUE 

)
select first_name, last_name , email from users where email="example.com";


-- Write a SQL query to retrieve the `order_id` and `order_date` from an `orders` table and the `product_name` from a `products` table for all orders. Assume that the `orders` table has a `product_id` foreign key that references the `product_id` in the `products` table.

select o.order_id,o.order_date , p.product_name
from orders o JOIN products p
where p.product_id=o.product_id;


-- Write a SQL query to update the `salary` column in the `employees` table, increasing it by 10% for all employees who work in the “Sales” department.

update employees e
alter e.salary=e.salary+0.1*salary where e.department="sales";


--Write a SQL query to find the top 3 customers with the highest total `order_amount` from the `orders` table.

select  * from orders o order by o.order_amount DESC LIMIT 3; //wrong
SELECT customer_id, SUM(order_amount) AS total_spent

FROM orders

GROUP BY customer_id

ORDER BY total_spent DESC

LIMIT 3;

-- Write a SQL query to find all employees in the `employees` table whose `salary` is greater than the average salary in their department

select * from e.employees where salary=(select max(e.salary) from employees e);

SELECT employee_id, department_id, salary

FROM employees e

WHERE salary > (

    SELECT AVG(salary)

    FROM employees

    WHERE department_id = e.department_id

);


--  an optimized SQL query to retrieve the total sales amount for each `customer_id` in the year 2023

select sum(sales_amount) from sales_tbl 
where sales_date between '2023-01-01' and '2023-12-31'
GROUP by customer_id;

