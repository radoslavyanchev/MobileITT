
public abstract class Part {
	static final String[] categoryChoise = { "Car", "Ìotorcycle" };
	private String category;

	Part(String category) {
		try {
			setCategory(category);
		} catch (NotValidParameterException e) {
			System.out.println(e.getMessage());
		}
	}

	public String getCategory() {
		return category;
	}

	private void setCategory(String category) throws NotValidParameterException {
		if (category != null) {
			for (int i = 0; i < categoryChoise.length; i++) {
				if (category.equals(categoryChoise[i])) {
					this.category = category;
					break;
				}
			}
		} else {
			throw new NotValidParameterException("Not valid Category for Part");
		}

	}
}
