package oop.practice;

import java.util.List;

public class Main {
  public static void main(String[] args) {
    ReaderJSON reader = new ReaderJSON();
    List<Individual> individuals = reader.getIndividuals("java-classification/src/main/resources/input.json");

    for (Individual individual : individuals) {
      Universe universe = ClassifyIntoUniverse.check(individual);
      System.out.println("ID: " + individual.getId());
      System.out.println("Is Humanoid: " + individual.isHumanoid());
      System.out.println("Planet: " + individual.getPlanet());
      System.out.println("Age: " + individual.getAge());
      System.out.println("Traits: " + (individual.getTraits() != null ? String.join(", ", individual.getTraits()) : "No traits available"));
      System.out.println("Classified Universe: " + universe);
      System.out.println();
    }
  }
}

