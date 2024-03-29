package com.andoliver46.ms.dtos;

import java.io.Serializable;
import java.math.BigDecimal;

public class CambioDTO implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private Long id;
	private String from;
	private String to;
	private BigDecimal conversionFactor;
	private BigDecimal convertedValue;
	private String environment;
	
	public CambioDTO() {}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCurrencyFrom() {
		return from;
	}

	public void setCurrencyFrom(String currencyFrom) {
		this.from = currencyFrom;
	}

	public String getCurrencyTo() {
		return to;
	}

	public void setCurrencyTo(String currencyTo) {
		this.to = currencyTo;
	}

	public BigDecimal getConversionFactor() {
		return conversionFactor;
	}

	public void setConversionFactor(BigDecimal conversionFactor) {
		this.conversionFactor = conversionFactor;
	}

	public BigDecimal getConvertedValue() {
		return convertedValue;
	}

	public void setConvertedValue(BigDecimal convertedValue) {
		this.convertedValue = convertedValue;
	}

	public String getEnvironment() {
		return environment;
	}

	public void setEnvironment(String environment) {
		this.environment = environment;
	}
}
