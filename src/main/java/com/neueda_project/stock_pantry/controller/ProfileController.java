package com.neueda_project.stock_pantry.controller;

import com.neueda_project.stock_pantry.entity.Orders;
import com.neueda_project.stock_pantry.entity.Profile;
import com.neueda_project.stock_pantry.service.ProfileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProfileController {

    @Autowired
    ProfileService profileService;

    @GetMapping("/profile")
    private List<Profile> getProfile(){
        return profileService.getProfile();
    }

    @PutMapping("/profile/inv")
    private ResponseEntity<String> updateProfileInv(@RequestParam float amt){
        try{
            profileService.updateInvAmt(amt);
            return ResponseEntity.ok("updated inv");
        }
        catch(Exception e){
            System.out.println(e);
            return ResponseEntity.status(400).body("failed to update inv");
        }
    }

    @PutMapping("/profile/cur")
    private ResponseEntity<String> updateProfileCur(@RequestParam float amt){
        try{
            profileService.updateCurAmt(amt);
            return ResponseEntity.ok("updated valuation");
        }
        catch(Exception e){
            System.out.println(e);
            return ResponseEntity.status(400).body("failed to update valuation");
        }
    }
}
