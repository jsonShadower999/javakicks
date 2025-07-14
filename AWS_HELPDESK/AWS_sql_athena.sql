AMAZON S3 store the data csv, json , orc, parquet
AWS IAM is creste with s3 access give to glue or lambda func
AWS Glue is use to refine the categorical data


1.  create a partition key , for fast retrival 
2. data encryption using aws kms key management system 


difference between redshift n athena 

--------------------------------
create a csv of dataset 
convert csv to json 
--- IAM create new role: glue_role with aws services acess permission
--- s3-->create bucket for input, output , n code script 
--- Glue glue db(s3 data input_bucket as datasource,IAM role glue_role) + crawler(run/|created schema ) + job(DAG AWSGLUE-->CHANGE SCHEMA-->S3_BUCKET_OUTPUT_BUCKET, SCRIPT-->BUCKET_SCRIPT,RUN JOB) 
---- gLUE MONTORING TOOL 
--- JOB DAG SPECIFY THE ETL LIFECYCLE 






-----------------------------------------
.... queries of ATHENA ....
---CSV FILE HAS ,
create external table if not exists tbl_customer_churn(
    customer_id STRING ,
    customer_name STRING ,
    customer_register_date DATETIME,
    customer_spent_total DOUBLE , 
    
)
ROW FORMAT DELIMITER 
FIELDS TERMINATED BY ','
LOCATION 's3//bucket-id/folder/';



select * from tbl_customer_churn LIMIT 20 SKIP 25;

--PARTITION THE DATA USING COLUM COMPOUND DATE,REGION

CREATE EXTERNAL TABLE IF NOT EXISTS partitioned_tbl_customer_churn(
    customer_id STRING, 
    customer_name STRING, 
    customer_register_date DATETIME ,
    customer_spent_total DOUBLE 
)
PARTITIONED BY (customer_register_date DATETIME, region STRING)
LOCATION 's3://bucket_id/folder/';
---columnar format parquet and orc are perfect .
---they store compressed data as per a column 

---to store frequent query result , use result cahcing 
actions u can take !!!
Use Compression to Reduce Data Size
Partition Your Data
Select Only the Required Columns
Optimize Your File Sizes
Limit Query Results with Caching
Monitor Query Usage and Costs
--- u can integrate athena with glue n lambda 
