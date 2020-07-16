# Kafka tutorial
Some example of producers and consumers


## Steps to run

1. Install Kafka and Zookeeper
1. Start Zookeeper and Kafka
    ```bash
    # start Zookeeper
    zookeeper-server-start config/zookeeper.properties

    # start Kafka
    kafka-server-start config/server.properties
    ```
1. Create topic
    ```bash
    kafka-topics --zookeeper 127.0.0.1:2181 --topic first_topic_name --create --partitions 3 --replication-factor 1
    ```
1. Run one of the producer file to produce messages
1. Run one of the consumer file to read messages

## Tips
You can play around with producer and consumer config or start/stop multiple consumers on the same group to see how they load balancing and reassign topic's partitions