package oop.practice;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.File;
import java.io.IOException;
import java.util.List;

public class View {

    private final ObjectMapper objectMapper;

    public View() {
        this.objectMapper = new ObjectMapper();
    }

    public void writeToJsonFiles(List<Individual> individuals) {
        try {
            File outputDir = new File("output");

            List<Individual> starWarsIndividuals = individuals.stream().filter(ind -> Universe.StarWars.equals(ClassifyIntoUniverse.check(ind))).toList();

            List<Individual> hitchhikerIndividuals = individuals.stream().filter(ind -> Universe.Hitchhiker.equals(ClassifyIntoUniverse.check(ind))).toList();

            List<Individual> marvelIndividuals = individuals.stream().filter(ind -> Universe.Marvel.equals(ClassifyIntoUniverse.check(ind))).toList();

            List<Individual> lordOfTheRingsIndividuals = individuals.stream().filter(ind -> Universe.LordOfTheRings.equals(ClassifyIntoUniverse.check(ind))).toList();

            objectMapper.writeValue(new File(outputDir, "star_wars_individuals.json"), starWarsIndividuals);
            objectMapper.writeValue(new File(outputDir, "hitchhiker_individuals.json"), hitchhikerIndividuals);
            objectMapper.writeValue(new File(outputDir, "marvel_individuals.json"), marvelIndividuals);
            objectMapper.writeValue(new File(outputDir, "lord_of_the_rings_individuals.json"), lordOfTheRingsIndividuals);

        } catch (IOException e) {
            System.err.println("An error occurred: " + e.getMessage());
        }
    }
}
