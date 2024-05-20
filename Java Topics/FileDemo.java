import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileDemo{
    public static void main(String[] args)throws IOException {
        FileWriter fw = null;
        try{
            fw = new FileWriter("Deepak.txt",true);
            fw.write("AnandKumar D is a Software Developer in Zoho.\n");
            fw.write("He is good programming language skill.\n");
            fw.write("Programming skills are html,css,Java Script,Java,C programming ,Python,ReactJs,SQL,Bootsrap..ext.\n");
        }
        catch(IOException e){
            e.printStackTrace();
        }
        finally{
            fw.close();
        }
        System.out.println("close done.....!");
        //------------File Reader------------------
        FileReader fr = null;
        try{
             fr = new FileReader("Deepak.txt");
            Scanner scanner =new Scanner(fr);
            while(scanner.hasNextLine()){
                System.out.println(scanner.nextLine());
            }
        }catch(FileNotFoundException e){
            System.out.println(e);
        }
        finally{
            fr.close();
        }
    }
}