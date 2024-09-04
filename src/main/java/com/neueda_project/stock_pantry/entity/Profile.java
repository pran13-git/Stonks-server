package com.neueda_project.stock_pantry.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "Profile")
@IdClass(ProfileId.class)
public class Profile {

    @Id
    @Column(name = "Name", length = 50)
    private String name;

    @Id
    @Column(name = "IFSCCode", length = 50)
    private String ifscCode;

    @Column(name = "DEMATID", length = 20)
    private String dematId;

    @Column(name = "Bankname", length = 50)
    private String bankName;

    @Column(name = "Bankaccountno", length = 30)
    private String bankAccountNo;

    @Column(name = "Withdrawablemargin")
    private double withdrawableMargin;

    @Column(name = "Invested")
    private double invested;

    @Column(name = "Valuation")
    private double valuation;

    public Profile() {
        // Default constructor
    }

    public Profile(String name, String ifscCode, String dematId, String bankName,
                   String bankAccountNo, double withdrawableMargin, double invested,
                   double valuation) {
        this.name = name;
        this.ifscCode = ifscCode;
        this.dematId = dematId;
        this.bankName = bankName;
        this.bankAccountNo = bankAccountNo;
        this.withdrawableMargin = withdrawableMargin;
        this.invested = invested;
        this.valuation = valuation;
    }
}