
package com.example.spiritsandwineapp.models;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class MashTemp {

    @SerializedName("temp")
    @Expose
    private Temp temp;
    @SerializedName("duration")
    @Expose
    private Object duration;

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
    public MashTemp(Temp temp, Object duration) {
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

    public Object getDuration() {
        return duration;
    }

    public void setDuration(Object duration) {
        this.duration = duration;
    }

}
