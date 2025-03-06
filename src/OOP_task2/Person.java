package OOP_task2;

public class Person {
    String name;
    int age;
    PersonRole profession;


    //constructor
    public Person(String name, int age, PersonRole profession) {
        this.name = name;
        this.age = age;
        this.profession = profession;
    }

    //Setter
    public void setName(String name) {

        this.name = name;
    }

    public void setAge(int age) {

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
    public void changeProfession(PersonRole newProfession){

        this.profession=newProfession;
    }
}
