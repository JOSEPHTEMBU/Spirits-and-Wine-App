
package com.example.spiritsandwineapp.models;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import org.parceler.Parcel;



@Parcel
public class MashTemp {

    @SerializedName("temp")
    @Expose
    private Temp temp;
    @SerializedName("duration")
    @Expose
    private String duration;


    /**
     * No args constructor for use in serialization
     * 
     */
    public MashTemp() {
    }

    /**
     * 
     * @param duration
     * @param temp
     */
    public MashTemp(Temp temp, String duration) {
        super();
        this.temp = temp;
        this.duration = duration;
    }

    public Temp getTemp() {
        return temp;
    }

    public void setTemp(Temp temp) {
        this.temp = temp;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

}
