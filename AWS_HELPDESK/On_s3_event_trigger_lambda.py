import json
import boto3 

def lambda_handler(event,context):
    s3_client=boto3.client('s3')

    #Extract s3 bucket 
    bucket_name= event['records'][0]['s3']['bucket']['name']
    object_key= event['records'][0]['s3']['key']

    response=s3_client.head_object(Bucket=bucket_name,key=object_key)

    metadata_to_return={
        "file_len":response['ContentLength'],
        "last_modified":response['LastModified']
    }


    print(json.dumps(metadata_to_return))
    return {
        'statusCode':200,
        'body':json.dumps(metadata_to_return),
        'statusMsg':'OK'
    }

