package oop.practice;

import java.util.List;

public class Individual {
    private int id;
    private Boolean humanoid;
    private String planet;
    private Integer age;
    private List<String> traits;
    private String classifiedUniverse;

    public int getId() {
        return id;
    }

    public Boolean isHumanoid() {
        return humanoid;
    }

    public String getPlanet() {
        return planet;
    }

    public Integer getAge() {
        return age;
    }

    public List<String> getTraits() {
        return traits;
    }

    public String getClassifiedUniverse() {
        return classifiedUniverse;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setHumanoid(Boolean humanoid) {
        this.humanoid = humanoid;
    }

    public void setPlanet(String planet) {
        this.planet = planet;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public void setTraits(List<String> traits) {
        this.traits = traits;
    }

    public void setClassifiedUniverse(String classifiedUniverse) { // Add this setter
        this.classifiedUniverse = classifiedUniverse;
    }
}
