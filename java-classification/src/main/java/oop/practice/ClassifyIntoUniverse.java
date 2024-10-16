package oop.practice;

import java.util.List;

public class ClassifyIntoUniverse {

    public static String check(Individual individual) {
        String planet = individual.getPlanet();
        Boolean humanoid = individual.isHumanoid();
        Integer age = individual.getAge();
        List<String> traits = individual.getTraits();

        // if has planet
        if (planet != null) {
            if (individual.getPlanet().equals("Kashyyyk") || individual.getPlanet().equals("Endor")) {
                return "Star Wars";
            } else if (individual.getPlanet().equals("Asgard")) {
                return "Marvel";
            } else if (individual.getPlanet().equals("Betelgeuse") || individual.getPlanet().equals("Vogsphere")) {
                return "Hitchhiker";
            } else if (individual.getPlanet().equals("Earth")) {
                return "Lord of the rings";
            } else {
                return "Unknown planet";
            }
        }

        // if has humanoid value
        if (humanoid != null) {
            // if not human
            if (!humanoid) {
                // if has traits
                if (traits != null) {
                    if (traits.contains("GREEN") || traits.contains("BULKY")) {
                        return "Hitchhiker";
                    } else if (traits.contains("HAIRY")) {
                        return "Star Wars";
                    }
                }
                // if has age value
                if (age != null) {
                    if (age > 200) {
                        return "Star Wars";
                    }
                }
                // if human
            } else {
                // if has traits value
                if (traits != null) {
                    if (traits.contains("TALL")) {
                        return "Marvel";
                    } else if (traits.contains("EXTRA_ARMS") || traits.contains("EXTRA_HEAD")) {
                        return "Hitchhiker";
                    } else if (traits.contains("SHORT") || traits.contains("BLONDE") || traits.contains("BULKY")) {
                        return "Lord of the rings";
                    }
                }
                // if has age value
                if (age != null) {
                    if (age > 200 && age < 5000) {
                        return "Marvel";
                    } else if (age > 5000) {
                        return "Lord of the rings";
                    }
                }

            }
        }

        // if has traits
        if (traits != null) {
            if (traits.contains("EXTRA_ARMS") || traits.contains("EXTRA_HEAD") || traits.contains("GREEN")) {
                return "Hitchhiker";
            } else if (traits.contains("POINTY_EARS") || (traits.contains("SHORT") && traits.contains("BULKY"))) {
                return "Lord of the rings";
            } else if (traits.contains("BLONDE") && traits.contains("TALL")) {
                return "Marvel";
            } else if (traits.contains("HAIRY")) {
                return "Star wars";
            }
        }

        return "Unknown";
    }
}