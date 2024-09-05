package filehandling_kunal;

import java.io.*;

public class FileHandling {

    public static void main(String[] args) {

//        try(InputStreamReader isr = new InputStreamReader(System.in)) {
//            System.out.print("Enter some letters: ");
//            int letters = isr.read();
//
//            while(isr.ready()) {
//                System.out.println((char) letters);
//                letters = isr.read();
//            }
//
////            isr.close();
//            System.out.println();
//        } catch (IOException e) {
//            System.out.println(e.getMessage());
//        }


//        try(FileReader fr = new FileReader("src/filehandling_kunal/note.txt")) {
//            int letters = fr.read();
//
//            while(fr.ready()) {
//                System.out.print((char) letters); // it shows ascii values without (char) conversion
//                letters = fr.read();
//            }
//
////            isr.close();
//            System.out.println();
//        } catch (IOException e) {
//            System.out.println(e.getMessage());
//        }
//
//
//
//        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) { // convert system.in (byte stream) into character stream
//            // Process -> byte to char stream and then reading char stream
//
//            System.out.println("You typed: " + br.readLine());
//        } catch (IOException e) {
//            System.out.println(e.getMessage());
//        }
//
//
//        try (BufferedReader bfr = new BufferedReader(new FileReader("src/filehandling_kunal/note.txt"))) { // convert system.in (byte stream) into character stream
//            // Process -> byte to char stream and then reading char stream
//            while (bfr.ready()) {
//                System.out.println(bfr.readLine());
//
//            }
//        } catch (IOException e) {
//            System.out.println(e.getMessage());
//        }

        // output
//        OutputStream os = System.out;
////        os.write(🥹); // range exceeded
//
//        System.out.println();
//
//        try (OutputStreamWriter osw = new OutputStreamWriter(System.out)) {
//            osw.write("hello wowowowoowow");
//            osw.write(97);
//            osw.write(10);
//            osw.write('A');
//            osw.write('\n');
//            char[] arr = "hello world".toCharArray();
//            osw.write(arr);
////            osw.write(🥹);
//        } catch (IOException e) {
//            System.out.println(e.getMessage());
//        }


        try (FileWriter fw = new FileWriter("src/filehandling_kunal/note.txt", true)) { // true for appending onto existing files
//            fw.write("hello world!");
            fw.write("\n this should be appended");
//            osw.write(🥹);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }


        try (BufferedWriter bw = new BufferedWriter(new FileWriter("src/filehandling_kunal/note.txt", true))) { // true for appending onto existing files
            bw.write("hello");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }


    }
}
