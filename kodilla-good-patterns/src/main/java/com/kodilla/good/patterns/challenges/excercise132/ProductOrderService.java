package com.kodilla.good.patterns.challenges.excercise132;

public class ProductOrderService {
    InformationService informationService;
    OrderRepository orderRepository;
    OrderService orderService;

    public ProductOrderService(InformationService informationService, OrderRepository orderRepository, OrderService orderService) {
        this.informationService = informationService;
        this.orderRepository = orderRepository;
        this.orderService = orderService;
    }

    public OrderDto process(final OrderRequest orderRequest){
        boolean isOrdered = orderService.order(orderRequest.getUser(), orderRequest.getProduct(), orderRequest.getDate());

        if (isOrdered){
            informationService.sendMessage(orderRequest.getUser());
            orderRepository.createOrder(orderRequest.getUser(), orderRequest.getProduct(), orderRequest.getDate());
            return new OrderDto(orderRequest.getUser(), orderRequest.getProduct(), true);
        }
        else {
            return new OrderDto(orderRequest.getUser(), orderRequest.getProduct(), false);
        }
    }


}
