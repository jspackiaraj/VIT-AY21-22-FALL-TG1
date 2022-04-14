import java.util.Scanner;
public class Joinery1 {
    // Set the type of joinery, dimensions and material for the newly created object
    // Get the attributes of the joinery instance we created 
    // Get the area of the joinery
    public static void main(String[] args) {
        double widthOfElement;
        double heightOfElement;
        String typeOfElement, materialOfElement;
        Scanner inputObject = new Scanner(System.in);
        System.out.print("Enter the Width of the element (in m) : ");
        widthOfElement = inputObject.nextDouble();
        System.out.print("Enter the height of the element (in m) : ");
        heightOfElement = inputObject.nextDouble();
        // NOTE THE LINE BELOW
        // There will be an additional \n character which is ignored by nextDouble.
        // When you have a nextDouble followed by another method, please have an empty
        // nextLine()
        inputObject.nextLine();
        System.out.print("Enter the type of the Element (DOOR / WINDOW) : ");
        typeOfElement = inputObject.nextLine();
        System.out.print("Enter the Material of Element : ");
        materialOfElement = inputObject.nextLine();
        Joinery JoineryElement_001 = new Joinery(widthOfElement, heightOfElement, typeOfElement, materialOfElement);
        System.out.println("The area of the element is : " + JoineryElement_001.areaOfJoinery());
        System.out.println("Default Values which the object sets for itself");
        Joinery JoineryElement_002 = new Joinery();
        System.out.println("The area of the element is : " + JoineryElement_002.areaOfJoinery());

    }
}
