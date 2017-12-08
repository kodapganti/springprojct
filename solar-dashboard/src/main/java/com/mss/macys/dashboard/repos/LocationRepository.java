package com.mss.macys.dashboard.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mss.macys.dashboard.domain.Location;

public interface LocationRepository extends JpaRepository<Location, Long> {

	Location findByEmail(String email);

	Location findByLocNbr(String locNbr);

	Location findByPhoneNumber(String phoneNumber);

	Location findByLatitudeAndLongitude(Double latitude, Double longitude);

}
