package in.bookmytravel;

import org.springframework.stereotype.Component;
import in.bookmytravel.transportmode.Bus;
import in.bookmytravel.transportmode.TransportMode;

@Component
public class BookMyTravel {
	
	private TransportMode transportmode;

	public BookMyTravel() {
		this.transportmode=new Bus();
	}
	public void start() {
		transportmode.startTransport();
	}
	public void stop() {
		transportmode.stopTransport();
	}
	
	public void caluclatefare(int distance) {
		System.out.println("total fare of train is: "+transportmode.caluclateFare(distance));
	}
	public void setTransportMode( TransportMode transportmode) {
		this.transportmode=transportmode;
	}
}
