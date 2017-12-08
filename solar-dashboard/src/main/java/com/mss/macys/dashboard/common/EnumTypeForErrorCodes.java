package com.mss.macys.dashboard.common;

public enum EnumTypeForErrorCodes {

	/**
	 * Driver MODULE
	 */
	SCUS101("Failed to get driver details"),

	SCUS102("Driver already exists"),

	SCUS103("Failed to add new driver "),

	SCUS104("Failed to delete driver"),

	SCUS105("Driver not found"),

	SCUS106("Failed to update driver"),

	SCUS107("Failed to get driver details by id"),

	SCUS108("Driver can't deleted,load is assigned to driver"),

	SCUS109("This email already exists"),

	/**
	 * Load Appointment MODULE
	 */
	SCUS001("Failed to get loadAppointments"),

	SCUS002("loadAppointment does not exists"),

	SCUS003("Failed to update loadAppointment"),

	SCUS004("Failed to delete loadAppointment"),

	SCUS005("loadAppointment already exists"),

	SCUS006("failed to add new loadAppointment"),

	SCUS007("Failed to get loadAppointment by id"),

	SCUS008("Failed to update load appointment status"),

	SCUS009("Failed to get load appointments by driver"),

	SCUS010("Failed to get driver not completed loads"),

	SCUS011("Load is already assigned to driver"),

	SCUS012("Failed to get loads based on locations"),

	SCUS013("Load is completed by  driver"),

	SCUS014("Failed to update geoMiles"),
	
	SCUS015("No loads for this DCManager"),


	/**
	 * Location MODULE
	 */
	SCUS301("Failed to add new location "),

	SCUS302("Location does not exists"),

	SCUS303("Failed to update location"),

	SCUS304("Failed to delete location"),

	SCUS305("Failed to get all locations"),

	SCUS306("Location already exists"),

	SCUS307("Failed to get Weather data"),

	SCUS308("Failed to send email notification"),

	SCUS309("location can't delete,location has some loads"),

	SCUS310("Email already exists"),

	SCUS311("Phone number already exists"),

	SCUS312("Location address already exists"),
	
	SCUS313("This Location already assigned to load"),
	
	/**
	 * Load AppointmentType MODULE
	 */
	SCUS401("Failed to get loadAppointmentTypes"),
	/**
	 * Vendor MODULE
	 */
	SCUS501("Failed to get all vendors"),

	SCUS502("Vendor already exists"),

	SCUS503("Failed to add new Vendor "),

	SCUS504("vendor can't deleted,vendor has some loads"),

	SCUS505("Failed to delete Vendor"),

	SCUS506("Vendor not found"),

	SCUS507("Failed to update Vendor"),

	SCUS508("Failed to get Vendor details by number"),

	SCUS509("This phoneNumber is already exists"),

	SCUS510("This phoneNumber is already registered with other vendor"),
	/**
	 * Analytics MODULE
	 */
	SCUS601("Failed to get analytics data"),

	SCUS602("Failed to get analyticsData By StartDate and EndDate"),

	SCUS603("Failed to get all VendorRelated LoadAppointments"),
	
	SCUS604("This vendor already assigned to load"),
	/**
	 * Reports MODULE
	 */
	SCUS701("Failed to generate report");

	private String errorMsg;

	EnumTypeForErrorCodes(String errorMsg) {
		this.errorMsg = errorMsg;
	}

	public String errorMsg() {
		return errorMsg;
	}
}
