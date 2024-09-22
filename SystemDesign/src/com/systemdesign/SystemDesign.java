package com.systemdesign;

public class SystemDesign {
    public static void  main(String[] args) {
        // Decorator Pattern
        ChickenBiryani chickenBiryani = new ChickenBiryani();
        HyderabadiBiryani hyderabadiBiryani = new HyderabadiBiryani(chickenBiryani);
        hyderabadiBiryani.prepareBiryani();

        // Observer Pattern
    }
}
