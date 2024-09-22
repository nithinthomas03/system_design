package com.systemdesign.decoratorpattern;

public abstract class BiryaniDecorator implements Biryani {
    protected Biryani biryani;
    public BiryaniDecorator(Biryani biryani) {
        this.biryani = biryani;
    }
    @Override
    public void prepareBiryani() {
        this.biryani.prepareBiryani();
    }
}
