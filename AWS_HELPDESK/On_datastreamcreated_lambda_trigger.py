import json 
import boto3 
def lambda_handler(event,context):
    kinesis_client=boto3.client('kinesis')
    for rec in event['Records']:
        payload=json.loads(record['kinesis']['data'])
        store_in_dynamo(payload)

    return {
        'statusCode':200,
        'body':'data uploaded!!!'
    }    

def store_in_dynamo(payload):
    dynamodb=boto3.resource('dynamodb')
    tbl=dynamodb.Table('sensoiddata')
    tbl.put_item(Item=payload)
    