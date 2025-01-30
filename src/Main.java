public class Main {
    public static void main(String[] args) {
        AirTransport airplane = new Airplane(25, 50,"B61",150,50);
        AirTransport helicopter = new Helicopter(5, 10,"Gd-7",100,75);
        AirTransport plane = new Plane(15, 25,"SuT-78",200,100);

        AirTransport[] airTransports = {airplane, helicopter, plane};
        Airline airline = new Airline(airTransports);
        System.out.println("Airline People capacity: " + airline.getPeopleCapacity());
        System.out.println("Airline Lifting capacity: " + airline.getLiftingCapacity());

        AirTransport airTransport = airline.findAirTransportByFuelCapacity(75, 50);
        System.out.println("Suitable by Fuel: " + airTransport);

    }
}