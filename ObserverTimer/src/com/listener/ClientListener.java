package com.listener;

import java.util.UUID;

import com.publisher.Publisher;

//Implementation of listener interface
public class ClientListener implements Listener {
	
	private String id;
	
	public ClientListener(Publisher publisher) {
		//Subscribe to the publisher
		publisher.subscribe(this);
		//Generates a UUID to identify each listener
		this.id = UUID.randomUUID().toString();
	}

	@Override
	public void update(String msg) {
		// TODO Auto-generated method stub
		System.out.println("El publisher cambio de estado: "+msg+", ID del cliente: "+this.id);
	}

}
