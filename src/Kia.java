public class Kia extends Car{
    int wheelcount;

    Kia(String Xcar, String Xmodel, int Xmaxspeed) {
        super(Xcar, Xmodel, Xmaxspeed);
    }

    @Override
    void Gas() {

        System.out.println("Press gas and get your maxspeed :"+ MaxSpeed);
    }

    public int GetWheelCount(int wheelcount) {
        return wheelcount;

    }

    @Override
    void GetWheelCount() {

    }
}
