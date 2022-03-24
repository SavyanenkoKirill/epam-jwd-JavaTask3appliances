package main.java.by.tc.task01.service.reader;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public final class ApplianceBaseReader {
    private ApplianceBaseReader() {
    }

    public static List<String> readApplianceBase(String fileName) throws IOException {
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(fileName))) {
            List<String> applianceLines = new ArrayList<>();
            String currLine = bufferedReader.readLine();
            while (currLine != null) {
                if (!currLine.isEmpty()) {
                    applianceLines.add(currLine);
                }
                currLine = bufferedReader.readLine();
            }
            return applianceLines;
        }
    }

}
