package com.example.activemq.consumer;

import org.apache.log4j.Logger;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component
public class Consumer {
	private final Logger logger = Logger.getLogger(getClass());
	
	@JmsListener(destination = "sample.queue")
	public void receiveQueue(String message) {
		logger.info("receive message:"+message);
	}
}
