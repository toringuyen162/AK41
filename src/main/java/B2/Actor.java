package B2;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Actor {
    private String name;
    private int height;
    private int mass;
    private String hairColor;
    private String skinColor;
    private String eyeColor;
    private String birthYear;
    private String gender;

    public Actor(String name, int height, int mass, String hairColor, String skinColor, String eyeColor, String birthYear, String gender) {
        this.name = name;
        this.height = height;
        this.mass = mass;
        this.hairColor = hairColor;
        this.skinColor = skinColor;
        this.eyeColor = eyeColor;
        this.birthYear = birthYear;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public int getHeight() {
        return height;
    }

    public int getMass() {
        return mass;
    }

    public String getHairColor() {
        return hairColor;
    }

    public String getSkinColor() {
        return skinColor;
    }

    public String getEyeColor() {
        return eyeColor;
    }

    public String getBirthYear() {
        return birthYear;
    }

    public String getGender() {
        return gender;
    }

    public void info(){
        System.out.printf("name: %s\n",this.name);
        System.out.printf("height: %d\n",this.height);
        System.out.printf("mass: %d\n",this.mass);
        System.out.printf("hair_color: %s\n",this.hairColor);
        System.out.printf("skin_color: %s\n",this.skinColor);
        System.out.printf("eye_color: %s\n",this.eyeColor);
        System.out.printf("birth_year: %s\n",this.birthYear);
        System.out.printf("gender: %s\n",this.gender);
        System.out.println("--------------------------");

    }
    public static void main(String[] args) {
        List<Actor> actors = new ArrayList<Actor>();
        actors.add(new Actor("Luke Skywalker", 172, 77, "blond", "fair", "blue", "19BBY", "male"));
        actors.add(new Actor("Darth Vader", 202, 136, "none", "white", "yellow", "41.9BBY", "male"));
        actors.add(new Actor("Leia Organa", 150, 49, "brown", "light", "brown", "19BBY", "female"));
        actors.add(new Actor("Owen Lars", 178, 120, "brown, grey", "light", "blue", "52BBY", "male"));
        actors.add(new Actor("Beru Whitesun lars", 165, 75, "brown", "light", "blue", "47BBY", "female"));
        actors.add(new Actor("Biggs Darklighter", 183, 84, "black", "light", "brown", "24BBY", "male"));
        actors.add(new Actor("Obi-Wan Kenobi", 182, 77, "auburn, white", "fair", "blue-gray", "57BBY", "male"));

        List<String> actorNames = actors.stream().map(Actor::getName).collect((Collectors.toList()));
        List <Actor> actorHasMassGreater100 =
                actors
                .stream()
                .filter(Actor -> Actor.getMass()>100)
                .collect(Collectors.toList());

        actorHasMassGreater100.forEach(Actor::info);
    }
}
