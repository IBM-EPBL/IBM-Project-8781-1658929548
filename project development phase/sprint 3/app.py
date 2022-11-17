from flask import Flask
from flask_cors import CORS, cross_origin

app = Flask(__name__)
def emp():
    return("the table is empty")

if __name__ == "__main__":
    app.run()