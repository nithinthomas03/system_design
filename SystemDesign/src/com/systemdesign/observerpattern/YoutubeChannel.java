package com.systemdesign.observerpattern;

import java.util.ArrayList;

public class YoutubeChannel implements Channel{
    String channelName;
    ArrayList<Subscriber> subscribers = new ArrayList<Subscriber>();

    public YoutubeChannel(String channelName) {
        this.channelName = channelName;
    }

    @Override
    public void addSubscriber(Subscriber subscriber) {
        subscribers.add(subscriber);
    }

    @Override
    public void removeSubscriber(Subscriber subscriber) {
        subscribers.remove(subscriber);
    }
    @Override
    public void notifySubscribers() {
        for(Subscriber subscriber: subscribers) {
            subscriber.update(channelName);
        }
    }
    @Override
    public void upload(String title) {
        System.out.println("Uploaded video with title: " + title);
        notifySubscribers();
    }
}
