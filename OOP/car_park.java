public class car_park {
    public static void main(String[] args) {

        car_park_garage cg = new car_park_garage();
        car nCar = new car("BMW");
        car ncar2 = new car("Tesla");
        cg.park(ncar2);
        cg.park(nCar);
    }
}
