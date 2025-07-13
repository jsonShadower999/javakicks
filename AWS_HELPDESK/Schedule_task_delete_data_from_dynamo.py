#30 mon ka data delete kro from present date 

import boto3 
import datetime 

def lambda_handler(event,context):
    #abhi ka date 
    curr_time=datetime.datetime.now().strftime("%y-%m-%d %H:%M:%S")
    clean_data()
    return {
        'statusCode':200,
        'body':json.dumps("data deleted ")
    }



def clean_data():
    dynamodb_content=boto3.resource('dynamodb')
    tbl=dynamodb_content.Table('user_tbl')
    date_before_30day=(datetime.datetime.now()-datetime.timedelta(days=30)).isoformat()
    response = tbl.scan(
        FilterExpression="timestamp < :threshold",
        ExpressionAttributeValues={":threshold": threshold_date}
    )
    for obj in response['Items']:
        tbl.delete_item()

