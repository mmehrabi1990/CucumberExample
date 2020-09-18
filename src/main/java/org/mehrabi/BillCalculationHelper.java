package org.mehrabi;

import java.text.DecimalFormat;

public class BillCalculationHelper {
	private BillCalculationHelper() {
	}

	public static double calculateBillForCustomer(double billAmount, double taxrate) {

		double finalBillAmount = billAmount * (1 + taxrate / 100);

		DecimalFormat df = new DecimalFormat("0.00");

		String result = df.format(finalBillAmount);

		return Double.parseDouble(result);

	}

}
