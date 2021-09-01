package goldmineAssignment.goldmine;

import java.util.ArrayList;
import java.util.List;

public class registration {

	// Registration Attributes
	private String term;
	private String classes;
	private List schedule;
	private int fee;
	private List<Student> students;

	public registration(String aTerm, String aClass, List<String> aSchedule, int aFee) {
		term = aTerm;
		classes = aClass;
		schedule = aSchedule;
		fee = aFee;
		students = new ArrayList<Student>();
	}

	public void viewSchedule() {

	}

	public void addClass() {

	}

	public void dropClass() {

	}
}
