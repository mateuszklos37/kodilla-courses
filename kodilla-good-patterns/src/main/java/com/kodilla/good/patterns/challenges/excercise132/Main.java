package com.kodilla.good.patterns.challenges.excercise132;

public class Main {
    public static void main(String args[]){
        InformationSender sender1 = new InformationSender();
        RepositoryCreator repositoryCreator1 = new RepositoryCreator();
        OrderCreator orderCreator1 = new OrderCreator();
        User user1 = new User("Maciej", "Kowalski", "Kowal", "WRO123");
        Product product1 = new Product("TV", 1200);
        OrderRequest orderRequest1 = new OrderRequest(user1, product1);
        ProductOrderService service1 = new ProductOrderService(sender1, repositoryCreator1, orderCreator1);
        service1.process(orderRequest1);
    }
}
