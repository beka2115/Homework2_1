public class Reptile extends Animal {
    private Habitat habitat;

    public Reptile(String name, int age, Dimensions gab, Habitat habitat) {
        super(name, age, gab, habitat);
        this.habitat = habitat;
    }

    public void makeVoice() {
        System.out.println("kvak kvak");
    }

    /* public void makeVoice(String voice){
         System.out.println(voice);
     }*/
    public void poisonous(String answer) {
        System.out.println(answer);
    }

    public final String getInfo() {
        return "Name: " + getName() + "\nAge: " + getAge() + "\nDimension(Габариты): " + getGab() +
                "\nHabitat(Среда обитания): " + habitat.getContinent();
    }
}
