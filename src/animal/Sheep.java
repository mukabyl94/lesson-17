package animal;

public class Sheep extends Animal{
    public Sheep(String nickName, double weight, int age, String gender) {
        super(nickName, weight, age, gender);
    }

    public Sheep() {
    }
    @Override
    public String toString() {
        return "Sheep: " + "NickName: " + getNickName() + " Weight: " + getWeight() +
                " Age: " + getAge() + " Gender: " + getGender();
    }
}
