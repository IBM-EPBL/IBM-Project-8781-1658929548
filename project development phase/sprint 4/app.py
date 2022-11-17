from flask import Flask


app = Flask(__name__)
def emp():
    return("the table is empty")

if __name__ == "__main__":
    app.run()