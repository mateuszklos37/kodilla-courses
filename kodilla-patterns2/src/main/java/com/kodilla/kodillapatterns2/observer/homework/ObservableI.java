package com.kodilla.kodillapatterns2.observer.homework;

public interface ObservableI {
    void registerObserver(ObserverI observerI);
    void notifyObserver();
    void removeObserver(ObserverI observerI);
}
