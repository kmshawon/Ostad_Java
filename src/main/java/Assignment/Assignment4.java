package Assignment;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Assignment4 {

    static double Height_to_meter(int feet, int inches) {
        //Unit conversion:
        //
        //1 inch = 0.0254m
        //
        //1 ft = 12inch
        double Meter = 0;
        Meter = (feet*12*0.0254) + (inches*0.0254);
        return Meter;

    }

    public static void printStars(int count) {
        if (count == 0) return;
        System.out.print("*");
        printStars(count - 1);
    }


    static Void Final_Output(double BMI){

        printStars((int) BMI);
        System.out.println("\n");
        System.out.println("Your BMI is: " + BMI);
        if(BMI > 29){
            System.out.println("Category: Obese");
        } else if (BMI > 24) {
            System.out.println("Category: Overweight");
        } else if (BMI > 18.4) {
            System.out.println("Category: Normal Weight");
        }
        else {
            System.out.println("Category: Underweight");
        }
        System.out.println("\n");
        printStars((int) BMI);
    return null;

    }

    static double BMI(double weight, double meter)
    {
        double BMI = weight / (meter*meter);
        return BMI;
    }
    public static void main(String[] args) {
        Scanner Input=new Scanner(System.in);
        System.out.println("Enter Your Weight ");
        double weight=Input.nextDouble();
        Input.nextLine();
        System.out.println("Enter Your Height ");
        String height=Input.nextLine();

        Pattern pattern = Pattern.compile("(\\d+)\\s*ft\\s*(\\d+)\\s*in", Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(height);

        int feet=0;
        int inches=0;

        if (matcher.find()) {
            feet = Integer.parseInt(matcher.group(1));   // Extracts feet
            inches = Integer.parseInt(matcher.group(2)); // Extracts inch
        }
        double meter =Height_to_meter(feet,inches);

        double BMI = BMI(weight,meter);
        Final_Output(BMI);


    }




}
