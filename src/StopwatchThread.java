import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StopwatchThread {
    public static void main(String[] args) throws IOException {
        InputStreamReader in = new InputStreamReader(System.in);
        BufferedReader reader = new BufferedReader(in);
        //create and run thread
        Stopwatch stopwatch = new Stopwatch();
        stopwatch.start();
        //read a string
        reader.readLine();
        stopwatch.interrupt();
        //close streams
        reader.close();
        in.close();
    }

    public static class Stopwatch extends Thread {
        private int seconds = 0;

        public void run() {
            Thread current = Thread.currentThread();
            while (!current.isInterrupted()) {
                try {
                    Thread.sleep(1000);
                    seconds++;
                } catch (InterruptedException e) {
                    current.interrupt();
                    System.out.println(seconds);
                }
            }
        }
    }
}
