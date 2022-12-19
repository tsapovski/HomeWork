package com.overone.blok8.lesson31;

public class State {
    private String country;

    public State(String country) {
        this.country = country;
    }
    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        if(country.equals("Belarus")){
            this.country = country;
        }else{
            System.out.println("You not our friends");
        }

    }

    @Override
    public String toString() {
        return "State{" +
                "Country='" + country + '\'' +
                '}';
    }
}
