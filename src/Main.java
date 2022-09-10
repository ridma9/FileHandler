import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Main {

    public static void main(String[] args) {
        try {
            FileHandler fileHandler = new FileHandler("E:\\Coding\\FileHandler\\src\\text.txt");

            Student student = new Student("Vimukthi H",30);
            Student std2 = new Student("Kasun",25);
            //fileHandler.WriteFile(student);
            //fileHandler.WriteFile(std2);
            System.out.println(fileHandler.ReadFile());

            Student foundStudent=fileHandler.getStudentByName("Kaun");
            System.out.println(foundStudent);

        } catch (IOException e) {
            e.printStackTrace();
        }

    }


}