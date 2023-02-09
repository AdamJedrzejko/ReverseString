import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;

import util.Utils;

public class ReverseString {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(
                new InputStreamReader(System.in));
        BufferedWriter bufferedWriter;
        System.out.println("Enter absolute path for your files:");
        String path = reader.readLine();
        System.out.println("Enter input file name:");
        String inputFileName = reader.readLine();
        System.out.println("Enter output file name:");
        String outputFileName = reader.readLine();
        try {
            reader = new BufferedReader(new FileReader(path + inputFileName));
            bufferedWriter = Files.newBufferedWriter(Paths.get(path + outputFileName), StandardCharsets.UTF_8);
            String line = reader.readLine();
            while (line != null) {
                bufferedWriter.write(Utils.reverseString(line));
                bufferedWriter.newLine();
                line = reader.readLine();
            }
            bufferedWriter.close();
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}