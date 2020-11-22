
package com.example.spiritsandwineapp;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class MashTemp {

    @SerializedName("temp")
    @Expose
    private Temp temp;
    @SerializedName("duration")
    @Expose
    private Long duration;

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
    public MashTemp(Temp temp, Long duration) {
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

    public Long getDuration() {
        return duration;
    }

    public void setDuration(Long duration) {
        this.duration = duration;
    }

}
