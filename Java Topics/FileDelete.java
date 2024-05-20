
import java.io.File;

public class FileDelete {
    public static void main(String[] args) {
        try{
            File file = new File("Deepak.txt");
            if (file.delete()) {
                System.out.println("File deleted successfully");
            } else {
                System.out.println("File not deleted");
            }
        }catch(Exception e){
            e.printStackTrace();
        }
    
        
    }
}
