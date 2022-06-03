package com.bz.analyzer;

import com.bz.analyzer.exception.MoodAnalyzerException;
import org.junit.Assert;
import org.junit.Test;

public class MoodAnalyzerTest {
    MoodAnalyzer moodAnalyzer = new MoodAnalyzer();

    @Test
    public void givenMessage_WhenSadMessage_ShouldReturnSadMood() {
        moodAnalyzer.setMessage("i am in sad mood");
        String mood = moodAnalyzer.analyzerMood();
        Assert.assertEquals("SAD",mood);
    }

    @Test
    public void givenMessage_WhenAnyMessage_ShouldReturnHappyMood() {
        moodAnalyzer.setMessage("i an in any mood");
        String mood = moodAnalyzer.analyzerMood();
        Assert.assertEquals("Happy",mood);
    }

    @Test
    public void givenMessageInConstructor_WhenSadMsg_ShouldReturnSadMood() {
        MoodAnalyzer analyser = new MoodAnalyzer("i am in Sad mood");
        String mood = analyser.analyzerMood();
        Assert.assertEquals("SAD",mood);
    }

    @Test
    public void givenMessage_WhenWeHaveNullException() {
        moodAnalyzer.setMessage("");
        String mood = moodAnalyzer.analyzerMood();
        Assert.assertEquals("Happy",mood);
    }

    @Test(expected = MoodAnalyzerException.class)
    public void givenMessage_WhenWeHaveNullException_ShouldThrowException() {
        moodAnalyzer.setMessage(null);
        String mood = moodAnalyzer.analyzerMood();
        Assert.assertEquals("Happy",mood);
    }

    @Test
    public void givenMessage_WhenWeHave() {

    }
}
