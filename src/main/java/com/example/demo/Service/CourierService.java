package com.example.demo.Service;

import com.example.demo.models.Courier;

import java.util.List;

public interface CourierService {
    void saveCourier(Courier courier);
    List<Courier> findAll();
    Courier editCourier(Long id);
    void deleteCourier(Long id);
    void updateCourier(Courier courier, Long id);
}
