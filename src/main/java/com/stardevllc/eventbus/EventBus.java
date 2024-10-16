package com.stardevllc.eventbus;

public interface EventBus<E> {
    void post(E event);
    void subscribe(Object object);
    void unsubscribe(Object object);
}
