package com.example.minipackage.service;

import com.example.minipackage.model.PackageOrder;
import com.example.minipackage.repository.PackageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.LocalTime;

@Service
public class PackageService {
    @Autowired
    PackageRepository packageRepository;
    public PackageOrder save(PackageOrder newPackage) {
        newPackage.setStatus("No Pickup");
        newPackage.setTime(LocalDate.now().toString() + " " + LocalTime.now().toString());
        return packageRepository.save(newPackage);
    }

    public Iterable<PackageOrder> findAll() {
        return packageRepository.findAll();
    }
}
