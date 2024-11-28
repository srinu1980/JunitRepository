package com.cts.assessment2;

public class ShipmentUtil {
	public static boolean validateShipmentType(String shipmentType) {
		if (shipmentType.equals("Standard") || shipmentType.equals("Express") || shipmentType.equals("Overnight")) {
			return true;
		} else {
			return false;
		}
	}

	public static double calculateShippingCost(String shipmentType, double weight) {
		double baseCharge = 0;
		double amt = -1;
		if (weight > 0) {
			if (shipmentType.equals("Standard")) {
				baseCharge = 50;
			} else if (shipmentType.equals("Express")) {
				baseCharge = 100;
			} else if (shipmentType.equals("Overnight")) {
				baseCharge = 200;
			} else {
				baseCharge = 0;
			}
			amt = baseCharge * weight;
		}
		return amt;

	}

}