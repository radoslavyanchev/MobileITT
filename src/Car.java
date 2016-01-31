
public class Car extends Vehicle {
	static final String[] typeCarChoise = { "Van", "Convertible", "Hearse", "Station", "Wagon", "Compartment", "Ambulance",
			"Minivan", "Pickup", "Sedan", "Strachey", "Limousine", "Hatchback" };
	private String type;

	public Car(int power, int km, String gearBox, String fuelEngine, String type) {
		super(power, km, gearBox, fuelEngine);
		try {
			setType(type);
		} catch (NotValidParameterException e) {
			System.out.println(e.getMessage());
		}
	}

	public String getType() {
		return type;
	}

	public void setType(String type) throws NotValidParameterException {
		if (type != null) {
			for (int i = 0; i < fuelEngineChoise.length; i++) {
				if (type.equals(typeCarChoise[i])) {
					this.type = type;
					break;
				}
			}
		} else {
			throw new NotValidParameterException("Not Valid type of Car");
		}

	}

}
