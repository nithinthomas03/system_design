package com.systemdesign;

public class HyderabadiBiryani extends BiryaniDecorator {
    public HyderabadiBiryani(Biryani biryani) {
        super(biryani);
    }

    @Override
    public void prepareBiryani() {
        super.prepareBiryani();
        System.out.println("Adding Hyderabadi spices to the biryani");
    }

}
