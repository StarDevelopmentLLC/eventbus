package com.stardevllc.eventbus;

public interface EventBus {
    void post(Event event);
    void subscribe(Object object);
    void unsubscribe(Object object);
}
