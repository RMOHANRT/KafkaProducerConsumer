package com.visa.test;

import java.util.ArrayList;
//import util.properties packages
import java.util.Properties;

//import simple producer packages
import org.apache.kafka.clients.producer.Producer;

//import KafkaProducer packages
import org.apache.kafka.clients.producer.KafkaProducer;

//import ProducerRecord packages
import org.apache.kafka.clients.producer.ProducerRecord;

//Create java class named “SimpleProducer”
public class SimpleProducer {
 
 public static void main(String[] args) throws Exception{
    
   
    //Assign topicName to string variable
    String topicName = "Ram";
    Integer i = 0;
    // create instance for properties to access producer configs   
    Properties props = new Properties();
    
    //Assign localhost id
    props.put("bootstrap.servers", "localhost:9092");
    
    //Set acknowledgements for producer requests.      
    props.put("acks", "all");
    
    //If the request fails, the producer can automatically retry,
    props.put("retries", 0);
    
    //Specify buffer size in config
    props.put("batch.size", 16384);
    
    //Reduce the no of requests less than 0   
    props.put("linger.ms", 1);
    
    //The buffer.memory controls the total amount of memory available to the producer for buffering.   
    props.put("buffer.memory", 33554432);
    
    props.put("key.serializer", 
       "org.apache.kafka.common.serialization.StringSerializer");
       
    props.put("value.serializer", 
       "org.apache.kafka.common.serialization.StringSerializer");
    
    Producer<String, String> producer = new KafkaProducer
       <String, String>(props);
          
    CSVReader readerCsv = new CSVReader();
    ArrayList<String> strlist = CSVReader.getProducerMsg();
   
    for(String str : strlist) {
    	
       producer.send(new ProducerRecord<String, String>(topicName, 
          Integer.toString(i), i+","+str));
       i++;
    }
             System.out.println("Message sent successfully new Msg");
             producer.close();
 }
}
