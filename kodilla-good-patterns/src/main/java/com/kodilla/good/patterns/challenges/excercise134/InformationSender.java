package com.kodilla.good.patterns.challenges.excercise134;

public class InformationSender implements InformationService {
    User user;
    Producer producer;

    public InformationSender(User user, Producer producer) {
        this.user = user;
        this.producer = producer;
    }

    public User getUser() {
        return user;
    }

    public Producer getProducent() {
        return producer;
    }

    public void sendMessage(OrderRequest request){
        System.out.println("User: " + request.getUser().getName() + "created order for: " + request.getProduct().getName());
    }
}
