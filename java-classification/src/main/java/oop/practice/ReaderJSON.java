package oop.practice;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;

public class ReaderJSON {
    public void printJSON(String path) {
        // Create an instance of ObjectMapper
        ObjectMapper mapper = new ObjectMapper();

        try {
            // Specify the path to the JSON file
            File inputFile = new File(path);

            // Read the JSON file and parse it into a JsonNode
            JsonNode jsonData = mapper.readTree(inputFile);

            // Print the entire JSON data to the console
            System.out.println(jsonData.toPrettyString());

        } catch (IOException e) {
            // Handle any errors that might occur while reading the file
            System.err.println("An error occurred while reading the JSON file: " + e.getMessage());
        }
    }
}
