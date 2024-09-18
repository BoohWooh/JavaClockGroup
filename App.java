import java.util.Scanner;

class Clock{
    public float seconds;
    public float minutes;
    public float hours;

    public float SecondsToMinutes(float x){
        minutes = x/60;
        System.out.println("Seconds to Minutes: "+minutes);
        return 0;
    }

    public float SecondsToHours(float x){
        hours = x/3600;
        System.out.println("Seconds to Hours: "+hours);
        return 0;
    }

    public float MinutesToSeconds(float x){
        seconds = x*60;
        System.out.println("Minutes to Seconds: "+seconds);
        return 0;
    }

    public float MinutesToHours(float x){
        hours = x/60;
        System.out.println("Minutes to Hours: "+hours);
        return 0;
    }





}

public class App {
    public static void main(String[] args) throws Exception {
        Clock Time = new Clock();
        

        while (true){
            Scanner Intinput = new Scanner(System.in);
            Scanner input = new Scanner(System.in);
            System.out.println("(1) Seconds to Minutes");
            System.out.println("(2) Seconds to Hours");
            System.out.println("(3) Minutes to Seconds");
            System.out.println("(4) Minutes to Hours");
            System.out.println("(5) Hours to Seconds");
            System.out.println("(6) Hours to Minutes");
            System.out.println("(7) Exit");

            System.out.print("Choose the Conversion: ");
            int choice = Intinput.nextInt();

            switch (choice){
                case 1:
                    System.out.print("Enter the Value: ");
                    float seconds = input.nextFloat();
                    Time.SecondsToMinutes(seconds);
                    continue;
                    
                case 2:
                    System.out.print("Enter the Value: ");
                    float hours = input.nextFloat();
                    Time.SecondsToHours(hours);
                    continue;

                case 3:
                    System.out.println("Enter the Value: ");
                    float seconds = input.nextFloat();
                    Time.MinutesToSeconds(seconds);
                    continue;

                case 4:
                    System.out.println("Enter the Value; ");
                    float hours = input.nextFloat();
                    Time.MinutesToHours(hours);                    
                    continue;
                    
                case 5:
                    System.out.println("Thank you for using our program!");
                    
                    continue;
                case 6:
                    System.out.println("Thank you for using our program!");
                    
                    continue;
                case 7:
                    System.out.println("Thank you for using our program!");
                    Intinput.close();
                    input.close();
                    return;

                default:
                    System.out.println("Please Try again.");
                    
                    continue;
            }
        }
    }
}
