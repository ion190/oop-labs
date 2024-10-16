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
                Individual individual = new Individual();

                // add id to individual
                individual.setId(node.get("id").asInt());

                // add humanoid to individual
                if (!node.has("isHumanoid") || node.get("isHumanoid").isNull()) {
                    individual.setHumanoid(null);
                } else {
                    individual.setHumanoid(node.get("isHumanoid").asBoolean());
                }

                // add planet to individual
                if (!node.has("planet") || node.get("planet").isNull()) {
                    individual.setPlanet(null);
                } else {
                    individual.setPlanet(node.get("planet").asText());
                }

                // add age to individual
                if (!node.has("age") || node.get("age").isNull()) {
                    individual.setAge(null);
                } else {
                    individual.setAge(node.get("age").asInt());
                }

                // add traits to individual
                if (!node.has("traits") || node.get("traits").isNull()) {
                    individual.setTraits(null);
                } else {
                    List<String> traits = new ArrayList<>();
                    for (JsonNode traitNode : node.get("traits")) {
                        traits.add(traitNode.asText());
                    }
                    individual.setTraits(traits);
                }

                // add individual to the list
                individualsList.add(individual);
            }
        } catch (IOException e) {
            System.err.println("An error occurred. File not found or no 'data' key found within the file: " + e.getMessage());
        }
        return individualsList;
    }
}
