public class Main {
    public static void main(String[] args) {
        Habitat habitat = new Habitat("Africa");
        Reptile reptile = new Reptile("Bob", 6, Dimensions.SMALL, habitat);
        System.out.println(reptile.getInfo());
        reptile.poisonous("НЕ ядовитый");
        reptile.makeVoice();
        System.out.println("-----------------------");


        Habitat habitatSnake = new Habitat("America");
        Snake snake1 = new Snake("Shake", 7, Dimensions.LONG, habitatSnake);
        Snake snake2 = new Snake("Dane", 8, Dimensions.SHORT, habitatSnake);
        System.out.println(snake1.getInfo());
        snake1.poisonous("Ядовитый");
        snake1.makeVoice();
        System.out.println("------------------------");
        System.out.println(snake2.getInfo());
        snake2.poisonous("НЕ ядовитый");
        snake2.makeVoice();
        System.out.println("------------------------");


    }
}