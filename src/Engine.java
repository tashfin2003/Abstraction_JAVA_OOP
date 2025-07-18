public interface Engine {
    void start();
    void stop();
    void crashedCar();
}

abstract class Car{
    void carModel(){
        System.out.println("Old Model Car");
    }
    void carCondition(){
        System.out.println("Good Condition");
    }
    abstract void shopName();
    abstract void location();
}

class Tashfin extends Car implements Engine{
    public void start(){
        System.out.println("Car Starts");
    }
    public void stop(){
        System.out.println("Car Stops");
    }
    public void crashedCar(){
        System.out.println("Car Crashed");
    }

    @Override
    void shopName(){
        System.out.println("Kuddus Car Shop");
    }
    @Override
    void location(){
        System.out.println("Mirpur-1, Dhaka 1216");
    }

}



