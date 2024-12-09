package com.test1;

public class UserVariations {
	private long variationsCode;
	private String userId;
	private String sentAt;
	private String variationsText;
	private String isRead;
	private String creationDate;
	private String modifiedDate;
	private String entityState;

	public UserVariations() {

	}

	public UserVariations(long variationsCode, String userId, String sentAt, String variationsText, String isRead,
			String creationDate, String modifiedDate, String entityState) {
		super();
		this.variationsCode = variationsCode;
		this.userId = userId;
		this.sentAt = sentAt;
		this.variationsText = variationsText;
		this.isRead = isRead;
		this.creationDate = creationDate;
		this.modifiedDate = modifiedDate;
		this.entityState = entityState;
	}

	public long getVariationsCode() {
		return variationsCode;
	}

	public void setVariationsCode(long variationsCode) {
		this.variationsCode = variationsCode;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getSentAt() {
		return sentAt;
	}

	public void setSentAt(String sentAt) {
		this.sentAt = sentAt;
	}

	public String getVariationsText() {
		return variationsText;
	}

	public void setVariationsText(String variationsText) {
		this.variationsText = variationsText;
	}

	public String getIsRead() {
		return isRead;
	}

	public void setIsRead(String isRead) {
		this.isRead = isRead;
	}

	public String getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(String creationDate) {
		this.creationDate = creationDate;
	}

	public String getModifiedDate() {
		return modifiedDate;
	}

	public void setModifiedDate(String modifiedDate) {
		this.modifiedDate = modifiedDate;
	}

	public String getEntityState() {
		return entityState;
	}

	public void setEntityState(String entityState) {
		this.entityState = entityState;
	}

}
