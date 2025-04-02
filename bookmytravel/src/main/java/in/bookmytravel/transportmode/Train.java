package in.bookmytravel.transportmode;

public class Train  implements TransportMode{

	public void startTransport() {
		System.out.println("Train is starting");
	}

	public void stopTransport() {
		System.out.println("Train is stopped");
		
	}

	public double caluclateFare(int distance) {
		return distance*10;
	}

}
