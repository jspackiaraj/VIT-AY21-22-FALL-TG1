import java.io.File;
import java.util.Scanner;
public class ReadingFromFIle {
    public static void main(String[] args) {
        //Create a file Called TG1_NewFile.txt
        // in the directory C:\JAVA_Files\JAVAFilesDemo
        // (Change the directory as per your machine's directory structure.
        try{
            File fsFileObject = new File("C:\\JAVA_Files\\JAVAFilesDemo\\TG1_NewFile.txt");
            Scanner Reader = new Scanner(fsFileObject);
            while(Reader.hasNextLine()){
                String data = Reader.nextLine();
                System.out.println(data);
            }

        } catch (Exception e){
            System.out.println(e);
        }

    }
}
