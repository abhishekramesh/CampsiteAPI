package io.java.upgrade.model;


import java.util.Date;
import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;


@Entity
@Table(name = "campsite")
@NamedQuery(name = "Campsite.findAllCampsitesBetweeDates", query = "SELECT c FROM Campsite c WHERE c.campDate BETWEEN campDate AND endDate ORDER BY c.campDate")
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
	@NotNull(message = "Parameter campDate cannot be blank or null")
	@Column(nullable = false)
	private Date campDate;
	
	public Campsite() {

	}
	
	public Campsite(UUID id,String reservationStatus,String campsiteName,String campDescription,Date campDate,Date endDate) {
		super();
		this.id = id;
		this.reservationStatus = reservationStatus;
		this.campsiteName = campsiteName;
		this.campDescription = campDescription;
		this.campDate = campDate;
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
	public Date getcampDate() {
		return campDate;
	}
	public void setcampDate(Date campDate) {
		this.campDate = campDate;
	}

	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((campDate == null) ? 0 : campDate.hashCode());
		result = prime * result + ((campDescription == null) ? 0 : campDescription.hashCode());
		result = prime * result + ((campsiteName == null) ? 0 : campsiteName.hashCode());
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
		if (campDate == null) {
			if (other.campDate != null) {
				return false;
			}
		} else if (!campDate.equals(other.campDate)) {
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
