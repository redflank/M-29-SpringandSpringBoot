package org.tnsif.springioc;

////Implementation a DebitCart Interface
public class HDFCCard implements DebitCard {

	public void deposit() {
		System.out.println("HDFC- Deposting an amount of 1 lakh rupees");

	}

	public void withdraw() {
		System.out.println("HDFC- Withdrawing an amount of 20 thousand rupees");

	}

}
