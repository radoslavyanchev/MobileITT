
public class Vehicle {
	static final String[] fuelEngineChoise = { "Petrol", "Naphtha", "Elektrisch", "Hybrid" };
	static final String[] geareBoxChoise = { "manual", "automatic", "Semi-Àutomatic" };
	String fuelEngine;
	String gearBox;
	private int power;
	private int km;

	public Vehicle(int power, int km, String gearBox, String fuelEngine) {
		try {
			setFuelEngine(fuelEngine);
			setGearBox(gearBox);
			setKm(km);
			setPower(power);
		} catch (NotValidParameterException e) {
			System.out.println(e.getMessage());
		}
	}

	public String getFuelEngine() {
		return fuelEngine;
	}

	private void setFuelEngine(String fuelEngine) throws NotValidParameterException {
		if (fuelEngine != null) {
			for (int i = 0; i < fuelEngineChoise.length; i++) {
				if (fuelEngine.equals(fuelEngineChoise[i])) {
					this.fuelEngine = fuelEngine;
					break;
				}
			}
		} else {
			throw new NotValidParameterException("Not valid Fuel Engine");
		}

	}

	public String getGearBox() {
		return gearBox;
	}

	private void setGearBox(String gearBox) throws NotValidParameterException {
		if (gearBox != null) {
			for (int i = 0; i < geareBoxChoise.length; i++) {
				if (gearBox.equals(geareBoxChoise[i])) {
					this.gearBox = gearBox;
					break;
				}
			}
		} else {
			throw new NotValidParameterException("Not Valid Gear Box");
		}

	}

	public int getPower() {
		return power;
	}

	private void setPower(int power) throws NotValidParameterException {
		if (power > 0) {
			this.power = power;
		} else {
			throw new NotValidParameterException("Not valid power");
		}
	}

	public int getKm() throws NotValidParameterException {
		return km;

	}

	private void setKm(int km) throws NotValidParameterException {
		if (km >= 0) {
			this.km = km;
		} else {
			throw new NotValidParameterException("Not valid 'km'.");
		}
	}

}
