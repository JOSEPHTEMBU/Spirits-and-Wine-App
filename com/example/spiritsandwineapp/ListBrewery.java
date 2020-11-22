
package com.example.spiritsandwineapp;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ListBrewery {

    @SerializedName("id")
    @Expose
    private Long id;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("brewery_type")
    @Expose
    private String breweryType;
    @SerializedName("street")
    @Expose
    private String street;
    @SerializedName("address_2")
    @Expose
    private Object address2;
    @SerializedName("address_3")
    @Expose
    private Object address3;
    @SerializedName("city")
    @Expose
    private String city;
    @SerializedName("state")
    @Expose
    private String state;
    @SerializedName("county_province")
    @Expose
    private Object countyProvince;
    @SerializedName("postal_code")
    @Expose
    private String postalCode;
    @SerializedName("country")
    @Expose
    private String country;
    @SerializedName("longitude")
    @Expose
    private String longitude;
    @SerializedName("latitude")
    @Expose
    private String latitude;
    @SerializedName("phone")
    @Expose
    private String phone;
    @SerializedName("website_url")
    @Expose
    private String websiteUrl;
    @SerializedName("updated_at")
    @Expose
    private String updatedAt;
    @SerializedName("created_at")
    @Expose
    private String createdAt;

    /**
     * No args constructor for use in serialization
     * 
     */
    public ListBrewery() {
    }

    /**
     * 
     * @param country
     * @param address3
     * @param address2
     * @param city
     * @param postalCode
     * @param latitude
     * @param createdAt
     * @param countyProvince
     * @param phone
     * @param websiteUrl
     * @param street
     * @param name
     * @param id
     * @param state
     * @param breweryType
     * @param longitude
     * @param updatedAt
     */
    public ListBrewery(Long id, String name, String breweryType, String street, Object address2, Object address3, String city, String state, Object countyProvince, String postalCode, String country, String longitude, String latitude, String phone, String websiteUrl, String updatedAt, String createdAt) {
        super();
        this.id = id;
        this.name = name;
        this.breweryType = breweryType;
        this.street = street;
        this.address2 = address2;
        this.address3 = address3;
        this.city = city;
        this.state = state;
        this.countyProvince = countyProvince;
        this.postalCode = postalCode;
        this.country = country;
        this.longitude = longitude;
        this.latitude = latitude;
        this.phone = phone;
        this.websiteUrl = websiteUrl;
        this.updatedAt = updatedAt;
        this.createdAt = createdAt;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBreweryType() {
        return breweryType;
    }

    public void setBreweryType(String breweryType) {
        this.breweryType = breweryType;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public Object getAddress2() {
        return address2;
    }

    public void setAddress2(Object address2) {
        this.address2 = address2;
    }

    public Object getAddress3() {
        return address3;
    }

    public void setAddress3(Object address3) {
        this.address3 = address3;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Object getCountyProvince() {
        return countyProvince;
    }

    public void setCountyProvince(Object countyProvince) {
        this.countyProvince = countyProvince;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getWebsiteUrl() {
        return websiteUrl;
    }

    public void setWebsiteUrl(String websiteUrl) {
        this.websiteUrl = websiteUrl;
    }

    public String getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

}
