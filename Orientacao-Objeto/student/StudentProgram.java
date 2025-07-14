import java.util.Scanner;

public class StudentProgram {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        Student student1 = new Student();

        System.out.println("Type the student name: ");
        student1.name = scanner.nextLine();
        System.out.println("Type the grade 1: ");
        student1.grade1 = scanner.nextDouble();
        System.out.println("Type the grade 2: ");
        student1.grade2 = scanner.nextDouble();
        System.out.println("Type the grade 3: ");
        student1.grade3 = scanner.nextDouble();

      System.out.println(student1.mensagem());

    }
    
}
