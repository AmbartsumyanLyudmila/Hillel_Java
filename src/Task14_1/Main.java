package Task14_1;

public class Main {
    public static void main(String[] args) {
        try{
        Person per1 = new Man("Den", 2, PersonRole.ARTIST);
        Person per2 = new Woman("Liza", -25, PersonRole.STUDENT);
        Person per3 = new Man("Vlad", 35, PersonRole.DOCTOR);

        System.out.println("Information about people BEFORE changing profession");
        per1.displayInformation();
        per2.displayInformation();
        per3.displayInformation();
        System.out.println("------------------------------------------------------");
        System.out.println("Information about people AFTER changing profession");
        per1.changeProfession(PersonRole.DOCTOR);
        per2.changeProfession(PersonRole.TEACHER);
        per3.changeProfession(PersonRole.OTHER);}
        catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
