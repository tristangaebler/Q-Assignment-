package queue.controller;

import java.util.LinkedList;
import java.util.Queue;

import queue.model.Customer;

public class Controller 
{
private Queue<Customer> line;

	public void start()
	{
		theLine();
	}
	public void theLine()
	{
		line = new LinkedList<Customer>();
		line.add(new Customer(true, "Yakes",  2.78));
		line.add(new Customer(false, "The Yakles", 90.76));
		line.add(new Customer(false, "The Dinlkles", 75.65));
		
	}
}
