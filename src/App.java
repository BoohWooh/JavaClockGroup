import java.util.Scanner;

class Clock{
    public float seconds;
    public float minutes;
    public float hours;

    public void SecondsToMinutes(float x){
        minutes = x/60;
        System.out.println("Seconds to Minutes: "+minutes);
    }

    public void SecondsToHours(float x){
        hours = x/3600;
        System.out.println("Seconds to Hours: "+hours);
    }
    // Conversion Formula of Minutes to Seconds
    public void MinutesToSeconds(float x){
        seconds = x*60;
        System.out.println("Minutes to Seconds: "+seconds);
    }
    // Conversion Formula of Minutes to Hours
    public void MinutesToHours(float x){
        hours = x/60;
        System.out.println("Minutes to Hours: "+hours);

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
                    break;
                    
                case 2:
                    System.out.print("Enter the Value: ");
                    float hours = input.nextFloat();
                    Time.SecondsToHours(hours);
                    break;

                case 3:
                    // Showing Result of the Conversion
                    System.out.println("Enter the Value: ");
                    float minutes = input.nextFloat();
                    Time.MinutesToSeconds(minutes);
                    break;

                case 4:
                    // Showing Result of the Conversion
                    System.out.println("Enter the Value; ");
                    float minutes1 = input.nextFloat();
                    Time.MinutesToHours(minutes1);                    
                    break;
                    
                case 5:
                    System.out.println("Thank you for using our program!");
                    
                    break;
                case 6:
                    System.out.println("Thank you for using our program!");
                    
                    break;
                case 7:
                    System.out.println("Thank you for using our program!");
                    Intinput.close();
                    input.close();
                    return;

                default:
                    System.out.println("Please Try again.");
                    
                    continue;
            }// Added a choice to start again
            System.out.print("Do you want to perform another conversion? (Y/N): ");
            char choiceAgain = input.next().charAt(0);
            if (choiceAgain == 'Y' || choiceAgain == 'y') {
                continue;
            } else {
                System.out.println("Thank you for using our program!");
                Intinput.close();
                input.close();
                return;
            }
        }
    }
}
