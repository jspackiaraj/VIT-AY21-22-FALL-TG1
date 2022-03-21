public class IntroductionToMathFncs {
    public static void main(String[] args) {
        double dblAngleInDegrees = 45.0;
        double dblAngleInRadians;
        double dblValueOfSine;
        dblAngleInRadians = Math.toRadians(dblAngleInDegrees);
        System.out.printf("The value of %f Degrees is %f radians.\n", dblAngleInDegrees, dblAngleInRadians);
        dblValueOfSine = Math.sin(dblAngleInRadians);
        System.out.printf("The value of sin %f Degrees is %f ..\n", dblAngleInDegrees, dblValueOfSine);
        System.out.printf("The value of sin-1 (%f)  is %f ..\n", dblValueOfSine, Math.asin(dblValueOfSine));
    }
}
