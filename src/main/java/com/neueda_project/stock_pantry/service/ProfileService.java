package com.neueda_project.stock_pantry.service;

import com.neueda_project.stock_pantry.entity.Orders;
import com.neueda_project.stock_pantry.entity.Profile;
import com.neueda_project.stock_pantry.repository.OrderRepository;
import com.neueda_project.stock_pantry.repository.ProfileRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class ProfileService {

    @Autowired
    ProfileRepository profileRepository;

    public List<Profile> getProfile() {
        return profileRepository.findAll();
    }

    public void saveOrUpdate(Profile profile) {
        profileRepository.save(profile);
    }

    public void delete(int id) {
        profileRepository.deleteById(id);
    }

    public void updateInvAmt(float amt) {
        profileRepository.updateInvAmt(amt);
    }

    public void updateCurAmt(float amt) {
        profileRepository.updateCurAmt(amt);
    }
}
