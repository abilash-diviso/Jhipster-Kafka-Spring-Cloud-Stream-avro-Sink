package com.diviso.stream.kafka.consumer.config;

import org.apache.kafka.streams.kstream.KStream;
import org.springframework.cloud.stream.annotation.Input;

import com.bytatech.ayoos.appointment.avro.Appointment;
import com.example.avro.Contact;
import com.example.avro.Customer;
import com.example.avro.Sensor;

public interface AppointmentConsumerConfig {
	String APPOINTMENT="appointment";
	
	@Input(APPOINTMENT)
	KStream<String, Appointment> appointment();
	
	String CONTACT="contact";
	
	@Input(CONTACT)
	KStream<String, Contact> contact();
	
	String SENSOR="sensor";

	
	@Input(SENSOR)
	KStream<String, Sensor> sensor();
	
	String CUSTOMER="customer";
	
	@Input(CUSTOMER)
	KStream<String, Customer> customer();
}
