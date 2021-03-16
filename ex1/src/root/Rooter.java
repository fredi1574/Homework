package root;

public class Rooter {

	private double precision;

	//Rooter constructor
	public Rooter(double precision) {
		this.precision = precision;
	}

	//updates the desired precision for the rooter
	public void setPrecision(double precision) {
		this.precision = precision;
	}

	//performs the square root algorithm
	public double sqrt(double x) {
		double one = x / 2;
		double two = x / one;

		while (Math.abs(one - two) >= precision) {

			if (one == two)
				return one;
			
			one = (one + two) / 2;
			two = x / one;
		}
		return one;
	}
}
