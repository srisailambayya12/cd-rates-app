package com.cdrates.models;

public class Term {

	private String termType;

	private Double cdMinAmount;

	private Double cdMaxAmount;

	private String apy;

	private String managerApy;

	public String getTermType() {
		return termType;
	}

	public void setTermType(String termType) {
		this.termType = termType;
	}

	public Double getCdMinAmount() {
		return cdMinAmount;
	}

	public void setCdMinAmount(Double cdMinAmount) {
		this.cdMinAmount = cdMinAmount;
	}

	public Double getCdMaxAmount() {
		return cdMaxAmount;
	}

	public void setCdMaxAmount(Double cdMaxAmount) {
		this.cdMaxAmount = cdMaxAmount;
	}

	public String getApy() {
		return apy;
	}

	public void setApy(String apy) {
		this.apy = apy;
	}

	public String getManagerApy() {
		return managerApy;
	}

	public void setManagerApy(String managerApy) {
		this.managerApy = managerApy;
	}

	public Term(String termType, Double cdMinAmount, Double cdMaxAmount, String apy, String managerApy) {
		this.termType = termType;
		this.cdMinAmount = cdMinAmount;
		this.cdMaxAmount = cdMaxAmount;
		this.apy = apy;
		this.managerApy = managerApy;
	}

	@Override
	public String toString() {
		return "Term [termType=" + termType + ", cdMinAmount=" + cdMinAmount + ", cdMaxAmount=" + cdMaxAmount + ", apy="
				+ apy + ", managerApy=" + managerApy + "]";
	}
	
	
	
	
}
