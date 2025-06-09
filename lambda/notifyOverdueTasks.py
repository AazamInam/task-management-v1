import requests
import datetime

def lambda_handler(event, context):
    today = datetime.date.today().isoformat()
    url = f"http://your-task-service/api/v1/tasks?dueBefore={today}&completed=false"
    response = requests.get(url)
    overdue_tasks = response.json()

    for task in overdue_tasks:
        print(f"ALERT: Task '{task['title']}' is overdue. Due: {task['dueDate']}")
