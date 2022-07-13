package model;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;

public class User {
    private ArrayList<Pokemon> pokemons;
    private HashMap<Integer,Integer> candies; // POKEMON ID - NUMBER OF CANDIES
    private String country;
    private String region;
    private HashMap<Thing,Integer> bag;
    private Integer pokecoins;
    private LocalDateTime lastRewardByTime;
    private LocalDate lastRewardByDay;


    public boolean checkLastRewardByTime(){
        int currentHour = LocalDateTime.now().getHour();
        int currentMinute = LocalDateTime.now().getMinute();


    }

}
