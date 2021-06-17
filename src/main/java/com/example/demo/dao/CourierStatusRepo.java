package com.example.demo.dao;

import com.example.demo.models.CourierStatus;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CourierStatusRepo extends JpaRepository<CourierStatus, Long> {
}
