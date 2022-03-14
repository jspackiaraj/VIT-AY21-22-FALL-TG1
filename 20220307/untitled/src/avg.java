import java.util.Scanner;
public class avg {
    public static void main(String args[]){
            Scanner sc = new Scanner(System.in);
            System.out.println("How many numbers you want to enter\n");
            int n = sc.nextInt();
            float[] a = new float[n];
            System.out.println("Enter the numbers\n");
            for(int i=0;i<a.length;i++){
                a[i]= sc.nextInt();
            }
            float sum=0;
            for(int i=0;i<a.length;i++) {
                sum = sum+a[i];
            }
            System.out.println("The sum of the numbers which you enter is:  "+sum);
            float max=a[0];

            for(int i=0;i<a.length;i++) {

                if(a[i]>max) {
                    max = a[i];
                }
            }
            System.out.println("Greatest number that you enter:  "+max);
            float mean =sum/n;
            System.out.println("The mean of the numbers that you enter is:   "+mean);
        }
    }
