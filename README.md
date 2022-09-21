# Spark Standalone Cluster Sample

This repository includes a **POC** for creating a local spark cluster using docker containers, as well as examples in **Scala** and **Python** for connecting to a spark cluster and executing tasks.

## Requirements

|  | Version | Comment |
|--|--|--|
| JVM | 11 | To run Scala Samples |
| SBT | 1.7.1 | To run Scala Samples |
| Python | 3.10.7 | To run Python Samples |
| Docker | 20.10.14 | - |
| Docker Compose | 2.10.2 | - |

It is entirely optional to download and install spark locally; you can simply build the image from a [Dockerfile](spark-setup/Dockerfile) and launch the spark shell by running the docker run command.
