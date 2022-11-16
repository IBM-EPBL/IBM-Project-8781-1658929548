FROM python:3.10
  LABEL maintainer="gajhana, gvvandimas@psnacet.edu.in"
  RUN apt-get update
  RUN mkdir /app
  WORKDIR /app
  COPY . /app
  RUN pip install requirements.txt
  EXPOSE 5000
  ENTRYPOINT [ "python" ]
  CMD [ "app.py" ]
