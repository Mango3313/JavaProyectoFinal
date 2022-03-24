package com.publisher;

import java.util.ArrayList;

import com.listener.Listener;

//Publisher class
public class Publisher {
	//List of listeners
	private ArrayList<Listener> listeners = new ArrayList<>();
	public int state;
	
	public int getState() {
		return state;
	}
	
	public void setState(int state) {
		this.state = state;
		notifyListeners();
	}
	
	public void subscribe(Listener listener) {
		listeners.add(listener);
	}
	public void unsubscribe(Listener listener) {
		listeners.remove(listener);
	}
	public void notifyListeners() {
		//Foreach lambda
		listeners.forEach((Listener listener)-> listener.update(""+state));
	}
}
