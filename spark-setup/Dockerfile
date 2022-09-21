FROM python:3.10.7-alpine3.16

MAINTAINER Divyanshu Srivastava <sdims109@gmail.com>

ARG spark_version="spark-3.3.0"
ARG spark_complete_version="spark-3.3.0-bin-hadoop3-scala2.13"

RUN apk update && \
    wget -O /etc/apk/keys/amazoncorretto.rsa.pub  https://apk.corretto.aws/amazoncorretto.rsa.pub && \
    echo "https://apk.corretto.aws/" >> /etc/apk/repositories && \
    apk update && \
    apk add amazon-corretto-11 && \
    apk add bash && \
    cd /opt && \
    wget https://dlcdn.apache.org/spark/${spark_version}/${spark_complete_version}.tgz && \
    tar zvxf ${spark_complete_version}.tgz && \
    rm -rf ${spark_complete_version}.tgz

ENV SPARK_HOME="/opt/${spark_complete_version}"
ENV PATH="${PATH}:${SPARK_HOME}/bin"

EXPOSE 8080
EXPOSE 8081
EXPOSE 7077

CMD ["spark-shell"]
