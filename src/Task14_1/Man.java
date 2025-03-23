package Task14_1;

public class Man extends Person {
    public static final String Gender = "Male";

    public Man(String name, int age, PersonRole profession) throws NameException{
        super(name, age, profession);
    }

    public void displayInformation() {
        System.out.println("Name: " + getName() + "  Age: " + getAge() + "  Profession: " + getProfession() + "  Gender: " + Gender);
    }

    public void changeProfession(PersonRole newProfession) {
        this.setProfession(newProfession);
        System.out.println("Name: " + getName() + "  Age: " + getAge() + "  Profession: " + newProfession.toString() + "  Gender: " + Gender);
    }
}

