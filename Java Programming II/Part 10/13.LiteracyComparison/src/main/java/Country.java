/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author micha
 */
public class Country {
    private String theme;
    private String ageGroup;
    private String gender;
    private String name;
    private int year;
    private double literacyPer;

    public Country(String theme, String ageGroup, String gender, String name, int year, double literacyPer) {
        this.theme = theme;
        this.ageGroup = ageGroup;
        this.gender = gender;
        this.name = name;
        this.year = year;
        this.literacyPer = literacyPer;
    }

    public String getGender() {
        return gender;
    }

    public String getName() {
        return name;
    }

    public int getYear() {
        return year;
    }

    public double getLiteracyPer() {
        return literacyPer;
    }


    
    
}
