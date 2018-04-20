package com.example.android.javajokes;

import java.util.ArrayList;
import java.util.Random;

public class Comedian {

    private ArrayList<String> jokes = new ArrayList<>();

    public Comedian(){

        // Insert jokes into ArrayList
        initializeJokes();
    }

    public String tellJoke(){

        // Get a random number between 0 and jokes.size - 1
        Random r = new Random();
        int low = 0;
        int high = jokes.size() - 1;
        int random = r.nextInt(high - low) + low;

        return jokes.get(random);
    }

    private void initializeJokes(){
        jokes.add("\n" +
                "Parallel lines have so much in common,\n" +
                "it's a shame they're never gonna meet.");
        jokes.add("What does a vegan zombie eat?\n" +
                "Graaaaaaaaaaaaaaaaaaaains!!\n");
        jokes.add("What did one snowman say to the other snowman?\n" +
                "It smells like carrots out here!\n");
        jokes.add("Where do cows go for a first date?\n" +
                "To the moooovies!");
        jokes.add("What does a clock do when it's hungry?\n" +
                "It goes back four seconds!");
    }

}
