package com.mss.macys.dashboard.svcs;

import java.util.Collection;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.mss.macys.dashboard.common.RestApiUrlConstants;
import com.mss.macys.dashboard.domain.LoadAppointmentType;
import com.mss.macys.dashboard.model.ServiceResponse;

@RequestMapping(value = "/api/loadAppointmentType")
public interface LoadAppointmentTypeService {

	
	final String MODULE_NAME = "LoadAppointmentTypeService";

	@GetMapping(RestApiUrlConstants.GET_ALL_LOADAPPOINTMENTTYPES)
	@ResponseBody
	ServiceResponse<Collection<LoadAppointmentType>> getAllLoadAppointmentTypes();
}
