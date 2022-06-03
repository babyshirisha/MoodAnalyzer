package com.bz.analyzer;

import com.bz.analyzer.exception.MoodAnalyzerException;

import java.util.Locale;


public class MoodAnalyzer {
    String message;

    public MoodAnalyzer(String msg) {
        this.message = msg;
    }

    public MoodAnalyzer() {

    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String analyzerMood() {
        final String sadMood = "SAD";
        try {
            if (message.toUpperCase().contains(sadMood)) {
                return sadMood;
            }
            return "Happy";
        } catch (NullPointerException e){
            throw new MoodAnalyzerException("invalid message");
        }

    }


}
