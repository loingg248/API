package com.example.api;

import com.google.gson.annotations.SerializedName;

public class Crew {
    @SerializedName("adult")
    private Boolean adult;

    @SerializedName("gender")
    private Integer gender;

    @SerializedName("id")
    private Integer id;

    @SerializedName("known_for_department")
    private String known_for_department;

    @SerializedName("name")
    private String name;

    @SerializedName("original_name")
    private String original_name;

    @SerializedName("popularity")
    private Double popularity;

    @SerializedName("profile_path")
    private String profile_path;

    @SerializedName("credit_id")
    private String credit_id;

    @SerializedName("department")
    private String department;

    @SerializedName("job")
    private String job;
}
