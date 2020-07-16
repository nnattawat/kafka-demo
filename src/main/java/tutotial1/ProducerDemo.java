package tutotial1;

import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.ProducerConfig;
import org.apache.kafka.clients.producer.ProducerRecord;
import org.apache.kafka.common.serialization.StringSerializer;

import javax.print.DocFlavor;
import java.util.Properties;

public class ProducerDemo {
    public static void main(String[] args) {
        // Create producer properties
        Properties properties = new Properties();
        properties.setProperty(ProducerConfig.BOOTSTRAP_SERVERS_CONFIG, "127.0.0.1:9092");
        properties.setProperty(ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG, StringSerializer.class.getName());
        properties.setProperty(ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG, StringSerializer.class.getName());

        // Create producer with key and value typed string
        KafkaProducer<String, String> producer = new KafkaProducer<String, String>(properties);

        // Send data - asynchronous
        ProducerRecord<String, String> record = new ProducerRecord<String, String>("first_topic_name", "hello world");
        producer.send(record);

        producer.flush();
        producer.close();
    }
}
