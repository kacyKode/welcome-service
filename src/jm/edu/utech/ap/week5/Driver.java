package jm.edu.utech.ap.week5;

public class Driver implements Driveable{

	@Override
	public void drive(float numberofMiles) {
		System.out.println(String.format("Kacy has driven " + "%.2f miles", numberofMiles));
		
	}

}
