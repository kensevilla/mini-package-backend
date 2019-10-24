package com.example.minipackage.repository;

import com.example.minipackage.model.PackageOrder;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PackageRepository extends JpaRepository<PackageOrder, Long> {
}
