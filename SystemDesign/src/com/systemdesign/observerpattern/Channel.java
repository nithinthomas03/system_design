package com.systemdesign.observerpattern;

public interface Channel {
    public void notifySubscribers();
    public void addSubscriber(Subscriber subscriber);
    public void removeSubscriber(Subscriber subscriber);
    public void upload(String title);
}
