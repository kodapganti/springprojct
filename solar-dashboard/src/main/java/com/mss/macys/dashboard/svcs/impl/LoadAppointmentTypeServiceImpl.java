package com.mss.macys.dashboard.svcs.impl;

import java.util.Collection;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RestController;

import com.mss.macys.dashboard.common.EnumTypeForErrorCodes;
import com.mss.macys.dashboard.common.Utils;
import com.mss.macys.dashboard.domain.LoadAppointmentType;
import com.mss.macys.dashboard.model.ServiceResponse;
import com.mss.macys.dashboard.repos.LoadAppointmentTypeRepository;
import com.mss.macys.dashboard.svcs.LoadAppointmentTypeService;

@RestController
@Validated
public class LoadAppointmentTypeServiceImpl implements LoadAppointmentTypeService {

	private static Logger log = LoggerFactory.getLogger(LoadAppointmentTypeServiceImpl.class);

	@Autowired
	private LoadAppointmentTypeRepository loadAppointmentTypeRepo;

	@Autowired
	private Utils utils;

	/**
	 * getAllLoadAppointmentTypes service implementation
	 * 
	 * @return ServiceResponse<Collection<LoadAppointmentType>>
	 */
	@Override
	public ServiceResponse<Collection<LoadAppointmentType>> getAllLoadAppointmentTypes() {

		log.info("getting all loadAppointmentTypes");
		ServiceResponse<Collection<LoadAppointmentType>> response = new ServiceResponse<>();
		try {
			Collection<LoadAppointmentType> loadAppointments = loadAppointmentTypeRepo.findAll();
			response.setData(loadAppointments);
		} catch (Exception e) {
			response.setError(EnumTypeForErrorCodes.SCUS401.name(), EnumTypeForErrorCodes.SCUS401.errorMsg());
			log.error(utils.toJson(response.getError()), e);
		}
		return response;
	}

}
