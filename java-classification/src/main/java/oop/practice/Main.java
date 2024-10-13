package oop.practice;

import java.util.List;

public class Main {
  public static void main(String[] args) {
    ReaderJSON reader = new ReaderJSON();
    List<Individual> individuals = reader.getIndividuals("java-classification/src/main/resources/input.json");

    for (Individual individual : individuals) {
      System.out.println("ID: " + individual.getId());
      System.out.println("Is Humanoid: " + individual.isHumanoid());
      System.out.println("Planet: " + individual.getPlanet());
      System.out.println("Age: " + individual.getAge());

      List<String> traits = individual.getTraits();
      if (traits != null) {
        System.out.println("Traits: " + String.join(", ", traits));
      } else {
        System.out.println("Traits: No traits available");
      }

      System.out.println();
    }
  }
}

