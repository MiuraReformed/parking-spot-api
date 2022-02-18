package com.api.parkingspot.parkingcontrolapi.services;

import com.api.parkingspot.parkingcontrolapi.models.ParkingSpotModel;
import com.api.parkingspot.parkingcontrolapi.repositories.ParkingSpotRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
public class ParkingSpotService {

    @Autowired
    ParkingSpotRepository parkingSpotRepository;


    @Transactional
    public ParkingSpotModel save(ParkingSpotModel parkingSpotModel) {
        return parkingSpotRepository.save(parkingSpotModel);
    }
}
