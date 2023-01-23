import animal.Cow;
import animal.Farm;
import animal.Horse;
import animal.Sheep;

public class Main {
    public static void main(String[] args) {
        Cow cow = new Cow ("Magic", 105.365, 4, "boy");
        Cow cow2 = new Cow ("Penny", 72.37, 3, "boy");
        Cow cow3 = new Cow ("Nina", 95.50, 4, "girl");
        Cow cow4 = new Cow ("Rosie", 46.98, 1, "girl");
        Cow cow5 = new Cow ("Bella", 120.745, 5, "girl");
        Cow cow6 = new Cow ("Daisy", 125.23, 5, "boy");

        Sheep sheep = new Sheep("Mack", 45.21, 3, "boy");
        Sheep sheep2 = new Sheep("jack", 42.92, 3, "boy");
        Sheep sheep3 = new Sheep("King", 28.65, 2, "boy");
        Sheep sheep4 = new Sheep("Emma", 12.10, 1, "girl");

        Horse horse = new Horse("Cisco", 75.63, 2, "boy");
        Horse horse2 = new Horse("Lucky", 186.40, 7, "girl");
        Horse horse3 = new Horse("Jasper", 150.20, 5, "boy");


        Farm farm1 = new Farm("Bishkek Sokuluk kochosu 12", "Uluk", new Cow[]{cow, cow2, cow3, cow4, cow5},
                new Sheep[]{sheep, sheep2, sheep3}, new Horse[]{horse,horse2});
        Farm farm2 = new Farm("Naryn At-bashy", "Samat", new Cow[]{cow6}, new Sheep[]{sheep4},
                new Horse[]{horse3});
        System.out.println(farm1.toString());
        System.out.println(farm2.toString());

    }
}