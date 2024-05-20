import java.io.File;

public class FileCreationDemo {
    public static void main(String[] args) {
        String fileName = "Deepak.txt";
        File f = new File(fileName);
        try {
            if (f.createNewFile()) {
                System.out.println("File is created...!");
            } else {
                System.out.println("File is already created....!");
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}