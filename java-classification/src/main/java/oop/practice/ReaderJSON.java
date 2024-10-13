package oop.practice;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ReaderJSON {
    public List<Individual> getIndividuals(String path) {
        ObjectMapper mapper = new ObjectMapper();
        List<Individual> individualsList = new ArrayList<>();

        try {
            File inputFile = new File(path);
            JsonNode jsonData = mapper.readTree(inputFile);

            for (JsonNode node : jsonData.get("data")) {
                Individual individual = mapper.treeToValue(node, Individual.class);
                individualsList.add(individual);
            }
        } catch (IOException e) {
            System.err.println("An error occurred. File not found or no 'data' key found within the file: " + e.getMessage());
        }
        return individualsList;
    }
}
