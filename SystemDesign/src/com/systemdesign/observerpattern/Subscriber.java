package com.systemdesign.observerpattern;

public class Subscriber implements Observer{
    String subscriberName;
    public Subscriber(String subscriberName) {
        this.subscriberName = subscriberName;
    }
    @Override
    public void update(String channelName) {
        System.out.println(subscriberName + ", new video uploaded by " + channelName);
    }
}
