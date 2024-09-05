package filehandling_kunal;

import java.io.*;

public class Main {
    public static void main(String[] args) {

        // creating
        try {
            File fo = new File("src/filehandling_kunal/new-file.txt");
            fo.createNewFile();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        // writing in the file
        try {
            FileWriter fw = new FileWriter("src/filehandling_kunal/new-file.txt");
            fw.write("my laptop is garbage tbh");
            fw.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        // reading from the file
        try (BufferedReader br = new BufferedReader(new FileReader("src/filehandling_kunal/new-file.txt"))){
            while(br.ready()) {
                System.out.println(br.readLine());
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        // creating for deleting
        try {
            File fo = new File("src/filehandling_kunal/random.txt");
            fo.createNewFile();
            if(fo.delete()) {
                System.out.println("Deleted " + fo.getName());
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }
}
