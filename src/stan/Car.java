package mobileITT.stan;

public abstract class Car {

	private Condition condition;
	private float price;
	private int kilometers;
	
	private Maker maker;
	private Model model;
	private City city;
	private Person owner;
	
	
	public Car(Condition condition){
		this.condition = condition;
	}
	
	
}
