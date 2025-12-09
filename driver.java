import java.util.Scanner;
public class GradebookDriver {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Gradebook gradebook = new Gradebook(5);
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter student <firstName> <lastName> <score>: ");
            String firstName = scanner.next();
            String lastName = scanner.next();
            int score = scanner.nextInt();
            
            if (score < 0 || score > 100) {
                System.out.println("Score must be between 0 and 100. Please try again.");
                i--;
                continue;
            }
          
            Student student = new Student(firstName, lastName, score);
            gradebook.addStudent(student);
        }
        gradebook.sortStudents();
        gradebook.printStudents();
        scanner.close();
    }
}
