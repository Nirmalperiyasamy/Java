package MethodOverloading;

    class Calculator {
        public int add(int num1, int num2) {
            return num1 + num2;
        }

        public double add(double num1, double num2) {
            return num1 + num2;
        }

        public int add(int num1, int num2, int num3) {
            return num1 + num2 + num3;
        }
    }

    class Main {
        public static void main(String[] args) {
            Calculator myCalculator = new Calculator();

            System.out.println("The result of adding 2 and 3 is: " + myCalculator.add(2, 3));
            System.out.println("The result of adding 2.5 and 3.5 is: " + myCalculator.add(2.5, 3.5));
            System.out.println("The result of adding 2, 3, and 4 is: " + myCalculator.add(2, 3, 4));
        }
    }


