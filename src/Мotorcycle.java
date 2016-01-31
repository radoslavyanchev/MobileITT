
public class �otorcycle extends Vehicle {
	static final String[] type�otorcycleChoise = { "ATV", "UTV", "buggy", "enduro", "moto Roller", "Sledge-car", "dirt",
			"track", "scooter", "Superman", "tricycle", "Tourer", "choppe" };
	static final String[] engineColingMotorcycle = { "Water", "�ir" };
	private String type�otorcycle;
	private String modification;
	private int engineCubature;
	private String engineColing;

	public �otorcycle(int power, int km, String gearBox, String fuelEngine, String type�otorcycle, String modification, int engineCubature, String engineColing) {
		super(power, km, gearBox, fuelEngine);
		try {
			setType�otorcycle(type�otorcycle);
			setModification(modification);
			setEngineCubature(engineCubature);
			setEngineColing(engineColing);
		} catch (NotValidParameterException e) {
			System.out.println(e.getMessage());
		}
		

	}

	public String getType�otorcycle() {
		return type�otorcycle;
	}

	private void setType�otorcycle(String type�otorcycle) throws NotValidParameterException {
		if (type�otorcycle != null) {
			for (int i = 0; i < type�otorcycleChoise.length; i++) {
				if (type�otorcycle.equals(type�otorcycleChoise[i])) {
					this.type�otorcycle = type�otorcycle;
					break;
				}
			}
		} else {
			throw new NotValidParameterException("Not Valid type of Motorcycle");
		}

	}

	public String getModification() {
		return modification;
	}

	private void setModification(String modification) throws NotValidParameterException {
		if (modification != null && modification != "") {
			this.modification = modification;
		} else {
			throw new NotValidParameterException("Not Valid Modification");
		}
	}

	public int getEngineCubature() {
		return engineCubature;
	}

	private void setEngineCubature(int engineCubature) throws NotValidParameterException {
		if (engineCubature >= 15 && engineCubature <= 500) {
			this.engineCubature = engineCubature;
		} else {
			throw new NotValidParameterException("Not Valid �otorcycle engine cubature");
		}
	}

	public String getEngineColing() {
		return engineColing;
	}

	private void setEngineColing(String engineColing) throws NotValidParameterException {
		if (engineColing != null) {
			for (int i = 0; i < engineColingMotorcycle.length; i++) {
				if (engineColing.equals(engineColingMotorcycle[i]))
					this.engineColing = engineColing;
				break;
			}
		} else {
			throw new NotValidParameterException("Not Valid �otorcycle coling system");
		}

	}

}
