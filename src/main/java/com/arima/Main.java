package com.arima;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    private static final int EXPECTED_PARTS_COUNT = 2;
    private static final int EXTENSION_INDEX = 1;
    private static final Set<String> VALID_FILE_EXTENSIONS;

    static {
        VALID_FILE_EXTENSIONS = new HashSet<>(Arrays.asList("txt"));
    }

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.print("Specify the name of the file you would like to create a vocabulary list for (type Q to quit): ");
        String fileName = scanner.nextLine();
        // Validate file name
        String[] splitFileName = fileName.split("\\.");
        if (splitFileName.length == EXPECTED_PARTS_COUNT && VALID_FILE_EXTENSIONS.contains(splitFileName[EXTENSION_INDEX])) {
            System.out.println("Successfully loaded " + fileName);

        } else {
            System.out.println("You have not specified a valid txt file");

        }
        return;

//            try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
//                int linesToCheck = 5; // number of lines to check
//                for (int i = 0; i < linesToCheck; i++) {
//                    String line = reader.readLine();
//                    if (line == null) {
//                        break; // end of file
//                    }
//                    for (char c : line.toCharArray()) {
//                        if (!Character.isISOControl(c)) {
//                            return false; // found a non-printable character
//                        }
//                    }
//                }
//                return true; // appears to be a text file
//            } catch (IOException e) {
//                // handle exception
//                return false;
//            }
//        }
//
//
//
//        String[] wordList = loadTextFromFile(filename);

//        // Initialize the classes that handle different parts of your application
//        FileHandler fileHandler = new FileHandler();
//        WebScraper webScraper = new WebScraper();
//        UserInteraction userInteraction = new UserInteraction();
//        Formatter formatter = new Formatter();
//
//        // Optional: GUI initialization if you choose to implement a graphical interface
//        // GUI gui = new GUI();
//
//        // Load vocabulary list from file
//        List<Word> vocabularyList = fileHandler.loadVocabularyFromFile("path/to/file.txt");
//
//        // Iterate through the vocabulary list and fetch details from Wiktionary
//        for (Word word : vocabularyList) {
//            String details = webScraper.scrapeDetails(word);
//            // Present options to user and let them select one
//            String selectedDetail = userInteraction.presentOptionsAndGetSelection(details);
//            word.setDetail(selectedDetail);
//        }
//
//        // Format the final vocabulary list and write to file
//        String formattedList = formatter.formatVocabularyList(vocabularyList);
//        fileHandler.writeToFile(formattedList, "path/to/output/file.txt");
//
//        // Notify the user of completion, etc.
//        userInteraction.notifyCompletion();
    }
}
