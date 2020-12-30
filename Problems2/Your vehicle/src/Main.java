class EnjoyVehicle {

    public static void startVehicle() {
        Vehicle v = new Vehicle();
        Vehicle.Engine e = v.new Engine();
        e.start();
    }
}