package Enum.Interface;
interface Shape {
    double getArea();
    double getArea(double number1,double number2);
}

    enum GeometricShape implements Shape  {
        CIRCLE {
            @Override
            public double getArea() {
                 return 3.14 * Math.pow(radius, 2);
            }

            public double getArea(double number1, double number2) {
                return number2+number1;
            }
        },
        RECTANGLE {
            public double getArea() {
                return length * width;
            }

            @Override
            public double getArea(double number1, double number2) {
                return 0;
            }
        },
        TRIANGLE {
            public double getArea() {
                return (length * width) / 2;
            }

            @Override
            public double getArea(double number1, double number2) {
                return 0;
            }
        };

        protected double radius;
        protected double length;
        protected double width;

        public void setRadius(double radius) {
            this.radius = radius;
        }

        public void setDimensions(double length, double width) {
            this.length = length;
            this.width = width;
        }

    }

 public  class Geomentry {
        public static void main(String[] args) {
            GeometricShape circle = GeometricShape.CIRCLE;
            circle.setRadius(2.0);
            System.out.println("Area of circle with radius 2: " + circle.getArea(5.5,2.0));

            GeometricShape rectangle = GeometricShape.RECTANGLE;
            rectangle.setDimensions(3.0, 4.0);
            System.out.println("Area of rectangle with length 3 and width 4: " + rectangle.getArea());

            GeometricShape triangle = GeometricShape.TRIANGLE;
            triangle.setDimensions(3.0, 4.0);
            System.out.println("Area of triangle with base 3 and height 4: " + triangle.getArea());
        }
    }


