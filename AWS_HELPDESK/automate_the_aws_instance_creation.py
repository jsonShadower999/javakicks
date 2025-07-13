# steps to autoscale ec2 cpu utilization:::

# i need to monitor cpu utilization 
# if the cpu utilization will exceed by 70% then i will double the current no of instances 


import boto3
import json 
import os 
auto_scale_cli=boto3.client('autoscaling')
#i need to have monitor the cpu utilization
cloud_watch_cli=boto3.client('cloudwatch')
#auto scaling grp when to scale up
ASG_NAME=os.environ['ASG_Name']
THRESHOLD=70 
MIN_INSTANCE=2 
MAX_INSTANCE=7
SCALE_UP_FACTOR=2


def lambda_handler(event,context):
    cloud_watch_cli.get_metric_statistics(
         Namespace='AWS/EC2',
        MetricName='CPUUtilization',
        Dimensions=[
            {
                'Name': 'AutoScalingGroupName',
                'Value': ASG_NAME
            }
        ],
        StartTime='2023-01-01T00:00:00Z',  # Adjust based on your needs
        EndTime='2023-12-31T23:59:59Z',
        Period=300,  # 5-minute intervals
        Statistics=['Average']

    )
    data_points = response.get('Datapoints', [])
    if not data_points:
        print("No data points available.")
        return
    avg_cpu_utiliz = max(data_points, key=lambda x: x['Timestamp'])['Average']
    if(avg_cpu_utiliz>=THRESHOLD):
        scale_up()
    else:
        print("no action needed")
    return {
        'statusCode':200,
        'body':json.dumps('auto sclaing code is tried ')

    }   

def scale_up():
    asg_response = autoscaling_client.describe_auto_scaling_groups(
        AutoScalingGroupNames=[ASG_NAME]
    )
     asg = asg_response['AutoScalingGroups'][0]
    current_capacity = asg['DesiredCapacity']
    max_capacity = asg['MaxSize']
    
    # Calculate the new desired capacity, making sure it doesn't exceed the maximum
    new_capacity = min(current_capacity * SCALE_UP_FACTOR, max_capacity)
    
    if new_capacity > current_capacity:
        print(f"Scaling up the Auto Scaling Group to {new_capacity} instances.")
        autoscaling_client.update_auto_scaling_group(
            AutoScalingGroupName=ASG_NAME,
            DesiredCapacity=new_capacity
        )


