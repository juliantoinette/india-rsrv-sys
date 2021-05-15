/**
 * 
 */
package com.gobus.data;

import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * @author prabhu.selvakumar
 *
 */
@Document(collection = "bus")
public class Bus {

	@Id
	private String busId;

	@Indexed(unique = true)
	private String busNumber;

	/**
	 * @return the busId
	 */
	public String getBusId() {
		return busId;
	}

	/**
	 * @param busId the busId to set
	 */
	public void setBusId(String busId) {
		this.busId = busId;
	}

	/**
	 * @return the busNumber
	 */
	public String getBusNumber() {
		return busNumber;
	}

	/**
	 * @param busNumber the busNumber to set
	 */
	public void setBusNumber(String busNumber) {
		this.busNumber = busNumber;
	}

	
}
