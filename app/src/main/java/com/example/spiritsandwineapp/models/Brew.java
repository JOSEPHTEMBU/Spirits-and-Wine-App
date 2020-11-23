
package com.example.spiritsandwineapp.models;
import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Brew {

    @SerializedName("id")
    @Expose
    private Long id;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("tagline")
    @Expose
    private String tagline;
    @SerializedName("first_brewed")
    @Expose
    private String firstBrewed;
    @SerializedName("description")
    @Expose
    private String description;
    @SerializedName("image_url")
    @Expose
    private String imageUrl;
    @SerializedName("abv")
    @Expose
    private Double abv;
    @SerializedName("ibu")
    @Expose
    private Long ibu;
    @SerializedName("target_fg")
    @Expose
    private Long targetFg;
    @SerializedName("target_og")
    @Expose
    private Long targetOg;
    @SerializedName("ebc")
    @Expose
    private Long ebc;
    @SerializedName("srm")
    @Expose
    private Long srm;
    @SerializedName("ph")
    @Expose
    private Double ph;
    @SerializedName("attenuation_level")
    @Expose
    private Long attenuationLevel;
    @SerializedName("volume")
    @Expose
    private Volume volume;
    @SerializedName("boil_volume")
    @Expose
    private BoilVolume boilVolume;
    @SerializedName("method")
    @Expose
    private Method method;
    @SerializedName("ingredients")
    @Expose
    private Ingredients ingredients;
    @SerializedName("food_pairing")
    @Expose
    private List<String> foodPairing = null;
    @SerializedName("brewers_tips")
    @Expose
    private String brewersTips;
    @SerializedName("contributed_by")
    @Expose
    private String contributedBy;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Brew() {
    }

    /**
     * 
     * @param contributedBy
     * @param targetOg
     * @param method
     * @param foodPairing
     * @param ebc
     * @param description
     * @param srm
     * @param attenuationLevel
     * @param volume
     * @param abv
     * @param imageUrl
     * @param name
     * @param ph
     * @param tagline
     * @param firstBrewed
     * @param ingredients
     * @param targetFg
     * @param brewersTips
     * @param id
     * @param ibu
     * @param boilVolume
     */
    public Brew(Long id, String name, String tagline, String firstBrewed, String description, String imageUrl, Double abv, Long ibu, Long targetFg, Long targetOg, Long ebc, Long srm, Double ph, Long attenuationLevel, Volume volume, BoilVolume boilVolume, Method method, Ingredients ingredients, List<String> foodPairing, String brewersTips, String contributedBy) {
        super();
        this.id = id;
        this.name = name;
        this.tagline = tagline;
        this.firstBrewed = firstBrewed;
        this.description = description;
        this.imageUrl = imageUrl;
        this.abv = abv;
        this.ibu = ibu;
        this.targetFg = targetFg;
        this.targetOg = targetOg;
        this.ebc = ebc;
        this.srm = srm;
        this.ph = ph;
        this.attenuationLevel = attenuationLevel;
        this.volume = volume;
        this.boilVolume = boilVolume;
        this.method = method;
        this.ingredients = ingredients;
        this.foodPairing = foodPairing;
        this.brewersTips = brewersTips;
        this.contributedBy = contributedBy;
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

    public String getTagline() {
        return tagline;
    }

    public void setTagline(String tagline) {
        this.tagline = tagline;
    }

    public String getFirstBrewed() {
        return firstBrewed;
    }

    public void setFirstBrewed(String firstBrewed) {
        this.firstBrewed = firstBrewed;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public Double getAbv() {
        return abv;
    }

    public void setAbv(Double abv) {
        this.abv = abv;
    }

    public Long getIbu() {
        return ibu;
    }

    public void setIbu(Long ibu) {
        this.ibu = ibu;
    }

    public Long getTargetFg() {
        return targetFg;
    }

    public void setTargetFg(Long targetFg) {
        this.targetFg = targetFg;
    }

    public Long getTargetOg() {
        return targetOg;
    }

    public void setTargetOg(Long targetOg) {
        this.targetOg = targetOg;
    }

    public Long getEbc() {
        return ebc;
    }

    public void setEbc(Long ebc) {
        this.ebc = ebc;
    }

    public Long getSrm() {
        return srm;
    }

    public void setSrm(Long srm) {
        this.srm = srm;
    }

    public Double getPh() {
        return ph;
    }

    public void setPh(Double ph) {
        this.ph = ph;
    }

    public Long getAttenuationLevel() {
        return attenuationLevel;
    }

    public void setAttenuationLevel(Long attenuationLevel) {
        this.attenuationLevel = attenuationLevel;
    }

    public Volume getVolume() {
        return volume;
    }

    public void setVolume(Volume volume) {
        this.volume = volume;
    }

    public BoilVolume getBoilVolume() {
        return boilVolume;
    }

    public void setBoilVolume(BoilVolume boilVolume) {
        this.boilVolume = boilVolume;
    }

    public Method getMethod() {
        return method;
    }

    public void setMethod(Method method) {
        this.method = method;
    }

    public Ingredients getIngredients() {
        return ingredients;
    }

    public void setIngredients(Ingredients ingredients) {
        this.ingredients = ingredients;
    }

    public List<String> getFoodPairing() {
        return foodPairing;
    }

    public void setFoodPairing(List<String> foodPairing) {
        this.foodPairing = foodPairing;
    }

    public String getBrewersTips() {
        return brewersTips;
    }

    public void setBrewersTips(String brewersTips) {
        this.brewersTips = brewersTips;
    }

    public String getContributedBy() {
        return contributedBy;
    }

    public void setContributedBy(String contributedBy) {
        this.contributedBy = contributedBy;
    }

}