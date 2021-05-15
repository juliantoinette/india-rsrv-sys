package com.gobus.system.dto;

import java.util.List;

/**
 * @author julia antoinette
 */
public class BusDTO {

    private String id;
    private int seatCapacity;
    private String type;
    private String number;
    private List<String> scrDest;
    private int driverNum;
    //private Date schedule;
    private Double seatCharges;
    private int currentReservationType;
    private int placesofHalt;

    public BusDTO() {
    }

    public BusDTO(int seatCapacity, String type, String number, List<String> scrDest, int driverNum, Double seatCharges, int currentReservationType,int placesofHalt) {
        this.seatCapacity = seatCapacity;
        this.type = type;
        this.number = number;
        this.scrDest = scrDest;
        this.driverNum = driverNum;
        this.seatCharges  = seatCharges;
        this.currentReservationType = currentReservationType;
        this.placesofHalt = placesofHalt;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getSeatCapacity() {
		return seatCapacity;
	}

	public void setSeatCapacity(int seatCapacity) {
		this.seatCapacity = seatCapacity;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public List<String> getScrDest() {
		return scrDest;
	}

	public void setScrDest(List<String> scrDest) {
		this.scrDest = scrDest;
	}

	public int getDriverNum() {
		return driverNum;
	}

	public void setDriverNum(int driverNum) {
		this.driverNum = driverNum;
	}

	public Double getSeatCharges() {
		return seatCharges;
	}

	public void setSeatCharges(Double seatCharges) {
		this.seatCharges = seatCharges;
	}

	public int getCurrentReservationType() {
		return currentReservationType;
	}

	public void setCurrentReservationType(int currentReservationType) {
		this.currentReservationType = currentReservationType;
	}

	public int getPlacesofHalt() {
		return placesofHalt;
	}

	public void setPlacesofHalt(int placesofHalt) {
		this.placesofHalt = placesofHalt;
	}


}
