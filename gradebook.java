public class Gradebook {
    private Student[] students;
    private int studentCount;
  
    public Gradebook(int capacity) {
        students = new Student[capacity];
        studentCount = 0;
    }

    public void addStudent(Student student) {
        if (studentCount < students.length) {
            students[studentCount] = student;
            studentCount++;
        }
    }
    public void sortStudents() {
        Sorting.selectionSort(students);
    }
    public void printStudents() {
        for (int i = 0; i < studentCount; i++) {
            System.out.println(students[i]);
        }
    }
    public int getStudentCount() {
        return studentCount;
    }
    public boolean isFull() {
        return studentCount >= students.length;
    }
}
