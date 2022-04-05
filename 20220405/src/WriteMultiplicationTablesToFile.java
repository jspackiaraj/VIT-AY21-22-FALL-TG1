import java.io.*;
public class WriteMultiplicationTablesToFile {
    public static void main(String[] args) {
        //Create a file Called TG1_NewFile.txt
        // in the directory C:\JAVA_Files\JAVAFilesDemo
        // (Change the directory as per your machine's directory structure.
        try{
            FileWriter Writer = new FileWriter("C:\\JAVA_Files\\JAVAFilesDemo\\TG1_NewFile.txt");
            int intMultTableToPrint = 12;
            int intMultTablePrintFrom = 1;
            int intMultTablePrintTill = 12;
            Writer.write("Multiplication Table of " + intMultTableToPrint + "\n");
            for(int intI = intMultTablePrintFrom; intI <= intMultTablePrintTill; intI++){
                Writer.write(intI + " * " + intMultTableToPrint + " = " + intI * intMultTableToPrint + "\n");
            }
            Writer.close();
        } catch (Exception e){
            System.out.println(e);
        }
    }
}
