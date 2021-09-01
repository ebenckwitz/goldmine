package goldmineAssignment.goldmine;

import java.util.List;

public class WebCheck extends PaymentOptions {
	private String bank;
	private String account;
	private int payment;
	private int routingNumber;

	public WebCheck(int aAmount, List aAuthorizedUsers, int aCost, String aReceipt, String aBank, String aAccount,
			int aPayment, int aRoutingNumber) {
		super(aAmount, aAuthorizedUsers, aCost, aReceipt);
		bank = aBank;
		account = aAccount;
		payment = aPayment;
		routingNumber = aRoutingNumber;
	}
}
