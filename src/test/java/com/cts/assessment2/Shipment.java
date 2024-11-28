package com.cts.assessment2;

public class Shipment {
	private String trackingNumber;
	private String shipmentType;
	private double weight;

	public Shipment(String trackingNumber, String shipmentType, double weight) {
		this.trackingNumber = trackingNumber;
		this.shipmentType = shipmentType;
		this.weight = weight;
	}

	public String getTrackingNumber() {
		return trackingNumber;
	}

	public void setTrackingNumber(String trackingNumber) {
		this.trackingNumber = trackingNumber;
	}

	public String getShipmentType() {
		return shipmentType;
	}

	public void setShipmentType(String shipmentType) {
		this.shipmentType = shipmentType;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}
}
