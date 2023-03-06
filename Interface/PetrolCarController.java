package Interface;
public class PetrolCarController implements PetrolCar{
    @Override
    public void acceletator() {
        System.out.println("Pertrol car accelerate");
    }

    @Override
    public void brake() {
        System.out.println("Petrol car Brake");
    }

    @Override
    public void start() {
        System.out.println("Petrol car Start");
    }

    @Override
    public void Petrol() {
        System.out.println("Require Petrol");
    }

    public static void main(String[] args) {
        PetrolCarController petrol=new PetrolCarController();
        petrol.acceletator();
    }
}
