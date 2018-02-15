package com.kodilla.patterns.strategy.social;

import com.kodilla.patterns.strategy.social.publisher.FacebookPublisher;
import com.kodilla.patterns.strategy.social.publisher.TwitterPublisher;
import com.kodilla.patterns.strategy.social.userType.Millenials;
import com.kodilla.patterns.strategy.social.userType.YGeneration;
import com.kodilla.patterns.strategy.social.userType.ZGeneration;
import org.junit.Assert;
import org.junit.Test;

public class UserTestSuite {

    @Test
    public void testDefaultSharingStrategies() {
        //Given
        User konrad = new Millenials("Konrad Smuga");
        User dawid = new YGeneration("Dawid Kowalski");
        User ania = new ZGeneration("Anna Korzeniowska");

        //When
        String konradShouldShare = konrad.predict();
        System.out.println("Konrad social: " + konradShouldShare);
        String dawidShouldShare = dawid.predict();
        System.out.println("Dawid social : " + dawidShouldShare);
        String aniaShouldShare = ania.predict();
        System.out.println("Anna social: " + aniaShouldShare);

        //Then
        Assert.assertEquals("Publishing post on Facebook", konradShouldShare);
        Assert.assertEquals("Publishing post on Snaptchat", dawidShouldShare);
        Assert.assertEquals("Publishing post on Twitter", aniaShouldShare);
    }

    @Test
    public void testIndividualSharingStrategy() {
        //Given
        User konrad = new Millenials("Konrad Smuga");

        //When
        String konradShouldShare = konrad.predict();
        System.out.println("Konrad social: " + konradShouldShare);
        konrad.setSocialPublisher(new TwitterPublisher());
        konrad.sharePost("mój post");
        konradShouldShare = konrad.predict();
        System.out.println("Konrad now should: " + konradShouldShare);

        //Then
        Assert.assertEquals("Publishing post on Twitter", konradShouldShare);
    }
}
