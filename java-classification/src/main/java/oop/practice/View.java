package oop.practice;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class View {

    private final ObjectMapper objectMapper;

    public View() {
        this.objectMapper = new ObjectMapper();
    }

    public void writeToJsonFiles(List<Individual> individuals) {
        File outputDir = new File("output");

        List<Individual> starWarsIndividuals = new ArrayList<>();
        List<Individual> hitchhikerIndividuals = new ArrayList<>();
        List<Individual> marvelIndividuals = new ArrayList<>();
        List<Individual> lordOfTheRingsIndividuals = new ArrayList<>();

        for (Individual individual : individuals) {
            if (individual.getClassifiedUniverse().equals("Star Wars")) {
                starWarsIndividuals.add(individual);
            } else if (individual.getClassifiedUniverse().equals("Hitchhiker")) {
                hitchhikerIndividuals.add(individual);
            } else if (individual.getClassifiedUniverse().equals("Marvel")) {
                marvelIndividuals.add(individual);
            } else if (individual.getClassifiedUniverse().equals("Lord of the rings")) {
                lordOfTheRingsIndividuals.add(individual);
            }
        }

        try {

            objectMapper.writeValue(new File(outputDir, "star_wars_individuals.json"), starWarsIndividuals);
            objectMapper.writeValue(new File(outputDir, "hitchhiker_individuals.json"), hitchhikerIndividuals);
            objectMapper.writeValue(new File(outputDir, "marvel_individuals.json"), marvelIndividuals);
            objectMapper.writeValue(new File(outputDir, "lord_of_the_rings_individuals.json"), lordOfTheRingsIndividuals);

        } catch (IOException e) {
            System.err.println("An error occurred: " + e.getMessage());
        }
    }
}
