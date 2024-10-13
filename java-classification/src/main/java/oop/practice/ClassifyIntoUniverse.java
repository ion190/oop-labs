package oop.practice;

import java.util.List;

public class ClassifyIntoUniverse {

    public static Universe check(Individual individual) {
        boolean isHumanoid = individual.isHumanoid();
        String planet = individual.getPlanet();
        int age = individual.getAge();
        List<String> traits = individual.getTraits();

        // check for Star Wars Universe
        if (!isHumanoid && "Kashyyyk".equals(planet) && age >= 0 && age <= 400
                && traits != null && traits.contains("HAIRY") && traits.contains("TALL")) {
            return Universe.StarWars;
        }
        if (!isHumanoid && "Endor".equals(planet) && age >= 0 && age <= 60
                && traits != null && traits.contains("SHORT") && traits.contains("HAIRY")) {
            return Universe.StarWars;
        }

        // check for Marvel Universe
        if (isHumanoid && "Asgard".equals(planet) && age >= 0 && age <= 5000 && traits != null && traits.contains("BLONDE") && traits.contains("TALL")) {
            return Universe.Marvel;
        }

        // check for Hitchhiker's Universe
        if (isHumanoid && "Betelgeuse".equals(planet) && age >= 0 && age <= 100 && traits != null && traits.contains("EXTRA_ARMS") && traits.contains("EXTRA_HEAD")) {
            return Universe.Hitchhiker;
        }
        if (!isHumanoid && "Vogsphere".equals(planet) && age >= 0 && age <= 200 && traits != null && traits.contains("GREEN") && traits.contains("BULKY")) {
            return Universe.Hitchhiker;
        }

        // check for Lord of the Rings Universe
        if (isHumanoid && "Earth".equals(planet) && age == Integer.MAX_VALUE && traits != null && traits.contains("BLONDE") && traits.contains("POINTY_EARS")) {
            return Universe.LordOfTheRings;
        }
        if (isHumanoid && "Earth".equals(planet) && age >= 0 && age <= 200 && traits != null && traits.contains("SHORT") && traits.contains("BULKY")) {
            return Universe.LordOfTheRings;
        }
        return Universe.Unknown;
    }
}
