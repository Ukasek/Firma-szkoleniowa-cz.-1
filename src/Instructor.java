import java.util.Scanner;

public class Instructor extends Person {
    private int numbOfClasses;

    public Instructor(String firstName, String lastName, int numbOfClasses) {
        setFirstName(firstName);
        setLastName(lastName);
        this.numbOfClasses = numbOfClasses;
    }

    public static Instructor createInstructor() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Wpisz imię instruktora: ");
        String firstName = scanner.nextLine();
        System.out.println("Wpisz nazwisko instruktora: ");
        String lastName = scanner.nextLine();
        System.out.println("Podaj liczbę klas, które prowadzi: ");
        int numbOfClasses = scanner.nextInt();
        return new Instructor(firstName, lastName, numbOfClasses);
    }

    String getInfoInstructor() {
        return getFirstName() + " " + getLastName() + " " + numbOfClasses;
    }
}
