public class Robot {
    int batteryLevel =100;
    int speed=0;
    String name = "Robo";
    String color = "blue";

    public void move() {
        speed=5;
        System.out.println(name + " is moving at speed " + speed + " mph.");
    }
    public void stop(){
        speed=0;
        System.out.println(name + " has stopped.");
    }
    public void chargeBattery(){

        System.out.println(name + " 's battery is fully charged.");
    }
    public void checkBatteryLevel(){
        batteryLevel=100;
        System.out.println(name + " 's current battery level is " + batteryLevel +"%");
    }
    public void color(){
        color="blue";
        System.out.println(name + " color is " + color);
    }

}
