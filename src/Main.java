import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
System.out.println("Hello World");
Robot myRobot = new Robot();
myRobot.move();
myRobot.checkBatteryLevel();
myRobot.stop();
myRobot.chargeBattery();
myRobot.color();

        }
    }