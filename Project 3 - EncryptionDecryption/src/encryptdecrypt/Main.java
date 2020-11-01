package encryptdecrypt;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Main {
    public static void main(String[] args) {
        String mode = "enc";
        String alg = "shift";
        int key = 0;
        String data = "";
        String inputFileName = "";
        String outputFileName = "";
        String inputText = "";
        for (int i = 0; i < args.length; i += 2) {
            switch (args[i]) {
                case "-mode":
                    if (args[i + 1].equals("dec")) {
                        mode = "dec";
                    }
                    break;
                case "-key":
                    if (args[i + 1].matches(".*\\d.*")) {
                        key = Integer.parseInt(args[i + 1]);
                    }
                    break;
                case "-data":
                    if (!(args[i + 1].isEmpty())) {
                        data = args[i + 1];
                    }
                    break;
                case "-in":
                    if (!(args[i + 1].isEmpty())) {
                        inputFileName = args[i + 1];
                    }
                    break;
                case "-out":
                    if (!(args[i + 1].isEmpty())) {
                        outputFileName = args[i + 1];
                    }
                    break;
                case "-alg":
                    if (args[i + 1].equals("unicode")) {
                        alg = "unicode";
                    }
                    break;
            }
        }
        if(data.isEmpty() && !inputFileName.isEmpty()){
            try{
                inputText = new String(Files.readAllBytes(Paths.get(inputFileName)));
            }
            catch (IOException e){
                System.out.printf("Error: %s",e.getMessage());
            }
        } else {
            inputText = data;
        }

        if (mode.contentEquals("enc")) {
            if(outputFileName.isEmpty()){
                System.out.println(encrypt(inputText,alg,key));
            } else {
                try(FileWriter f = new FileWriter(outputFileName)){
                    f.write(encrypt(inputText,alg,key));
                } catch(IOException e){
                    System.out.printf("Error: %s",e.getMessage());
                }
            }
        } else {
            if(outputFileName.isEmpty()){
                System.out.println(decrypt(inputText,alg,key));
            } else {
                try(FileWriter f = new FileWriter(outputFileName)){
                    f.write(decrypt(inputText,alg,key));
                } catch(IOException e){
                    System.out.printf("Error: %s",e.getMessage());
                }
            }
        }
    }

    public static String encrypt(String text, String alg, int key){
        if (alg == "unicode") {
            return uniEncrypt(text,key);
        } else {return alphaEnc(text,key);}
    }

    public static String decrypt(String text, String alg, int key){
        if (alg == "unicode") {
            return uniDecrypt(text,key);
        } else {return alphaDec(text,key);}
    }

    // Unicode Shift Encrypt
    public static String uniEncrypt(String text, int key) {
        char[] textArray = text.toCharArray();
        for (int i = 0; i < textArray.length; i++) {
            int j = (textArray[i]) + key;
            textArray[i] = (char) j;
        }
        return String.copyValueOf(textArray);
    }
    // Unicode Shift Decrypt
    public static String uniDecrypt(String text, int key) {
        char[] textArray = text.toCharArray();
        for (int i = 0; i < textArray.length; i++) {
            int j = (textArray[i]) - key;
            textArray[i] = (char) j;
        }
        return String.copyValueOf(textArray);
    }

    // Alphabet Shift Encrypt
    public static String alphaEnc(String text, int key) {
        String letters1 = "abcdefghijklmnopqrstuvwxyz";
        char[] lettersArray1 = letters1.toCharArray();

        String letters2 = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        char[] lettersArray2 = letters2.toCharArray();

        char[] textArray = text.toCharArray();

        for (int i = 0; i < textArray.length; i++) {
            if (textArray[i] >= 97 && textArray[i] <= 122) {
                int j = (letters1.indexOf(textArray[i]) + key) % 26;
                textArray[i] = lettersArray1[j];
            } else if (textArray[i] >= 65 && textArray[i] <= 90) {
                int j = (letters2.indexOf(textArray[i]) + key) % 26;
                textArray[i] = lettersArray2[j];
            }
        }
        return String.copyValueOf(textArray);
    }

    // Alphabet Shift Dencrypt
    public static String alphaDec(String text, int key) {
        String letters1 = "abcdefghijklmnopqrstuvwxyz";
        char[] lettersArray1 = letters1.toCharArray();

        String letters2 = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        char[] lettersArray2 = letters2.toCharArray();

        char[] textArray = text.toCharArray();

        for (int i = 0; i < textArray.length; i++) {
            if (textArray[i] >= 97 && textArray[i] <= 122) {
                int j = (letters1.indexOf(textArray[i]) - key + 26) % 26;
                textArray[i] = lettersArray1[j];
            } else if (textArray[i] >= 65 && textArray[i] <= 90) {
                int j = (letters2.indexOf(textArray[i]) - key + 26) % 26;
                textArray[i] = lettersArray2[j];
            }
        }
        return String.copyValueOf(textArray);
    }

}

