package properties;

public class Capitals {

	private String country;
	private String capital;

	public Capitals(String country, String capital) {
		super();
		this.country = country;
		this.capital = capital;
	}

	@Override
	public String toString() {
		return "Capitals [country=" + country + ", capital=" + capital + "]";
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getCapital() {
		return capital;
	}

	public void setCapital(String capital) {
		this.capital = capital;
	}

}
