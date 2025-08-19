# Apache Kafka Producer & Consumer Example

This project demonstrates a **simple Producer and Consumer application** using **Apache Kafka**.  
It helps beginners understand how data is **published (produced)** to a Kafka topic and then **read (consumed)** by a consumer.

----------------------------------------------------------------------------

## 🚀 What is Apache Kafka?
Apache Kafka is a **distributed event streaming platform** used for:
- Publishing and subscribing to streams of records (like a messaging system).
- Storing data in a fault-tolerant way.
- Processing streams of events in real time.

In simple terms:
- **Producer** → sends messages to Kafka.
- **Topic** → like a "channel" where messages are stored.
- **Consumer** → reads messages from the topic.

----------------------------------------------------------------------------

*** KAFKA'S REPO ***

----------------------------------------------------------------------------

## 🛠️ Prerequisites
1. **Java 8+** or **Python** (depending on your implementation).
2. **Apache Kafka** installed locally.
   - [Download Kafka](https://kafka.apache.org/downloads)
   - Extract and start Zookeeper & Kafka broker:
     ```bash
     # Start Zookeeper (in one terminal)
     bin/zookeeper-server-start.sh config/zookeeper.properties

     # Start Kafka broker (in another terminal)
     bin/kafka-server-start.sh config/server.properties
     ```

3. **Create a Kafka Topic** (e.g., `demo-topic`):
   ```bash
   bin/kafka-topics.sh --create --topic demo-topic --bootstrap-server localhost:9092 --partitions 1 --replication-factor 1

-----------------------------------------------------------------------------





