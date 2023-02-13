package ConstructorOverloading;

 class Car {
        String make;
        String model;
        int year;

        public Car(String make, String model) {
            this.make = make;
            this.model = model;
        }

        public Car(String make, String model, int year) {
            this.make = make;
            this.model = model;
            this.year = year;
        }
    }

    class Main {
        public static void main(String[] args) {
            Car myCar1 = new Car("Toyota", "Camry");
            Car myCar2 = new Car("Toyota", "Camry", 2022);

            System.out.println("My car1 is a " + myCar1.make + " " + myCar1.model);
            System.out.println("My car2 is a " + myCar2.make + " " + myCar2.model + " from " + myCar2.year);
        }
    }


