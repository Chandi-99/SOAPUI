package com.mbit.webservices.enums;





public enum StatusEnum {
	CONFIRMED("C", "Confirmed"),
	INVALID("I", "Invalid"),
	OUTFORDELIVERY("O","OutForDelivery"),
	DELIVERED("D","Delivered");
		
	private String code;
	private String description;
	
	private StatusEnum(String code, String description) {
		this.code = code;
		this.description = description;
	}

	public String getCode() {
		return code;
	}

	public String getDescription() {
		return description;
	}

	
	//get description by code
	public static String getDescriptionByCode(String code) {
		String returnData = "";
		 for(StatusEnum enumObj : values()) {
			 if(code.equals(enumObj.getCode())){
				 returnData = enumObj.getDescription();
			 }
	    }
		return returnData;
	}
}
