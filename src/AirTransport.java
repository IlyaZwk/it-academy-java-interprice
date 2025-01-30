public abstract class AirTransport {
    private int peopleCapacity;
    private int LiftingCapacity;
    private String name;
    private int flyingRange;
    private int fuel;

    public int getFuel() {
        return fuel;
    }

    public void setFuel(int fuel) {
        this.fuel = fuel;
    }

    public int getFlyingRange() {
        return flyingRange;
    }

    public void setFlyingRange(int flyingRange) {
        this.flyingRange = flyingRange;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPeopleCapacity() {
        return peopleCapacity;
    }

    public void setPeopleCapacity(int peopleCapacity) {
        this.peopleCapacity = peopleCapacity;
    }

    public int getLiftingCapacity() {
        return LiftingCapacity;
    }

    public void setLiftingCapacity(int liftingCapacity) {
        LiftingCapacity = liftingCapacity;
    }

    public AirTransport(int liftingCapacity, int peopleCapacity, String name,int flyingRange,int fuel) {
        LiftingCapacity = liftingCapacity;
        this.peopleCapacity = peopleCapacity;
        this.name = name;
        this.flyingRange=flyingRange;
        this.fuel=fuel;
    }

    @Override
    public String toString() {
        return "AirTransport{" +
                "peopleCapacity=" + peopleCapacity +
                ", LiftingCapacity=" + LiftingCapacity +
                ", name='" + name + '\'' +
                ", flyingRange=" + flyingRange +
                ", fuel=" + fuel +
                '}';
    }
}