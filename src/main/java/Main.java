import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        Thread t = new LoadBalancer(8080);
        t.start();
    }

    public static String chooseBackend(String[] serverList) {
        return serverList[0];
    }
}
