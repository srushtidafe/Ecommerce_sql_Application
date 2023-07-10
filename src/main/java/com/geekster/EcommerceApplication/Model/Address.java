package com.geekster.EcommerceApplication.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Address {
    @Id
    private Long addressId;

    private String LandMark;

    private String city;

    private String zipCode;

    private String state;

    @OneToOne
    @JoinColumn(name = "fk_user-id")
    private User user;

}
