package inheretageChallange;

public class Car extends Vehicle{

    private int weels;

    public Car(int weels) {
        this.weels = weels;
    }

    @Override
    public void move(int speed) {

        super.move(speed);
    }
}
