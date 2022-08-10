package com.cg.client1;

import com.cg.application1.MMBankFactory;
import com.cg.application1.MMCurrentAcc;
import com.cg.application1.MMSavingAcc;
import com.cg.framework1.BankFactory;
import com.cg.framework1.CurrentAcc;
import com.cg.framework1.SavingAcc;

public class client1 {

	public static void main(String[] args) {
		@SuppressWarnings("unused")
		BankFactory b = new MMBankFactory();
		SavingAcc s = new MMSavingAcc(070,"Bhakti Adake",71099,true);
		CurrentAcc c = new MMCurrentAcc(789,"Shruti Ahirekar",0202,2001);
		s.withdraw(10000);
		c.withdraw(20000);
		System.out.println(s);
		System.out.println(c);
	}
}