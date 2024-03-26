import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) {
        Date thisMoment = new Date();
        long millisec = thisMoment.getTime();
        System.out.println(millisec/1000);

        Date obj = new Date();
        System.out.println((obj.getTime()/1000));
    }
}
