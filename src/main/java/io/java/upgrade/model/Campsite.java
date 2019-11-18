package io.java.upgrade.model;

import java.util.Date;
import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;


@Entity(name = "Campsite")
@Table(name = "Campsite")
public class Campsite {
	
	@Id
	@NotNull
	@Column(nullable = false)
	private UUID id;
	@Column()
	private String reservationStatus;
	@Column()
	private String campsiteName;
	@Column()
	private String campDescription;
	@NotNull(message = "Parameter startDate cannot be blank or null")
	@Column(nullable = false)
	private Date startDate;
	@NotNull(message = "Parameter endDate cannot be blank or null")
	@Column(nullable = false)
	private Date endDate;
	
	public Campsite() {

	}
	
	public Campsite(UUID id,String reservationStatus,String campsiteName,String campDescription,Date startDate,Date endDate) {
		super();
		this.id = id;
		this.reservationStatus = reservationStatus;
		this.campsiteName = campsiteName;
		this.campDescription = campDescription;
		this.startDate = startDate;
		this.endDate = endDate;
	}
	
	public UUID getId() {
		return id;
	}
	public void setId(UUID id) {
		this.id = id;
	}
	public String getReservationStatus() {
		return reservationStatus;
	}
	public void setReservationStatus(String reservationStatus) {
		this.reservationStatus = reservationStatus;
	}
	public String getCampsiteName() {
		return campsiteName;
	}
	public void setCampsiteName(String campsiteName) {
		this.campsiteName = campsiteName;
	}
	public String getcampDescription() {
		return campDescription;
	}
	public void setcampDescription(String campDescription) {
		this.campDescription = campDescription;
	}
	public Date getstartDate() {
		return startDate;
	}
	public void setstartDate(Date startDate) {
		this.startDate = startDate;
	}
	public Date getEndDate() {
		return endDate;
	}
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((startDate == null) ? 0 : startDate.hashCode());
		result = prime * result + ((campDescription == null) ? 0 : campDescription.hashCode());
		result = prime * result + ((campsiteName == null) ? 0 : campsiteName.hashCode());
		result = prime * result + ((endDate == null) ? 0 : endDate.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((reservationStatus == null) ? 0 : reservationStatus.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof Campsite)) {
			return false;
		}
		Campsite other = (Campsite) obj;
		if (startDate == null) {
			if (other.startDate != null) {
				return false;
			}
		} else if (!startDate.equals(other.startDate)) {
			return false;
		}
		if (campDescription == null) {
			if (other.campDescription != null) {
				return false;
			}
		} else if (!campDescription.equals(other.campDescription)) {
			return false;
		}
		if (campsiteName == null) {
			if (other.campsiteName != null) {
				return false;
			}
		} else if (!campsiteName.equals(other.campsiteName)) {
			return false;
		}
		if (endDate == null) {
			if (other.endDate != null) {
				return false;
			}
		} else if (!endDate.equals(other.endDate)) {
			return false;
		}
		if (id == null) {
			if (other.id != null) {
				return false;
			}
		} else if (!id.equals(other.id)) {
			return false;
		}
		if (reservationStatus == null) {
			if (other.reservationStatus != null) {
				return false;
			}
		} else if (!reservationStatus.equals(other.reservationStatus)) {
			return false;
		}
		return true;
	}
	

}
