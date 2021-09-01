package goldmineAssignment.goldmine;

import java.util.ArrayList;
import java.util.List;

public class Student {
	private String name;
	private int ID;
	private String address;
	private String classification;

	private List<StudentRecords> studentRecords;
	private List<registration> registrations;
	private List<FinancialAid> financialAids;
	private List<PaymentOptions> paymentOptions;

	public Student(String aName, int aID, String aAddress, String aClassification) {
		name = aName;
		ID = aID;
		address = aAddress;
		classification = aClassification;
		studentRecords = new ArrayList<StudentRecords>();
		registrations = new ArrayList<registration>();
		financialAids = new ArrayList<FinancialAid>();
		paymentOptions = new ArrayList<PaymentOptions>();
	}

	public void search() {

	}

	public void viewInformation() {

	}

	public void viewSiteMap() {

	}
}
