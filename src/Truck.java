public class Truck extends Car {

    private int WeightCapacity = 2;

     public  int MyTruck(){
         return WeightCapacity;
     }



     Truck(String Xcar, String Xmodel, int Xmaxspeed) {
        super(Xcar, Xmodel, Xmaxspeed);


    }


    @Override
    void Gas() {

    }

    @Override
    void GetWheelCount() {

    }


}
