package Assignment;
import java.util.Scanner;
public class Asssignment2 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        // 1. Write your code for taking `principal amount`, `rate of interest`
        int PrincipalAmount;
        PrincipalAmount=sc.nextInt();
        double rateOfInterest=sc.nextDouble();

        // 2. Take time input and store it in `strTime`
        String strTime=sc.next();

        String numericPart;
        numericPart = strTime.replaceAll("[^\\d.]", "");



        // 3. Find the numeric part from the time using substring or other method, and store it in the variable named `time`
        double time = Double.parseDouble(numericPart);

        double year;

        if(strTime.charAt(strTime.length()-1) == 'm'){
            year = time / 12.0;
        }
        else{
            year = time;
        }

        System.out.println(year);
        // 4. Use the `year` directly in formula and do the rest of the code
        double TotalIbterest = ((PrincipalAmount*rateOfInterest*year)/100);
        System.out.println(TotalIbterest);

    }



}
