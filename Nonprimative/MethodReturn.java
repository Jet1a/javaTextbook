package Nonprimative;

public class MethodReturn {
    public static void main(String[] args) {
        connectServer(130);
    }
    public static void connectServer(int ping){
        System.out.println("Ping = "+ping);
        if(ping>100){
            return;
        }
        System.out.println("Connected to server");
    }
}
