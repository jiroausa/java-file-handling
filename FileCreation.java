import java.io.File;
import java.io.IOException;

class FileCreation{
    public static void main(String[] args){

        File textFile = new File("main.txt");

       try{

        if(textFile.createNewFile()){
            System.out.println("padung pa");
            
        }else{
            System.out.println("naa na uys");
        }



       }catch (IOException e){
        System.out.println("Nag error sya sadge");
    }




    }
}