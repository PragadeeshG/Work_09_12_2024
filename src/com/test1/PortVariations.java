package com.test1;

public class PortVariations {
	private long portId;
	private long variationsCode;
	private String ssName;
	private String portNameLength;
	private String sentAt;
	private String variationsText;
	private String isRead;
	private String creationDate;
	private String modifiedDate;
	private String entityState;

	public PortVariations() {

	}

	public PortVariations(long portId, long variationsCode, String ssName, String portNameLength, String sentAt,
			String variationsText, String isRead, String creationDate, String modifiedDate, String entityState) {
		super();
		this.portId = portId;
		this.variationsCode = variationsCode;
		this.ssName = ssName;
		this.portNameLength = portNameLength;
		this.sentAt = sentAt;
		this.variationsText = variationsText;
		this.isRead = isRead;
		this.creationDate = creationDate;
		this.modifiedDate = modifiedDate;
		this.entityState = entityState;
	}

	public long getPortId() {
		return portId;
	}

	public void setPortId(long portId) {
		this.portId = portId;
	}

	public long getVariationsCode() {
		return variationsCode;
	}

	public void setVariationsCode(long variationsCode) {
		this.variationsCode = variationsCode;
	}

	public String getSsName() {
		return ssName;
	}

	public void setSsName(String ssName) {
		this.ssName = ssName;
	}

	public String getPortNameLength() {
		return portNameLength;
	}

	public void setPortNameLength(String portNameLength) {
		this.portNameLength = portNameLength;
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
