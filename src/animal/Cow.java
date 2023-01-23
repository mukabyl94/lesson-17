package animal;

import animal.Animal;

public class Cow extends Animal {
    public Cow(String nickName, double weight, int age, String gender) {
        super(nickName, weight, age, gender);
    }

    public Cow() {
    }

    @Override
    public String toString() {
        return "Cow: " + "NickName: " + getNickName() + " Weight: " + getWeight() +
                " Age: " + getAge() + " Gender: " + getGender();
    }
}
