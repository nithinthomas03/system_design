package com.systemdesign.decoratorpattern;

public class ChickenBiryani implements Biryani {
    @Override
    public void prepareBiryani() {
        System.out.println("Preparing Chicken Biryani");
    }
}
