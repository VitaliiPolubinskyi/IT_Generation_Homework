

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;

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
        MathContext context = new MathContext(6, RoundingMode.HALF_UP);
        BigDecimal numberOfBitcoins = new BigDecimal(result, context);
        System.out.println("You can buy " + numberOfBitcoins + " BTC");
        buffer.close();
    }
}
