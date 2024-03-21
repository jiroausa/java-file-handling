import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class FileReading {
    
    public static void main (String[] args){

        File textFile = new File ("main.txt");

        try{
            Scanner sc = new Scanner (textFile);

            while(sc.hasNextLine()){
                System.out.println(sc.nextLine());

            }

            sc.close();

        }catch (IOException e) {
            System.out.println("nag error sya sadge");
        }

    }
}