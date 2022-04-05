import java.io.*;
public class FirstFile {
    public static void main(String[] args) {
        //Create a file Called TG1_NewFile.txt
        // in the directory C:\JAVA_Files\JAVAFilesDemo
        // (Change the directory as per your machine's directory structure.
        try{
            File fsFileObject = new File("C:\\JAVA_Files\\JAVAFilesDemo\\TG1_NewFile.txt");
            if (fsFileObject.exists()){
                System.out.println("File Exists ..");
            } else {
                System.out.println("File Does not exist ..");
                fsFileObject.createNewFile();
            }
        } catch (Exception e){
            System.out.println(e);
        }
    }
}
