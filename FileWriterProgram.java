import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterProgram {
    public static void main (String [] args){
        File textfile = new File("main.txt");

        try {
            FileWriter wrtr = new FileWriter(textfile);
            wrtr.write("nag sigi nlng");
            wrtr.close();
            System.out.println("printed successfully");

        }catch (Exception e){
            System.out.println("Nag error sya");
            e.printStackTrace();
        }
        }
    }
