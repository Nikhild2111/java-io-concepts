import java.io.*;

/**
 * FileInputStream will read all bytes from input file
 * and FileOutputStream will write all bytes read from FileInputStream into output file.
 */
public class FileInputOutputStreamExample {
    public static void main(String... args) {
        try{
            InputStream fileInputStream = new FileInputStream("F:\\JAVA Programs\\java-io-concepts\\byte-streaming\\src\\input.txt");

            OutputStream fileOutputStream = new FileOutputStream("F:\\JAVA Programs\\java-io-concepts\\byte-streaming\\src\\output.txt");

            System.out.println(fileInputStream.available());


            byte[] bytes = fileInputStream.readAllBytes();//read all bytes from input file
            fileOutputStream.write(bytes);//write all bytes to the output file

            System.out.println(fileOutputStream);
            fileInputStream.close();
            fileOutputStream.close();

        } catch (IOException fileNotFoundException){
            fileNotFoundException.printStackTrace();
        }
    }
}
