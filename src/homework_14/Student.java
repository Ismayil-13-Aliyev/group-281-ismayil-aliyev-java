package homework_14;

public class Student {
    private String name;
    private int grade;
    private static int totalStudents = 0;

	public Student(String name, int grade) {
		name = this.name;
		grade = this.grade;
	}
	
	public void getStatus () {
		if (grade >= 90) {
			System.out.println("Great");
		} else if (grade >= 70) {
			System.out.println("Good");
		} else if (grade >= 50) {
			System.out.println("Bad");
		}
	}
	
    public static int getTotalStudents() { return totalStudents; }
    
    @Override
    public String toString() {
        // TODO: "Student{name='...', grade=..., status='...'}" ?????????????????????????? ya ne ponal cto nado sdelat
    }
	
}
