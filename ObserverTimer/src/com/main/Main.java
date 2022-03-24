package com.main;

import java.util.Random;

import com.listener.ClientListener;
import com.publisher.Publisher;

public class Main {

	public static void main(String[] args) {
		
		//Initialize the publisher to add listeners to it
		Publisher publisher = new Publisher();
		
		//Create concrete listeners
		ClientListener listener1 = new ClientListener(publisher);
		ClientListener listener2 = new ClientListener(publisher);
		
		//Test the unsubscribe function
		publisher.unsubscribe(listener2);
		
		//Continues loop which change state of publisher every 5000 mseconds  
		while(true) {
			//Using Thread may cause InterruptedEception
			try {
				Random ran = new Random();
				publisher.setState(ran.nextInt()) ;
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
