import java.io.File;
import java.io.IOException;

public class Duplicator {

    public static void main(String[] arg) {

    }

    public static String path = "//Users//jan//SUT.txt";

    public int duplicateCounter(int number) {
        return number * 2;
    }


    public void createFile() {
        try {
            File output = new File(path);
            boolean isFileCreated = output.createNewFile();
            if (isFileCreated) {
                System.out.println("File successfully created!");
            } else {
                System.out.println("File already exist!");
            }
        } catch (IOException e) {
            System.out.println("Exception Occurred:");
            e.printStackTrace();
        }
    }


    public void deleteFile() {
        try {
            File output = new File(path);

            if (output.delete()) {
                System.out.println(output.getName() + " is deleted!");
            } else {
                System.out.println("Delete failed");
            }
        } catch (Exception e) {
            System.out.println("Exception occurred");
            e.printStackTrace();
        }
        /**
         * TEST DIRECTORY en TEST CLASS
         *
         * 1. Maak een test directory aan.
         * 2. Maak van deze directory een Test Resource Folder wordt
         *
         *  3. Maak een test class aan.
         *
         */

        /**
         *
         * 1. Maak een SUT aan in je test class.
         *
         * 2. Maak een test method aan waarbij je de onderstaande
         *    functie duplicateCounter() test
         *
         * 3. Run de test en bekijk het resultaat
         *
         * 4. Maak de functie duplicateCounter() af zodat de test wel werkt.
         *
         */
        public int duplicateCounter ( int number){
            return number * 2;
        }


    }


}

