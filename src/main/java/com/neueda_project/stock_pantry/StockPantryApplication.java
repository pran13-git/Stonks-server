package com.neueda_project.stock_pantry;

import com.neueda_project.stock_pantry.entity.Profile;
import com.neueda_project.stock_pantry.repository.ProfileRepository;
import com.neueda_project.stock_pantry.service.ProfileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class StockPantryApplication {


	public static void main(String[] args) {
		SpringApplication.run(StockPantryApplication.class, args);
		System.out.println("Hello");

//		@Autowired
//		ProfileService profileService;
//
//		List<Profile> profileList = profileService.getProfile();

//		System.out.println(profileList);
	}

}
