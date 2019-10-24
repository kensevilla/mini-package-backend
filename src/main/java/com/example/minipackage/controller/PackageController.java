package com.example.minipackage.controller;

import com.example.minipackage.model.PackageOrder;
import com.example.minipackage.repository.PackageRepository;
import com.example.minipackage.service.PackageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RequestMapping("/package")
public class PackageController {

    private final PackageService packageService;
    public PackageController(PackageService packageService){
        this.packageService = packageService;
    }

    @PostMapping(produces = {"application/json"})
    public PackageOrder add(@RequestBody PackageOrder newPackage){
        return packageService.save(newPackage);
    }

    @GetMapping(produces = {"application/json"})
    public Iterable<PackageOrder> getAll(){
        return packageService.findAll();
    }

}
