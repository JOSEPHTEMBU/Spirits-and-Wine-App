
package com.example.spiritsandwineapp.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import org.parceler.Parcel;

@Parcel
public class Temp_ {

    @SerializedName("value")
    @Expose
    private Long value;
    @SerializedName("unit")
    @Expose
    private String unit;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Temp_() {
    }

    /**
     * 
     * @param unit
     * @param value
     */
    public Temp_(Long value, String unit) {
        super();
        this.value = value;
        this.unit = unit;
    }

    public Long getValue() {
        return value;
    }

    public void setValue(Long value) {
        this.value = value;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

}
