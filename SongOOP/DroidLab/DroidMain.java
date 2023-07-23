package SongOOP.DroidLab;

public class DroidMain {
    public static void main(String[] args) {
        Droid droid1 = new Droid("Siri");
        Droid droid2 = new Droid("Alba");
        // droid1.displayDroid();
        // droid2.displayDroid();
        System.out.println(droid1);
        droid1.performTask("Cleaning");
        System.out.println(droid1);
        droid1.setBattery(10);
        droid1.performTask("Run");
        System.out.println(droid1);
        droid2.performTask("Water the plant");
        droid1.chargeBattery(50);
        droid1.chargeBattery(60);
        System.out.println(droid2);
    }
}
