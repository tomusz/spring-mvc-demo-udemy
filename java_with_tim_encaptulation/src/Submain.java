class Car {
    private boolean engine;
    private int cylinders;
    private int wheels;
    private String name;
    protected int gears;

    public Car(int cylinders, String name) {
        this.cylinders = cylinders;
        this.name = name;
        this.wheels = 4;
        this.engine = true;
        this.gears = 0;
    }


    public int getCylinders() {
        return cylinders;
    }


    public String getName() {
        return name;
    }

    public String startEngine() {
        this.gears = 1;
        return "Engine started car";
    }

    public String accelerate() {
        if (this.gears == 1 || this.gears > 1 && this.gears <= 3){
            this.gears=gears+1;
            return "Speed up car";
        }else if(this.gears > 3){

            return "You are at top speed car";

        }else{
            return "Start engine first car";
        }
    }

    public String brake(){
        if(this.gears >0){
            this.gears=0;
            return "Car stopped";
        }else{
            return "Car not moving";
        }

    }
}

class Traktor extends Car{

    public Traktor(int cylinders, String name) {
        super(cylinders, name);
    }



    @Override
    public int getCylinders() {
        return super.getCylinders();
    }


    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public String startEngine() {
        return super.startEngine();
    }

    @Override
    public String accelerate() {
        if (this.gears == 1 || this.gears > 1 && this.gears <= 2){
            this.gears=gears+1;
            return "Speed up Traktor";
        }else if(this.gears > 2){

            return "You are at top speed Traktor";

        }else{
            return "Start engine first Traktor";
        }
    }

    @Override
    public String brake() {
        return super.brake();
    }
}

class Toyota extends Car{

    public Toyota(int cylinders, String name) {
        super(cylinders, name);
    }



    @Override
    public int getCylinders() {
        return super.getCylinders();
    }


    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public String startEngine() {
        return super.startEngine();
    }

    @Override
    public String accelerate() {
        if (this.gears == 1 || this.gears > 1 && this.gears <= 6){
            this.gears=gears+2;
            return "Speed up Toyota";
        }else if(this.gears > 6){

            return "You are at top speed Toyota";

        }else{
            return "Start engine first Toyota";
        }
    }

    @Override
    public String brake() {
        return super.brake();
    }
}

class Fiat extends Car{

    public Fiat(int cylinders, String name) {
        super(cylinders, name);
    }



    @Override
    public int getCylinders() {
        return super.getCylinders();
    }



    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public String startEngine() {
        return super.startEngine();
    }

    @Override
    public String accelerate() {
        if (this.gears == 1 || this.gears > 1 && this.gears <= 5){
            this.gears=gears+1;
            return "Speed up Fiat";
        }else if(this.gears > 5){

            return "You are at top speed Fiat";

        }else{
            return "Start engine first Fiat";
        }
    }

    @Override
    public String brake() {
        return super.brake();
    }
}

public class Submain {

    public static void main(String[] args) {

        Car car = new Car(8,"Base car");
        System.out.println(car.startEngine());
        System.out.println(car.accelerate());
        System.out.println(car.accelerate());
        System.out.println(car.brake());

        Traktor traktor = new Traktor(4,"Traktor");
        System.out.println(traktor.startEngine());
        System.out.println(traktor.accelerate());
        System.out.println(traktor.accelerate());
        System.out.println(traktor.accelerate());
        System.out.println(traktor.brake());

        Toyota toyota = new Toyota(10,"Super Crazy");
        System.out.println(toyota.startEngine());
        System.out.println(toyota.accelerate());
        System.out.println(toyota.accelerate());
        System.out.println(toyota.accelerate());
        System.out.println(toyota.accelerate());
        System.out.println(toyota.brake());

        Fiat fiat = new Fiat(1,"Low");
        System.out.println(fiat.startEngine());
        System.out.println(fiat.accelerate());
        System.out.println(fiat.accelerate());
        System.out.println(fiat.accelerate());
        System.out.println(fiat.accelerate());
        System.out.println(fiat.accelerate());
        System.out.println(fiat.accelerate());
        System.out.println(fiat.brake());

    }

}
