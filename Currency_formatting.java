/*
Given a double-precision number, , denoting an amount of money, use the NumberFormat class' getCurrencyInstance method to convert  into the US, Indian, Chinese, and French currency formats. Then print the formatted values as follows:

US: formattedPayment
India: formattedPayment
China: formattedPayment
France: formattedPayment
where  is  formatted according to the appropriate Locale's currency.
*/
import java.util.*;
import java.text.*;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();
        Locale in=new Locale("en","IN");
        NumberFormat us=NumberFormat.getCurrencyInstance(Locale.US);
       
        NumberFormat india=NumberFormat.getCurrencyInstance(in);
      
        NumberFormat china=NumberFormat.getCurrencyInstance(Locale.CHINA);
        
        NumberFormat france=NumberFormat.getCurrencyInstance(Locale.FRANCE);
        
        
        
        System.out.println("US: " +  us.format(payment));
        System.out.println("India: " + india.format(payment));
        System.out.println("China: " + china.format(payment));
        System.out.println("France: " + france.format(payment));
    }
}
