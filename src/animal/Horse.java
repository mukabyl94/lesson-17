package animal;

public class Horse extends Animal{
    public Horse(String nickName, double weight, int age, String gender) {
        super(nickName, weight, age, gender);
    }

    public Horse() {
    }
    @Override
    public String toString() {
        return "Horse: " + "NickName: " + getNickName() + " Weight: " + getWeight() +
                " Age: " + getAge() + " Gender: " + getGender();
    }
}
