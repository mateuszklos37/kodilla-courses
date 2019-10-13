package com.kodilla.patterns.strategy.social;

import org.junit.Assert;
import org.junit.Test;

public class UserTestSuite {
    @Test
    public void testDefaultSharingStrategies(){
        //Given
        User jan = new Millenials("Jan");
        User patryk = new ZGeneration("Patryk");
        User slawomir = new YGeneration("Slawomir");
        //When
        String janPublishesBy = jan.sharePost();
        System.out.println("Janek " + jan.sharePost());
        String patrykPublishesBy = patryk.sharePost();
        System.out.println("Patryk " + patryk.sharePost());
        String slawomirPublishesBy = slawomir.sharePost();
        System.out.println("Slawek " + slawomir.sharePost());
        //Then
        Assert.assertEquals("use snapchat!",janPublishesBy);
        Assert.assertEquals("use facebook!",patrykPublishesBy);
        Assert.assertEquals("use Twitter!",slawomirPublishesBy);
    }
    @Test
    public void testIndividualSharingStrategy(){
        //Given
        User jan = new Millenials("Jan");
        User patryk = new ZGeneration("Patryk");
        User slawomir = new YGeneration("Slawomir");
        //When
        String janPublishesBy = jan.sharePost();
        System.out.println("Janek " + janPublishesBy);
        jan.setSocialPublisher(new TwitterPublisher());
        janPublishesBy = jan.sharePost();
        System.out.println("Janek " + janPublishesBy);
        //Then
        Assert.assertEquals("use Twitter!", janPublishesBy);
    }
}
