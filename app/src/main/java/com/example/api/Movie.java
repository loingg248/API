package com.example.api;
import com.google.gson.annotations.SerializedName;

import java.security.PrivateKey;
import java.util.Date;
import java.util.List;

public class Movie {
    @SerializedName("adult")
    private Boolean adult;

    @SerializedName("backdrop_path")
    private  String backdrop_path;

    @SerializedName("belongs_to_collection")
    private String belongs_to_collection;

    @SerializedName("budget")
    private Integer budget;

    @SerializedName("genres")
    List<Genre> genres;

    @SerializedName("homepage")
    private String homepage;

    @SerializedName("id")
    private Integer id;

    @SerializedName("imdb_id")
    private String imdb_id;

    @SerializedName("original_language")
    private String original_language;

    @SerializedName("original_title")
    private String original_title;

    @SerializedName("overview")
    private String overview;

    @SerializedName("popularity")
    private Double popularity;

    @SerializedName("poster_path")
    private String poster_path;

    @SerializedName("release_date")
    private String release_date;

    @SerializedName("revenue")
    private Integer revenue;

    @SerializedName("runtime")
    private Integer runtime;

    @SerializedName("spoken_languages")
    List<Spoken_Language> spoken_languages;

    @SerializedName("status")
    private String status;

    @SerializedName("tagline")
    private String tagline;

    @SerializedName("title")
    private String title;

    @SerializedName("video")
    private Boolean video;

    @SerializedName("vote_average")
    private Double vote_average;

    @SerializedName("vote_count")
    private Integer vote_count;
}
