public class Plane extends AirTransport{
    public Plane(int liftingCapacity, int peopleCapacity, String name,int flyingRange,int fuel) {
        super(liftingCapacity, peopleCapacity, name, flyingRange,fuel);
    }
    public String toString() {
        return "Plane{" +
                "peopleCapacity=" + getPeopleCapacity() +
                ", LiftingCapacity=" + getLiftingCapacity() +
                ", name='" + getName() + '\'' +
                ", flyingRange=" + getFlyingRange() +
                ", fuel=" + getFuel() +
                '}';
    }
}