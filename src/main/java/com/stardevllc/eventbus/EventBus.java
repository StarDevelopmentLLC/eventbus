package com.stardevllc.eventbus;

public interface EventBus {
    void post(Event event);
    void registerListener(Object object);
    void removeListener(Object object);
}
