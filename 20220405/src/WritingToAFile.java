import java.io.*;
import java.lang.reflect.WildcardType;

public class WritingToAFile {
    public static void main(String[] args) {
        //Create a file Called TG1_NewFile.txt
        // in the directory C:\JAVA_Files\JAVAFilesDemo
        // (Change the directory as per your machine's directory structure.
        try{
            FileWriter Writer = new FileWriter("C:\\JAVA_Files\\JAVAFilesDemo\\TG1_NewFile.txt");
            Writer.write("// End of File");
            Writer.close();
            } catch (Exception e){
                System.out.println(e);
            }

    }
}
