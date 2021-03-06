package com.knoldus;

import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.ProducerRecord;

import java.util.Properties;


public class Producer {
    public static void main(String[] args) {
        Properties properties = new Properties();
        properties.put("bootstrap.servers", "localhost:9092");
        properties.put("key.serializer", "org.apache.kafka.common.serialization.StringSerializer");
        properties.put("value.serializer", "com.knoldus.UserSerializer");

        KafkaProducer kafkaProducer = new KafkaProducer(properties);


        try {
            for (int i = 1; i < 60; i++) {


                User user = new User("Anuradha", "UKG");
                User user1 = new User("Priya", "Devops");
                System.out.println("Message " + user.toString() + " sent !!");
                kafkaProducer.send(new ProducerRecord("user", Integer.toString(i), user));
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            kafkaProducer.close();
        }
    }
}

