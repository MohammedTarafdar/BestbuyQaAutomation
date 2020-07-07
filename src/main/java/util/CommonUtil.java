package util;

public class CommonUtil {

    public static void delay(int timeUnit){
        try {
            Thread.sleep(timeUnit);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
