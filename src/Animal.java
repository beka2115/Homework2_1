public abstract class Animal {
    private String name;
    private int age;
    private Dimensions gab;
    private Habitat habitat;

    public Animal(String name, int age, Dimensions gab, Habitat habitat) {
        this.name = name;
        this.age = age;
        this.gab = gab;
        this.habitat = habitat;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Dimensions getGab() {
        return gab;
    }

    public Habitat getHabitat() {
        return habitat;
    }
}
