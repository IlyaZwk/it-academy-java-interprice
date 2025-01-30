public class Airline {
    private AirTransport[] airTransports;

    public Airline(AirTransport[] airTransports) {
        this.airTransports = airTransports;
    }
    public int getPeopleCapacity() {
        int result=0;
        for (int i = 0; i < airTransports.length;i++ ) {
            result += airTransports[i].getPeopleCapacity();
        }
        return result;
    }
    public int getLiftingCapacity() {
        int result=0;
        for (int i = 0; i < airTransports.length;i++ ) {
            result += airTransports[i].getLiftingCapacity();
        }
        return result;
    }
    public int getFuel() {
        int result=0;
        for (int i = 0; i < airTransports.length;i++ ) {
            result += airTransports[i].getFuel();
        }
        return result;
    }

    public AirTransport findAirTransportByFuelCapacity(int maxValue, int minValue) {
        AirTransport result= null;
        for (int i = 0; i < airTransports.length;i++ ) {
            int currentFuel=airTransports[i].getFuel();
            if (currentFuel >= minValue && currentFuel <= maxValue) {
                result=airTransports[i];
                return  result;
            }
        }
        return result;
    }

}