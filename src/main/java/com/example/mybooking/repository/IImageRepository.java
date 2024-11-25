package com.example.mybooking.repository;

import com.example.mybooking.model.Image;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface IImageRepository extends JpaRepository<Image, Long> {
    List<Image> findByHotelId(Long hotelId);
}
