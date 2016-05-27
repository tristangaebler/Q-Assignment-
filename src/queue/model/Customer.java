package queue.model;

public class Customer 
{
	private boolean order;
	private String name;
	private double total;

	public Customer(boolean hasOrder, String name, double total)
	{
		this.order = order;
		this.name = name;
		this.total= total;
	}
	public boolean hasOrder()
	{
		return order;
	}
	public String name()
	{
		return name;
	}
	public double total()
	{
		return total;
	}
}
