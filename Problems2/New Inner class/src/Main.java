class Vehicle {

    private String name;

    Vehicle(String name) {
        this.name = name;
    }

    class Engine {

        void start() {
            System.out.println("RRRrrrrrrr....");
        }

    }


    class Body {
        String color;
        Body(String color) {
            this.color = color;
        }

        void printColor() {
            System.out.println("Vehicle " + name + " has " + color + " body." );
        }
    }
}


class EnjoyVehicle {

    public static void main(String[] args) {

        Vehicle vehicle = new Vehicle("Dixi");
        Vehicle.Body body = vehicle.new Body("red");
        body.printColor();
    }
}