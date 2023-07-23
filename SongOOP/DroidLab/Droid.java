package SongOOP.DroidLab;

public class Droid {
    private String name;
    private int battery;
    private String task;

    public Droid(String name) {
        this.name = name;
        battery = 100;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBattery() {
        return battery;
    }

    public void setBattery(int battery) {
        this.battery = battery;
    }

    public String toString() {
        return ("Droid - " + this.getName() + " : Battery " + Integer.toString(getBattery()) + " % ");
    }

    public void performTask(String task) {
        if (battery <= 100) {
            battery -= 10;
            System.out.println("Droid " + name + " is performing - " + task + " | " + battery + "%");
            if (battery == 0) {
                System.out.println("Droid " + name + " is running out of battery");
            }
        }
    }

    public void chargeBattery(int battery) {
        if (battery <= 100) {
            battery += this.battery;
            if (battery >= 100)
                battery = 100;
            System.out.println("Droid - " + name + " : " + battery);
            setBattery(battery);
        }
    }
    // public void displayDroid(){
    // System.out.println("Name : " + name + ", Battery : "+battery);
    // }
}
