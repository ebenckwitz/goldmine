package goldmineAssignment.goldmine;

import java.util.List;

public class CreditCard extends PaymentOptions {

	private int cardNumber;
	private int cvc;
	private int expiration;
	private String name;

	public CreditCard(int aAmount, List aAuthorizedUsers, int aCost, String aReceipt, int aCardNumber, int aCvc,
			int aExpiration, String aName) {
		super(aAmount, aAuthorizedUsers, aCost, aReceipt);
		cardNumber = aCardNumber;
		cvc = aCvc;
		expiration = aExpiration;
		name = aName;
	}
}
