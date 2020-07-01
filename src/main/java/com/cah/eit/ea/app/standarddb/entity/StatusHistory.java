package com.cah.eit.ea.app.standarddb.entity;

import java.util.Date;

import com.cah.eit.ea.app.standarddb.types.StatusEnum;

public class StatusHistory {
	
	StatusEnum status;
	Date statusDate;
	String contactId;
	
	public StatusHistory(StatusEnum status, Date statusDate, String contactId) {
		super();
		this.status = status;
		this.statusDate = statusDate;
		this.contactId = contactId;
	}

	public StatusEnum getStatus() {
		return status;
	}

	public void setStatus(StatusEnum status) {
		this.status = status;
	}

	public Date getStatusDate() {
		return statusDate;
	}

	public void setStatusDate(Date statusDate) {
		this.statusDate = statusDate;
	}

	public String getContactId() {
		return contactId;
	}

	public void setContactId(String contactId) {
		this.contactId = contactId;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((contactId == null) ? 0 : contactId.hashCode());
		result = prime * result + ((status == null) ? 0 : status.hashCode());
		result = prime * result + ((statusDate == null) ? 0 : statusDate.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		StatusHistory other = (StatusHistory) obj;
		if (contactId == null) {
			if (other.contactId != null)
				return false;
		} else if (!contactId.equals(other.contactId))
			return false;
		if (status != other.status)
			return false;
		if (statusDate == null) {
			if (other.statusDate != null)
				return false;
		} else if (!statusDate.equals(other.statusDate))
			return false;
		return true;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("StatusHistory [status=");
		builder.append(status);
		builder.append(", statusDate=");
		builder.append(statusDate);
		builder.append(", contactId=");
		builder.append(contactId);
		builder.append("]");
		return builder.toString();
	}	

}
