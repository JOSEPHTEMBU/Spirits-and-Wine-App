
package com.example.spiritsandwineapp.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import org.parceler.Parcel;


//@Parcel
public class Malt {

    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("amount")
    @Expose
    private Amount amount;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Malt() {
    }

    /**
     * 
     * @param amount
     * @param name
     */
    public Malt(String name, Amount amount) {
        super();
        this.name = name;
        this.amount = amount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Amount getAmount() {
        return amount;
    }

    public void setAmount(Amount amount) {
        this.amount = amount;
    }

}
