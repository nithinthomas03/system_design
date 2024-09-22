package com.systemdesign;

import com.systemdesign.decoratorpattern.ChickenBiryani;
import com.systemdesign.decoratorpattern.HyderabadiBiryani;
import com.systemdesign.observerpattern.Subscriber;
import com.systemdesign.observerpattern.YoutubeChannel;

public class SystemDesign {
    public static void  main(String[] args) {
        // Decorator Pattern
        System.out.println("Decorator Pattern \n");
        ChickenBiryani chickenBiryani = new ChickenBiryani();
        HyderabadiBiryani hyderabadiBiryani = new HyderabadiBiryani(chickenBiryani);
        hyderabadiBiryani.prepareBiryani();
        System.out.println("\n");

        // Observer Pattern
        System.out.println("Observer Pattern \n");
        YoutubeChannel youtubeChannel = new YoutubeChannel("TechGeeks");
        Subscriber subscriber1 = new Subscriber("John");
        youtubeChannel.addSubscriber(subscriber1);
        youtubeChannel.upload("Design Patterns");
        System.out.println("\n");


    }
}
