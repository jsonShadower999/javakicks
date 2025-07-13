import boto3 
import json 
def lambda_handler(event,context):
    sns_cli=boto3.client('sns')
    #for email related service 
    current_val=event.get('current_api_hit')
    if current_val>500:
        msg="thresold exceed!!!"
        topic_arn="arn:aws:sns:us-east-1:123456789012:ThresholdAlerts"

        sns_cli.publish(
            TopicArn=topic_arn,
            Message=msg,
            Subject="Alert: U r exceeding the API hit limit"
            )
    return {
        'statusCode':200,
        'body':json.dumps('notified the limit exceed!!!')
        

    }    
