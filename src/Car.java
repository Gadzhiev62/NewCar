 abstract class Car {
    String Car;
    String model;
    int MaxSpeed;
    Car( String Xcar , String Xmodel , int Xmaxspeed){
        Car = Xcar;
        model = Xmodel;
        MaxSpeed = Xmaxspeed;
    }



     abstract void Gas();
    abstract  void GetWheelCount();
    public  void  Display(){
        System.out.println(Car +" " + model+" "+MaxSpeed);


    }
}
