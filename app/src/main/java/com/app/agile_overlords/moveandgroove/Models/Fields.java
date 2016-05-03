package com.app.agile_overlords.moveandgroove.Models;

/**
 * Created by Never Forget on 4/7/2016.
 */
public class Fields {
    private String item_name;
    private String brand_name;
    private Double nf_calories;
    private Double nf_calories_from_fat;
    private Double nf_total_fat;
    private Double nf_saturated_fat;
    private Double nf_trans_fatty_acid;
    private Double nf_polyunsaturated_fat; // Don't need
    private Double nf_monounsaturated_fat; // Don't need
    private Double nf_cholesterol;
    private Double nf_sodium;
    private Double nf_total_carbohydrate;
    private Double nf_dietary_fiber;
    private Double nf_sugars;
    private Double nf_vitamin_c_dv;
    private Double nf_calcium_dv;
    private Double nf_iron_dv;
    private Double nf_servings_per_container; // Don't need
    private Double nf_serving_size_qty; // Don't need
    private String nf_serving_size_unit; // Don't need
    private Double nf_serving_weight_grams;

    // TODO: Connect to NutritionItemModel and change some data types?
    public String getItem_name() {
        return item_name;
    }

    public String getBrand_name() {
        return brand_name;
    }

    public Double getNf_calories() {
        return nf_calories;
    }

    public String get_calories(){
        String number = String.valueOf(nf_calories);
        return number;
    }

    public Double getNf_calories_from_fat() {
        return nf_calories_from_fat;
    }

    public Double getNf_total_fat() {
        return nf_total_fat;
    }

    public Double getNf_saturated_fat() {
        return nf_saturated_fat;
    }

    public Double getNf_trans_fatty_acid() {
        return nf_trans_fatty_acid;
    }

    public Double getNf_polyunsaturated_fat() {
        return nf_polyunsaturated_fat;
    }

    public Double getNf_monounsaturated_fat() {
        return nf_monounsaturated_fat;
    }

    public Double getNf_cholesterol() {
        return nf_cholesterol;
    }

    public Double getNf_sodium() {
        return nf_sodium;
    }

    public Double getNf_total_carbohydrate() {
        return nf_total_carbohydrate;
    }

    public Double getNf_dietary_fiber() {
        return nf_dietary_fiber;
    }

    public Double getNf_sugars() {
        return nf_sugars;
    }

    public Double getNf_vitamin_c_dv() {
        return nf_vitamin_c_dv;
    }

    public Double getNf_calcium_dv() {
        return nf_calcium_dv;
    }

    public Double getNf_iron_dv() {
        return nf_iron_dv;
    }

    public Double getNf_servings_per_container() {
        return nf_servings_per_container;
    }

    public Double getNf_serving_size_qty() {
        return nf_serving_size_qty;
    }

    public String getNf_serving_size_unit() {
        return nf_serving_size_unit;
    }

    public Double getNf_serving_weight_grams() {
        return nf_serving_weight_grams;
    }
}

