package pl.szeluga.cashmere.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "address")
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(name = "street_name", nullable = false)
    private String streetName;
    @Column(name = "street_number_and_character", nullable = false)
    private String streetNumberAndCharacter;
    @Column(name = "apartment-number", nullable = false)
    private int apartmentNumber;
    @Column(name = "post-number", nullable = false)
    private String postNumber;
    @Column(name = "city", nullable = false)
    private String city;
    @Column(name = "country", nullable = false)
    private String country;

    public Address() {
    }

    public Address(Long id, String streetName, String streetNumberAndCharacter, int apartmentNumber, String postNumber, String city, String country) {
        this.id = id;
        this.streetName = streetName;
        this.streetNumberAndCharacter = streetNumberAndCharacter;
        this.apartmentNumber = apartmentNumber;
        this.postNumber = postNumber;
        this.city = city;
        this.country = country;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    public String getStreetNumberAndCharacter() {
        return streetNumberAndCharacter;
    }

    public void setStreetNumberAndCharacter(String streetNumberAndCharacter) {
        this.streetNumberAndCharacter = streetNumberAndCharacter;
    }

    public int getApartmentNumber() {
        return apartmentNumber;
    }

    public void setApartmentNumber(int apartmentNumber) {
        this.apartmentNumber = apartmentNumber;
    }

    public String getPostNumber() {
        return postNumber;
    }

    public void setPostNumber(String postNumber) {
        this.postNumber = postNumber;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}
