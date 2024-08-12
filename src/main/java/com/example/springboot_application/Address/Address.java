
package com.example.springboot_application.Address;

import com.example.springboot_application.Enum.AddressType;
import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Entity
public class Address {

@Id
@GeneratedValue(strategy= GenerationType.IDENTITY)
private long id;

private int Building_number;
private String Street;
private String city;
private String country;
private String pincode;
private LocalDateTime createdOn;

@Enumerated(EnumType.STRING)
private AddressType addressType;


}

