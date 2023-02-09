package util;

public class Utils {

    public static String reverseString(String inputString) {
        byte[] inputAsByteArray = inputString.getBytes();
        byte[] outputByteArray = new byte[inputAsByteArray.length];
        for (int i = 0; i < inputAsByteArray.length; i ++) {
            outputByteArray[i] = inputAsByteArray[inputAsByteArray.length - i - 1];
        }
        return new String(outputByteArray);
    }
}
