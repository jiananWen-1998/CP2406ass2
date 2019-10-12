public class Car extends Vehicle {

    public Car(String id, Road currentRoad) {
        super(currentRoad);
        this.id = "car_" + id;
        length = super.getLength();
        breadth = length / 2;
    }

}

