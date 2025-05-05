package chapter15;

import chapter13.B;

import java.io.*;
import java.util.StringTokenizer;

public class IOClass {
    public static void readFromFileCharacterByCharacter(String fileName) {
        try (FileReader fr = new FileReader(fileName)) {
            int ch = fr.read();
            while (ch != -1) {
                System.out.print((char) ch);
                ch = fr.read();
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found!");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void readFromFileLineByLine(String fileName) {
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line = br.readLine();
            while (line != null) {
                System.out.println(line);
                line = br.readLine();
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found!");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void writeToFile(String fileName) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(fileName))) {
            bw.write("Hello, World!");
            bw.newLine();
            bw.write("This is a test!");
            bw.flush();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void copyFile(String source, String destination) {
        try(
                BufferedReader br = new BufferedReader(new FileReader(source));
                BufferedWriter bw = new BufferedWriter(new FileWriter(destination))
                ) {

            String line = br.readLine();
            while (line != null) {
                bw.write(line);
                bw.newLine();
                line = br.readLine();
            }
            bw.flush();
        } catch (FileNotFoundException e) {
            System.out.println("File not found!");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void readFromKeyboard() {
        try (
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in))
                ) {

            String line = br.readLine();
            while (line != null) {
                System.out.println(line);
                line = br.readLine();
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void listNamesFromFile(String fileName) {
        try(
                BufferedReader br = new BufferedReader(new FileReader(fileName))
                ) {

            String line = br.readLine();
            while (line != null) {
                StringTokenizer st = new StringTokenizer(line);
                while (st.hasMoreTokens()) {
                    System.out.println("Hello " + st.nextToken());
                }
                line = br.readLine();
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found!");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void listNumbersFromFile(String fileName) {
        try(
                BufferedReader br = new BufferedReader(new FileReader(fileName))
        ) {

            String line = br.readLine();
            while (line != null) {
                StringTokenizer st = new StringTokenizer(line);
                while (st.hasMoreTokens()) {
                    System.out.println(Integer.parseInt(st.nextToken()) + 5);
                }
                line = br.readLine();
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found!");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void main(String[] args) {
        // readFromFileCharacterByCharacter("/Users/yosephabate/classfile.txt");
        //readFromFileLineByLine("/Users/yosephabate/classfile.txt");
        //writeToFile("/Users/yosephabate/writefile.txt");
        //copyFile("/Users/yosephabate/classfile.txt", "/Users/yosephabate/newfile.txt");
        //readFromKeyboard();
        //listNamesFromFile("/Users/yosephabate/names.txt");
        listNumbersFromFile("/Users/yosephabate/grades.txt");
    }
}
