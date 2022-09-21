# Spark Standalone Cluster Sample

This repository includes a **POC** for creating a local spark cluster using docker containers, as well as examples in **Scala** and **Python** for connecting to a spark cluster and executing tasks.

## Configuration

The following versions are used in the docker file:

|  | Version |
|--|--|
| **Linux** | alpine-3.16 |
| **JVM** | amazon-corretto-11 |
| **Python** | 3.10.7 |
| **Spark** | 3.3.0 |

Inside the docker file, the spark version **[spark-3.3.0-bin-hadoop3-scala2.13](https://www.apache.org/dyn/closer.lua/spark/spark-3.3.0/spark-3.3.0-bin-hadoop3-scala2.13.tgz)** is used.

## Running single spark shell

    cd spark-setup
    docker build -t spark-shell .
    docker run -it -p 4040:4040 spark-shell
   
![sample-image-1](images/A1.jpg)
![sample-image-2](images/A2.jpg)
