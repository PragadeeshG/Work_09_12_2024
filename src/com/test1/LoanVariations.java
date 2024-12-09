package com.test1;

public class LoanVariations {
	private long variationsCode;
	private long loanId;
	private long primaryAccountNum;
	private String lendingAccount;
	private double lendingAmount;
	private String variationsText;
	private String isRead;
	private String remarks;
	private String description;
	private boolean loanInputAvail;
	private String creationDate;
	private String modifiedDate;
	private String entityState;

	public LoanVariations() {

	}

	public LoanVariations(long variationsCode, long loanId, long primaryAccountNum, String lendingAccount,
			double lendingAmount, String variationsText, String isRead, String remarks, String description,
			boolean loanInputAvail, String creationDate, String modifiedDate, String entityState) {
		super();
		this.variationsCode = variationsCode;
		this.loanId = loanId;
		this.primaryAccountNum = primaryAccountNum;
		this.lendingAccount = lendingAccount;
		this.lendingAmount = lendingAmount;
		this.variationsText = variationsText;
		this.isRead = isRead;
		this.remarks = remarks;
		this.description = description;
		this.loanInputAvail = loanInputAvail;
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

	public long getLoanId() {
		return loanId;
	}

	public void setLoanId(long loanId) {
		this.loanId = loanId;
	}

	public long getPrimaryAccountNum() {
		return primaryAccountNum;
	}

	public void setPrimaryAccountNum(long primaryAccountNum) {
		this.primaryAccountNum = primaryAccountNum;
	}

	public String getLendingAccount() {
		return lendingAccount;
	}

	public void setLendingAccount(String lendingAccount) {
		this.lendingAccount = lendingAccount;
	}

	public double getLendingAmount() {
		return lendingAmount;
	}

	public void setLendingAmount(double lendingAmount) {
		this.lendingAmount = lendingAmount;
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

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public boolean isLoanInputAvail() {
		return loanInputAvail;
	}

	public void setLoanInputAvail(boolean loanInputAvail) {
		this.loanInputAvail = loanInputAvail;
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
