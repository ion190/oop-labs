package oop.practice;

import java.util.List;

public class ClassifyIntoUniverse {

    public static Universe check(Individual individual) {
        if ((!individual.isHumanoid() && "Kashyyyk".equals(individual.getPlanet()) && individual.getAge() >= 0 && individual.getAge() <= 400 && individual.getTraits() != null && individual.getTraits().containsAll(List.of("HAIRY", "TALL"))) || (!individual.isHumanoid() && "Endor".equals(individual.getPlanet()) && individual.getAge() >= 0 && individual.getAge() <= 60 && individual.getTraits() != null && individual.getTraits().containsAll(List.of("SHORT", "HAIRY")))) {
            return Universe.StarWars;
        }

        if (individual.isHumanoid() && "Asgard".equals(individual.getPlanet()) && individual.getAge() >= 0 && individual.getAge() <= 5000 && individual.getTraits() != null && individual.getTraits().containsAll(List.of("BLONDE", "TALL"))) {
            return Universe.Marvel;
        }

        if ((individual.isHumanoid() && "Betelgeuse".equalsIgnoreCase(individual.getPlanet()) && individual.getAge() >= 0 && individual.getAge() <= 100 && individual.getTraits() != null && individual.getTraits().containsAll(List.of("EXTRA_ARMS", "EXTRA_HEAD"))) || (!individual.isHumanoid() && "Vogsphere".equalsIgnoreCase(individual.getPlanet()) && individual.getAge() >= 0 && individual.getAge() <= 200 && individual.getTraits() != null && individual.getTraits().containsAll(List.of("GREEN", "BULKY")))) {
            return Universe.Hitchhiker;
        }

        if ((individual.isHumanoid() && "Earth".equalsIgnoreCase(individual.getPlanet()) && individual.getAge() == 0 && individual.getTraits() != null && individual.getTraits().containsAll(List.of("BLONDE", "POINTY_EARS"))) || (individual.isHumanoid() && "Earth".equalsIgnoreCase(individual.getPlanet()) && individual.getAge() >= 0 && individual.getAge() <= 200 && individual.getTraits() != null && individual.getTraits().containsAll(List.of("SHORT", "BULKY")))) {
            return Universe.LordOfTheRings; // Elf
        }

        // guessing when having insufficient information
        // check humanoid and planet
        if (individual.getPlanet() != null) {
            if (("Kashyyyk".equals(individual.getPlanet())) || ("Endor".equals(individual.getPlanet()))) {
                return Universe.StarWars;
            }
            if ("Asgard".equals(individual.getPlanet())) {
                return Universe.Marvel;
            }
            if ("Betelgeuse".equalsIgnoreCase(individual.getPlanet())) {
                return Universe.Hitchhiker;
            }
            if ("Earth".equalsIgnoreCase(individual.getPlanet())) {
                return Universe.LordOfTheRings;
            }
        }

        // check traits
        if (individual.getTraits() != null) {
            if (individual.getTraits().contains("HAIRY") || individual.getTraits().contains("TALL")) {
                return Universe.StarWars;
            }
            if (individual.getTraits().contains("BLONDE")) {
                return Universe.Marvel;
            }
            if (individual.getTraits().contains("EXTRA_ARMS") || individual.getTraits().contains("EXTRA_HEAD")) {
                return Universe.Hitchhiker;
            }
            if (individual.getTraits().contains("SHORT") || individual.getTraits().contains("BULKY")) {
                return Universe.LordOfTheRings;
            }
        }

        return Universe.Unknown;
    }
}
