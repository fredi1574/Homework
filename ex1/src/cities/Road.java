package cities;

public class Road {
	
	private City city1;
	private City city2;
	private int length;
	
	//road constructor
	public Road(City city1, City city2, int length) {
		this.city1=city1;
		this.city2=city2;
		this.length=length;
		city1.connect(this);
		city2.connect(this);
	}
	
	// returns the city1 object
	public City getCity1() {
		return city1;
	}
	
	//returns the city2 object
	public City getCity2() {
		return city2;
	}
	
	//returns the road length
	public int getLength() {
		return length;
	}
 }
