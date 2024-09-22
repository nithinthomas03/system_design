package com.systemdesign;

import com.systemdesign.decoratorpattern.ChickenBiryani;
import com.systemdesign.decoratorpattern.HyderabadiBiryani;

public class SystemDesign {
    public static void  main(String[] args) {
        // Decorator Pattern
        ChickenBiryani chickenBiryani = new ChickenBiryani();
        HyderabadiBiryani hyderabadiBiryani = new HyderabadiBiryani(chickenBiryani);
        hyderabadiBiryani.prepareBiryani();

        // Observer Pattern
    }
}
