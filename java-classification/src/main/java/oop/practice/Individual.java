package oop.practice;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

public class Individual {
    private int id;
    @JsonProperty("isHumanoid")  // Map the JSON field name to the class field
    private boolean humanoid;
    private String planet;
    private int age;
    private List<String> traits;

    public Individual() {
    }

    public int getId() {
        return id;
    }

    public boolean isHumanoid() {
        return humanoid;
    }

    public String getPlanet() {
        return planet;
    }

    public int getAge() {
        return age;
    }

    public List<String> getTraits() {
        return traits;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setHumanoid(boolean humanoid) {
        this.humanoid = humanoid;
    }

    public void setPlanet(String planet) {
        this.planet = planet;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setTraits(List<String> traits) {
        this.traits = traits;
    }
}
