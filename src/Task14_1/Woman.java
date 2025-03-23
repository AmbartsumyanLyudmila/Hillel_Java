package Task14_1;


public class Woman extends Person {
    public static final String Gender = "Female";

    public Woman(String name, int age, PersonRole profession) {

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


