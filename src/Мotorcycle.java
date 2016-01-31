
public class Ìotorcycle extends Vehicle {
	static final String[] typeÌotorcycleChoise = { "ATV", "UTV", "buggy", "enduro", "moto Roller", "Sledge-car", "dirt",
			"track", "scooter", "Superman", "tricycle", "Tourer", "choppe" };
	static final String[] engineColingMotorcycle = { "Water", "Àir" };
	private String typeÌotorcycle;
	private String modification;
	private int engineCubature;
	private String engineColing;

	public Ìotorcycle(int power, int km, String gearBox, String fuelEngine, String typeÌotorcycle, String modification, int engineCubature, String engineColing) {
		super(power, km, gearBox, fuelEngine);
		try {
			setTypeÌotorcycle(typeÌotorcycle);
			setModification(modification);
			setEngineCubature(engineCubature);
			setEngineColing(engineColing);
		} catch (NotValidParameterException e) {
			System.out.println(e.getMessage());
		}
		

	}

	public String getTypeÌotorcycle() {
		return typeÌotorcycle;
	}

	private void setTypeÌotorcycle(String typeÌotorcycle) throws NotValidParameterException {
		if (typeÌotorcycle != null) {
			for (int i = 0; i < typeÌotorcycleChoise.length; i++) {
				if (typeÌotorcycle.equals(typeÌotorcycleChoise[i])) {
					this.typeÌotorcycle = typeÌotorcycle;
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
			throw new NotValidParameterException("Not Valid Ìotorcycle engine cubature");
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
			throw new NotValidParameterException("Not Valid Ìotorcycle coling system");
		}

	}

}
