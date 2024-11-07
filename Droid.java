public class Droid{
    String name;
    int batteryLevel = 100; //included to show understanding of constants

    public Droid(String droidName){
        name - droidName;
    }

    public String toString(){
        //included toString method to show understanding of return types
        return "Hello, I'm the droid " + name;
    }

    public void performTask(String task){
        System.out.println(name + " is performing task: " + task);
        batteryLevel -=10;
    }

    public void energyReport(){
        System.out.println("Battery level: " + batteryLevel);
    }

    public void energyTransfer(Droid droid1, Droid droid2){
        //included Droid datatype in parameters to demonstrate understanding of classes 
        droid1.batteryLevel = droid2.batteryLevel +10;
        //inlcuded dot notation to demo understanding of how to reference variables 
        droid2.batteryLevel -= 10; //manipulation of variables within an instance of class
        System.out.println("Battery Level " + droid1.name + ":" + droid1.batteryLevel + ".  " + "Battery Level " + droid2.name + ":" + droid2.batteryLevel);
    }
}