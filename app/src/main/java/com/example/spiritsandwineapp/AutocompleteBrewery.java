
package com.example.spiritsandwineapp;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class AutocompleteBrewery {

    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("name")
    @Expose
    private String name;

    /**
     * No args constructor for use in serialization
     * 
     */
    public AutocompleteBrewery() {
    }

    /**
     * 
     * @param name
     * @param id
     */
    public AutocompleteBrewery(String id, String name) {
        super();
        this.id = id;
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
