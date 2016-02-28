package mobile.car;

import mobile.exceptions.InvalidParameterException;
import mobile.users.Person;

public class Vehicle {
	
	private Engine engine;
	private Gearbox gearBox;
	private int power;
	private int km;
	private Marka maker;
	private Model model;
	private Person owner;

	public Vehicle() {
		
	}
	
	
	
	public Vehicle(int km, Gearbox gearbox, Engine engine, Person owner) {
		try {
			setKm(km);
			setOwner(owner);
			setEngine(engine);
			setGearBox(gearbox);

		} catch (InvalidParameterException e) {
			System.out.println(e.getMessage());
		}
	}

	public Engine getFuelEngine() {
		return engine;
	}

	public void setMaker(Marka maker) throws InvalidParameterException {
		if (maker != null) {
			this.maker = maker;
		} else {
			throw new InvalidParameterException();
		}
	}

	public void setModel(Model model) throws InvalidParameterException {
		if (model != null) {
			this.model = model;
		} else {
			throw new InvalidParameterException();
		}
	}

	public int getKm() throws InvalidParameterException {
		return km;

	}

	private void setKm(int km) throws InvalidParameterException {
		if (km >= 0) {
			this.km = km;
		} else {
			throw new InvalidParameterException("Not valid 'km'.");
		}
	}

	public Person getOwner() {
		return this.owner;
	}

	private void setOwner(Person owner) throws InvalidParameterException {
		if (owner != null) {
			this.owner = owner;
		} else {
			throw new InvalidParameterException();
		}
	}

	public void setEngine(Engine engine) throws InvalidParameterException {
		if(engine != null){
			this.engine = engine;
		}
		else {
			throw new InvalidParameterException();
		}
	}

	public void setGearBox(Gearbox gearBox) throws InvalidParameterException {
		if(gearBox != null){
			this.gearBox = gearBox;
		}
		else {
			throw new InvalidParameterException();
		}
	}

	
}
