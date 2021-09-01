package goldmineAssignment.goldmine;

import java.util.ArrayList;
import java.util.List;

public class StudentRecords {

	private List grades;
	private List transcript;
	private String accountSummary;
	private int holds;

	private List<Student> students;

	public StudentRecords(List aGrades, List aTranscript, String aAccountSummary, int aHolds) {
		grades = aGrades;
		transcript = aTranscript;
		accountSummary = aAccountSummary;
		holds = aHolds;
		students = new ArrayList<Student>();
	}

	public void viewHolds() {

	}

	public void viewTranscripts() {

	}

	public void viewGrades() {

	}
}
