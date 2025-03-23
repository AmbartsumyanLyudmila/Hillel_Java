package Task14_1;

public abstract class Person implements Displayable {
    private String name;
    private int age;
    private PersonRole profession;


    //constructor
    public Person(String name, int age, PersonRole profession) {
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("Name must be a string");
        }
        this.name = name;

        if (age<0){
            throw new IllegalArgumentException("Age must be a positive value");
        }
        this.age = age;
        this.profession = profession;
    }

    //Setter
    public void setName(String name) {
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("Name must be a string");
        }
        this.name = name;
    }

    public void setAge(int age) {
        if (age < 0) {
            throw new IllegalArgumentException("Age must be a positive value");
        }
        this.age = age;
    }

    public void setProfession(PersonRole profession) {
        this.profession = profession;
    }

    //Getter
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public PersonRole getProfession() {
        return profession;
    }

    //for get information
    public void displayInformation() {
        System.out.println("Name: " + name + "  Age: " + age + "  Profession: " + profession);
    }

    //change profession
    public abstract void changeProfession(PersonRole newProfession);
}
