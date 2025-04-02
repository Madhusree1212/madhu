package in.bookmytravel.transportmode;

public class Bus implements TransportMode {

	public void startTransport() {
		System.out.println("Bus is starting");
		
	}

	public void stopTransport() {
		System.out.println("Bus is stopping");
		
	}

	public double caluclateFare(int distance) {
		return distance*30;
	}

}
