import java.io.*;

import util.Utils;

public class ReverseString {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(
                new InputStreamReader(System.in));
        File file = null;
        BufferedWriter bufferedWriter = null;
        FileWriter fileWriter = null;
        System.out.println("Enter absolute path for your files:");
        String path = reader.readLine();
        System.out.println("Enter input file name:");
        String inputFileName = reader.readLine();
        System.out.println("Enter output file name:");
        String outputFileName = reader.readLine();
        try {
            reader = new BufferedReader(new FileReader(path + inputFileName));
            file = new File(path + outputFileName);
            fileWriter = new FileWriter(file);
            bufferedWriter = new BufferedWriter(fileWriter);
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