public class Student implements Comparable<Student> {
    private String firstName;
    private String lastName;
    private int score;
  
    public Student(String firstName, String lastName, int score) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.score = score;
    }
    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public int getScore() {
        return score;
    }

    @Override
    public int compareTo(Student other) {
        // Descending order: higher scores come first
        return other.score - this.score;
    }
  
    @Override
    public String toString() {
        return firstName + " " + lastName + " " + score;
    }
}
