package com.cts.assessment2;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class ShipmentUtilTest {

	private static Shipment shipment1, shipment2, shipment3, shipment4, shipment5, shipment6;

	@BeforeAll
	public static void setUp() {
		shipment1 = new Shipment("ST001", "Standard", 50.0);
		shipment2 = new Shipment("ST002", "Express", 22.0);
		shipment3 = new Shipment("ST003", "Overnight", 15.0);
		shipment4 = new Shipment("ST004", "Standard", 45.0);
		shipment5 = new Shipment("ST005", "Express", 25.0);
		shipment6 = new Shipment("ST006", "Special", 30.0);
	}

	// Add required annotation
	// Test the validateShipmentType method in ShipmentUtil class when the
	// shipmentType is Standard - Use assertTrue
	@Test
	public void test1_ValidateForValidShipmentTypeStandard() {
		assertTrue(ShipmentUtil.validateShipmentType(shipment4.getShipmentType()));
	}

	// Add required annotation
	// Test the validateShipmentType method in ShipmentUtil class when the
	// shipmentType is Express - Use assertTrue
	@Test
	public void test2_ValidateForValidShipmentTypeExpress() {
		assertTrue(ShipmentUtil.validateShipmentType(shipment5.getShipmentType()));
		// Fill the code here

	}

	// Add required annotation
	// Test the validateShipmentType method in ShipmentUtil class when the
	// shipmentType is Overnight - Use assertTrue
	@Test
	public void test3_ValidateForValidShipmentTypeOvernight() {

		assertTrue(ShipmentUtil.validateShipmentType(shipment3.getShipmentType()));

	}

	// Add required annotation
	// Test the validateShipmentType method in ShipmentUtil class when the
	// shipmentType is invalid - Use assertFalse
	@Test
	public void test4_ValidateForInvalidShipmentType() {

		assertFalse(ShipmentUtil.validateShipmentType(shipment6.getShipmentType()));

	}

	// Add required annotation
	// Test the calculateShippingCost method in ShipmentUtil class when the
	// shipmentType is Standard - Use assertTrue
	@Test
	public void test5_CalculateShippingCostForStandard() {

		double cost = ShipmentUtil.calculateShippingCost(shipment1.getShipmentType(), shipment1.getWeight());

		assertTrue(cost == 2500.0);

	}

	// Add required annotation
	// Test the calculateShippingCost method in ShipmentUtil class when the
	// shipmentType is Express - Use assertTrue
	@Test
	public void test6_CalculateShippingCostForExpress() {
		double cost = ShipmentUtil.calculateShippingCost(shipment2.getShipmentType(), shipment2.getWeight());

		assertTrue(cost == 2200.0);

	}

	// Add required annotation
	// Test the calculateShippingCost method in ShipmentUtil class when the
	// shipmentType is Overnight - Use assertTrue
	@Test
	public void test7_CalculateShippingCostForOvernight() {

		double cost = ShipmentUtil.calculateShippingCost(shipment3.getShipmentType(), shipment3.getWeight());

		assertTrue(cost == 3000.0);

	}

	// Add required annotation
	// Test the calculateShippingCost method in ShipmentUtil class when the
	// shipmentType is invalid - Use assertFalse
	@Test
	public void test8_CalculateShippingCostForInvalidShipmentType() {

		double cost = ShipmentUtil.calculateShippingCost(shipment6.getShipmentType(), shipment3.getWeight());

		assertFalse(cost == -1);
		// double cost = ShipmentUtil.calculateShippingCost("Hello",20);
		// boolean t=(cost == 0.0);
		// assertTrue(t);

	}

}
