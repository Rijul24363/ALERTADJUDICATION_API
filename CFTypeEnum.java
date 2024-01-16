package com.cf.manipal.api.enumeration;

/**
 * Enum that classifies the account's type in the API.
 * 
 *
 */
public enum CFTypeEnum {
	
	FREE("FREE"),
	BASIC("BASIC"), 
	PREMIUM("PREMIUM");
	
	private String value;
	
	private CFTypeEnum(String value) {
		this.value = value;
	}

	public String getValue() {
		return value;
	}

}
