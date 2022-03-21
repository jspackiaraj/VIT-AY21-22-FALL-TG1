import java.util.Scanner;
public class SwitchCaseExample {
    public static void main(String[] args) {
        // The program will print the color of light expected based on a keystroke
        // If the key pressed is :
        //1 Blue color light
        //2 Yellow color light
        //3 Green color light
        // ERROR Red Color Light (For all other keys)
        // 0 to exit program
        String strInputKeyStored; //Variable Declaration
        Scanner inputObject = new Scanner(System.in);
        boolean boolIsProgramRunning = true;
        do{
            System.out.print("Please enter a number (0 - 3) : ");
            strInputKeyStored = inputObject.next();
            System.out.println(strInputKeyStored.charAt(0));
            switch(strInputKeyStored.charAt(0)){
                case '0':
                    boolIsProgramRunning = false;
                    break;
                case '1':
                    System.out.println("Blue color light");
                    break;
                case '2':
                    System.out.println("Yellow color light");
                    break;
                case '3':
                    System.out.println("Green color light");
                    break;
                default:
                    System.out.println("Red color light");
                    break;
            }
        } while(boolIsProgramRunning);
        System.out.println("Program terminated by user .. Good Bye!!!");
        }
}
