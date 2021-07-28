# CDC (change data capture) with debezium + apache kafka zookeeper + kafka connect +spring boot + mysql + docker compose

This project guides you the basic idea of the CDC by using spring boot application as a consumer.  
the steps are followed as
the [debezium official documentation - Getting Started ](https://debezium.io/documentation/reference/1.6/tutorial.html).
According to the documentation, it guides by using docker commands. but in this configuration are base on the
docker-compose for convenience purposes.

1. [Introduction to Debezium](https://debezium.io/documentation/reference/1.6/tutorial.html#introduction-debezium)
2. [Starting the services ](https://debezium.io/documentation/reference/1.6/tutorial.html#starting-services)
    1. Getting ready
       > create the `docker-compose.ymal` file
       ```yaml
       version: '3'
       services:
        zookeeper:
          image: debezium/zookeeper:1.6
          hostname: localhost
          container_name: debezium_4_zookeeper
          ports:
            - 2181:2181
            - 2888:2888
            - 3888:3888
          ```
    2. [Start Zookeeper](https://debezium.io/documentation/reference/1.6/tutorial.html#starting-zookeeper)
       >ZooKeeper is the first service you must start.
      > 
    3. [Start Kafka](https://debezium.io/documentation/reference/1.6/tutorial.html#starting-kafka)
    4. [Start a MySQL database](https://debezium.io/documentation/reference/1.6/tutorial.html#starting-mysql-database)
    5. [Start a MySQL command line client](https://debezium.io/documentation/reference/1.6/tutorial.html#starting-mysql-command-line-client)
    6. [Start Kafka Connect](https://debezium.io/documentation/reference/1.6/tutorial.html#starting-kafka-connect)
