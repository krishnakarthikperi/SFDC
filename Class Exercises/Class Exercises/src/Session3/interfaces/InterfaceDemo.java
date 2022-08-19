package Session3.interfaces;

import java.util.Iterator;

public class InterfaceDemo {
	private static FlightManager flightManager = new FlightManager();
	
	public static void loadVendors() {
		flightManager.addVendor(new Emirates());
		flightManager.addVendor(new AirInida());
		
	}
	public static void main(String[] args) {
		loadVendors();
		System.out.println("Get all flights");
		for(FlightService fs:flightManager.getListVendors()) {
			fs.getAllFlights();
		}
		System.out.println("Do booking");
		for(FlightService fs:flightManager.getListVendors()) {
			fs.doBooking();
		}
	}

}
