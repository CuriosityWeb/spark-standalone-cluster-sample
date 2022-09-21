import socket

from pyspark.sql import SparkSession

spark = SparkSession \
    .builder \
    .appName("first_run") \
    .master("spark://localhost:7077") \
    .config("spark.driver.host", socket.gethostbyname(socket.gethostname())) \
    .config("spark.driver.port", "4042") \
    .getOrCreate()

input_data = [{"id": f"Id-{x + 1}", "f_name": f"FirstName-{x + 1}", "l_name": f"LastName-{x + 1}", "roll_number": x + 1}
              for x in range(20)]

df = spark.createDataFrame(input_data)

df.show()

new_df = df.where("roll_number > 5")

new_df.show()

spark.stop()
