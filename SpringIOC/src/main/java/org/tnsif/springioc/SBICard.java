package org.tnsif.springioc;

//Implementation a DebitCart Interface
public class SBICard implements DebitCard {

	public void deposit() {

		System.out.println("SBI- Deposting an amount of 1 lakh rupees");
	}

	public void withdraw() {
		System.out.println("SBI- Withdrawing an amount of 20 thousand rupees");

	}

}
