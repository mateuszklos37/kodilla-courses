package com.kodilla.good.patterns.challenges.excercise134;

public class Main {
    public static void main(String args[]){
    User piotr = new User("Piotr", "user001");
    User marcin = new User("Marcin", "user002");
    User julita = new User("Julita", "user003");
    Product tomato = new Product("Tomato");
    Product cucumber = new Product("Cucumber");
    Product onion = new Product("Onion");
    Product pasta = new Product("Pasta Gluten Free");
    ExtraFoodShop extraFoodShop = new ExtraFoodShop();
    GlutenFreeShop glutenFreeShop = new GlutenFreeShop();
    HealthyShop healthyShop = new HealthyShop();
    extraFoodShop.setMap(cucumber, 25);
    extraFoodShop.setMap(onion, 44);
    glutenFreeShop.setMap(pasta, 50);
    glutenFreeShop.setMap(tomato, 53);
    healthyShop.setMap(tomato, 32);
    healthyShop.setMap(cucumber, 41);
    OrderRequest julitasRequest = new OrderRequest(julita, cucumber, 7);
    OrderRequest marcinsResquest = new OrderRequest(marcin, tomato, 4);
    OrderRequest piotrRequest = new OrderRequest(piotr, onion, 5);
    extraFoodShop.process(piotrRequest);
    extraFoodShop.process(marcinsResquest);
    glutenFreeShop.process(julitasRequest);
    healthyShop.process(julitasRequest);
    }
}
