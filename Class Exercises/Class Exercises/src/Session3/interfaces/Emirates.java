package Session3.interfaces;

public class Emirates implements FlightService, PaymentService{

//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//
//	}

	@Override
	public void getAllFlights() {
		System.out.println("Get flights in Emirates way");
	}

	@Override
	public void doBooking() {
		System.out.println("Do bookings in Emirates way");
		
	}

	@Override
	public void payment() {
		System.out.println("Pay in Emirates way");
		
	}

}
