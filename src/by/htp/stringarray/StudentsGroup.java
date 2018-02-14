package by.htp.stringarray;

public class StudentsGroup {

	// add unlimited number of students
	// print all students from group to console

	private String[] students;
	private int studentCounter;

	public String[] getStudents() {
		return students;
	}

	public void setStudents(String[] students) {
		this.students = students;
	}

	public int getStudentCounter() {
		return studentCounter;
	}

	public void setStudentCounter(int studentCounter) {
		this.studentCounter = studentCounter;
	}



	public void addStudent(String studentName) {

		if (students != null) {
			if (studentCounter < this.students.length) {
				
				this.students[studentCounter] = studentName;
				studentCounter++;
				
			} else {
				
				String[] students = new String[this.students.length + 1];
				
				for (int i = 0; i < this.students.length; i++) {
					students[i] = this.students[i];
				}
				
				this.students = students;
				this.students[studentCounter] = studentName;
				studentCounter++;				
				
			}
			
		} else {
			
			this.students = new String[1];
			this.students[studentCounter] = studentName;
			studentCounter++;
			
		}

	}

}
