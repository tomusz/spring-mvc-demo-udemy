package sda.projekt.calezajecia.Validator;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Buffer {

    private static final String REGEX = ";";

    public static ObjectFromFile[] read(String pathTo, int rules) throws IOException {
// przeniesc do innej klasy



        int i = 0;
        ObjectFromFile[] objectFromFiles = new ObjectFromFile[rules];

        BufferedReader bufferedReader = new BufferedReader(new FileReader(pathTo));


        String line = null;
        while ((line = bufferedReader.readLine()) != null) {
            String[] split = line.split(REGEX);

            ObjectFromFile oFromFile = new ObjectFromFile(split[0], split[1], Integer.parseInt(split[2]));


            objectFromFiles[i++] = oFromFile;
        }

        return objectFromFiles;

    }

}
