# using SendGrid's Python Library
# https://github.com/sendgrid/sendgrid-python
import os
from sendgrid import SendGridAPIClient
from sendgrid.helpers.mail import Mail

message = Mail(
    from_email='gajhanaselvi1@gmail.com',
    to_emails='gajhanaselvi@gmail.com',
    subject='veryfying the account',
    html_content= r'template.html')
try:
    sg = SendGridAPIClient(os.environ.get('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'))
    response = sg.send(message)
    print(response.status_code)
    print(response.body)
    print(response.headers)
except Exception as e:
    print(e)
