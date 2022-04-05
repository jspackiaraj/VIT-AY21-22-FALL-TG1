import java.io.File;
import java.util.*;
public class BasicFileOperations_CreateFile {
    // Write your answer below this line
    public static void main(String[] args){
        try{
            File FileObject = new File("C:\\JAVA_Files\\JAVAFilesDemo\\NewTextFile.txt");
            if(FileObject.createNewFile()){
                System.out.println("Done");
            }
        }catch (Exception e){
            System.out.println(e);
        }

    }
}
