package by.htp.stringarray;

public class MainAppStringArray {

	public static void main(String[] args) {

		StudentsGroup sg = new StudentsGroup();

		sg.addStudent("StudentName1");
		sg.addStudent("StudentName2");
		sg.addStudent("StudentName3");
//		sg.addStudent("StudentName4");
		sg.addStudent("StudentName5");
		sg.addStudent("StudentName6");
		sg.addStudent("StudentName7");

		for (String name : sg.getStudents()) {
			System.out.println(name);
		}

	}

}
