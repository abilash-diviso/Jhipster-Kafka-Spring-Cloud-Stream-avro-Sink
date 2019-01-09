package com.diviso.stream.kafka.consumer.web.rest;

import java.time.Instant;
import java.time.ZoneOffset;


import org.apache.kafka.streams.kstream.KStream;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.schema.client.EnableSchemaRegistryClient;

import com.bytatech.ayoos.appointment.avro.Appointment;
import com.diviso.stream.kafka.consumer.config.AppointmentConsumerConfig;
import com.example.avro.Contact;
import com.example.avro.Customer;
import com.example.avro.Sensor;


/*@EnableSchemaRegistryClient*/
@SuppressWarnings("deprecation")
@EnableBinding(AppointmentConsumerConfig.class)
public class StreamConsumer {

	private static Logger log = LoggerFactory.getLogger(StreamConsumer.class);

	@StreamListener(AppointmentConsumerConfig.APPOINTMENT)
	public void receiveAppointment(KStream<String, Appointment> stream) {
		log.info("Enter into recieve Appointment" + stream);

		stream.foreach((key, value) -> System.out.println("Appointment Date Time Consumed is "
				+ Instant.ofEpochMilli(value.getAppointmentDateAndTime()).atZone(ZoneOffset.ofHoursMinutes(5, 30))));
		stream.print();
		

	}

	@StreamListener(AppointmentConsumerConfig.CUSTOMER)
	public void receiveCustomer(KStream<String, Customer> stream) {
		log.info("Enter into recieve Customer" + stream);
		// stream.foreach((k,v)->System.out.println("Customer name is
		// "+v.getCustomerName()));
		stream.print();

	}

	@StreamListener(AppointmentConsumerConfig.CONTACT)
	public void receiveContact(KStream<String, Contact> stream) {
		log.info("Enter into recieve Contact" + stream);

		stream.print();

	}

	@StreamListener(AppointmentConsumerConfig.SENSOR)
	public void receive(KStream<String, Sensor> stream) {

		stream.foreach((key, value) -> System.out.println(value + "Accelaration is "));

		log.info("Enter Into Stream consumer to receive Sensor entered" + stream);

		stream.print();

	}

}
