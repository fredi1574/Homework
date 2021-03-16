package cities;

public class City {

	private String name;
	private Road[] roads = new Road[10];
	private int numRoads;

	// city constructor
	public City(String name) {
		this.name = name;
	}

	// connects the road the city's connected road array
	public void connect(Road r) {
		roads[numRoads++] = r;

	}

	// returns the city closest to the current one
	public City nearestCity() {
		// if the city is not connected to any road returns a null
		if (numRoads == 0)
			return null;

		int minLengthIndex = 0; // stores the index of the nearest city
		int minLength = roads[0].getLength(); // stores the length of the nearest city

		for (int i = 0; i < numRoads; i++) {

			// updates the length and the index of a newly found nearest city
			if (roads[i].getLength() < minLength) {
				minLength = roads[i].getLength();
				minLengthIndex = i;
			}
		}

		// returns the closest city to the current one
		return roads[minLengthIndex].getCity1() == this ? roads[minLengthIndex].getCity2()
				: roads[minLengthIndex].getCity1();

	}

	// returns the city name
	public String toString() {
		return name;
	}
}
