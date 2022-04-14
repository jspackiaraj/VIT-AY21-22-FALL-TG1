public class Joinery {
    //Width, height, door or window, material
    double width, height;
    String joineryType, joineryMaterial;
    //PUTTER Method (Constructors)
    public static void main(String[] args) {
        // Do nothing here
    }
    public Joinery(double newWidth, double newHeight, String newJoineryType, String newJoineryMaterial){
        width = newWidth;
        height = newHeight;
        joineryType = newJoineryType;
        joineryMaterial = newJoineryMaterial;
    }
    public Joinery(){
        width = 0;
        height = 0;
        joineryType = "DOOR";
        joineryMaterial = "PROCESSED WOOD";
    }
    // GETTER method (Observer Methods)

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public String getJoineryType() {
        return joineryType;
    }
    public String getJoineryMaterial() {
        return joineryMaterial;
    }
    public double areaOfJoinery() {
        return width * height;
    }
}
