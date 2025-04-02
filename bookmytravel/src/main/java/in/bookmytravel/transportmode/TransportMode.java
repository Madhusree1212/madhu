package in.bookmytravel.transportmode;

public interface TransportMode {
	void startTransport();
	void stopTransport();
	double caluclateFare(int distance);
}
