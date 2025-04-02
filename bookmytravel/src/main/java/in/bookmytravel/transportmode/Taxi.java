package in.bookmytravel.transportmode;

public class Taxi implements TransportMode {

	public void startTransport() {
		System.out.println("Taxi is starting");
		
	}

	public void stopTransport() {
		System.out.println("Taxi is stoping");
		
	}

	public double caluclateFare(int distance) {
		return distance * 50;
	}

}
