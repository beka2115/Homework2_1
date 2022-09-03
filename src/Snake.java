public final class Snake extends Reptile {

    public Snake(String name, int age, Dimensions gab, Habitat habitat) {
        super(name, age, gab, habitat);
    }

    @Override
    public void makeVoice() {
        System.out.println("Shhhhhhhh");
    }
}
