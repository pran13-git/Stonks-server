package com.neueda_project.stock_pantry.repository;

import com.neueda_project.stock_pantry.entity.Profile;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;


@Repository
public interface ProfileRepository extends JpaRepository<Profile, Integer> {

    @Modifying
    @Transactional
    @Query("UPDATE Profile p SET p.invested = :amt")
    void updateInvAmt(@Param("amt") float amt);

    @Modifying
    @Transactional
    @Query("UPDATE Profile p SET p.valuation = :amt")
    void updateCurAmt(@Param("amt") float amt);

}