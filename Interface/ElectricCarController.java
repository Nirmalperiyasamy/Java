package Interface;

public class ElectricCarController implements ElectricCar {
    @Override
    public void electricity() {
        System.out.println("Require Electricity");
    }

    @Override
    public void acceletator() {
        System.out.println("Electric car accelerate");
    }

    @Override
    public void brake() {
        System.out.println("Electric car brake");
    }

    @Override
    public void start() {
        System.out.println("Electric  car start");
    }

    public static void main(String[] args) {
        ElectricCarController electric=new ElectricCarController();
        electric.brake();
    }
}
