public class Main {
    public static void main(String[] args) {
        Kia kia = new Kia("Kia", "Optima", 220);

        kia.Display();
        System.out.println((kia.GetWheelCount(4)));
        kia.Gas();
        Truck truck = new Truck("Nissan", "Navarra" ,195);
        System.out.println(truck.MyTruck());


    }
}