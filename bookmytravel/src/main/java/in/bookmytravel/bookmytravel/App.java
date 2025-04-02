package in.bookmytravel.bookmytravel;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import in.bookmytravel.BookMyTravel;
import in.bookmytravel.config.BookMyTravelConfig;
import in.bookmytravel.transportmode.Taxi;
import in.bookmytravel.transportmode.Train;

public class App 
{
    public static void main( String[] args ) {
    	ApplicationContext context=new AnnotationConfigApplicationContext(BookMyTravelConfig.class);
    	BookMyTravel b=context.getBean(BookMyTravel.class);
    	b.start();
    	b.stop();
    	b.caluclatefare(10);
    	System.out.println("switching to train");
    	b.setTransportMode(new Train());
    	b.start();
    	b.stop();
    	b.caluclatefare(13);
    	System.out.println("switching to taxi");
    	b.setTransportMode(new Taxi());
    	b.start();
    	b.stop();
    	b.caluclatefare(3);
    }
}
