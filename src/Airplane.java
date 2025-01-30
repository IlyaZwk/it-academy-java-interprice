public class Airplane extends AirTransport{
    public Airplane(int liftingCapacity, int peopleCapacity, String name,int flyingRange,int fuel) {
        super(liftingCapacity, peopleCapacity, name, flyingRange,fuel);
    }

    public String toString() {
        return "Airplane{" +
                "peopleCapacity=" + getPeopleCapacity() +
                ", LiftingCapacity=" + getLiftingCapacity() +
                ", name='" + getName() + '\'' +
                ", flyingRange=" + getFlyingRange() +
                ", fuel=" + getFuel() +
                '}';
    }
}