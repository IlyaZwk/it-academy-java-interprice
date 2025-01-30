public class Helicopter extends AirTransport {


    public Helicopter(int liftingCapacity, int peopleCapacity, String name,int flyingRange,int fuel) {
        super(liftingCapacity, peopleCapacity, name, flyingRange,fuel);
    }

    @Override
    public String toString() {
        return "Helicopter{" +
                "peopleCapacity=" + getPeopleCapacity() +
                ", LiftingCapacity=" + getLiftingCapacity() +
                ", name='" + getName() + '\'' +
                ", flyingRange=" + getFlyingRange() +
                ", fuel=" + getFuel() +
                '}';
    }
}