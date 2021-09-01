package goldmineAssignment.goldmine;

import java.util.ArrayList;
import java.util.List;

public class PaymentOptions {

	private int amount;
	private List authorizedUsers;
	private int cost;
	private String receipt;

	private List<Student> students;

	public PaymentOptions(int aAmount, List aAuthorizedUsers, int aCost, String aReceipt) {
		amount = aAmount;
		authorizedUsers = aAuthorizedUsers;
		cost = aCost;
		receipt = aReceipt;
		students = new ArrayList<Student>();
	}

	public void viewActivity() {

	}

	public void makePayment(int amount) {

	}
}
