

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Homework {
    public static void main (String[] args) throws Exception {
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
        String str = "";
        System.out.println("What is Bitcoin price today?");
        str = buffer.readLine();
        double bitcoin = Double.parseDouble(str);
        System.out.println("How much $ do you have?");
        str = buffer.readLine();
        double dollar = Double.parseDouble(str);
        double result = dollar / bitcoin;
        System.out.println("You can buy " + result + " BTC");
        buffer.close();
    }
}
