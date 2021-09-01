package goldmineAssignment.goldmine;

import java.util.ArrayList;
import java.util.List;

public class FinancialAid {

	private int award;
	private String eligibility;
	private String status;
	private String governmentServices;

	private List<Student> students;

	public FinancialAid(int aAward, String aEligibility, String aStatus, String aGovernmentServices) {
		award = aAward;
		eligibility = aEligibility;
		status = aStatus;
		governmentServices = aGovernmentServices;
		students = new ArrayList<Student>();
	}

	public int claimAward() {
		return 0;
	}

	public void reviewEligibility() {

	}

	public void checkStatus() {

	}

	public void viewTaxInfo() {

	}

}
