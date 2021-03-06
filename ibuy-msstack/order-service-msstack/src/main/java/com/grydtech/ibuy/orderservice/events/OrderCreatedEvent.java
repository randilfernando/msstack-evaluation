package com.grydtech.ibuy.orderservice.events;

import com.grydtech.ibuy.orderservice.entities.OrderEntity;
import com.grydtech.msstack.core.types.messaging.Event;

import java.util.UUID;

public class OrderCreatedEvent extends Event<OrderEntity> {

    private String orderId;
    private String customerId;
    private Double amount;

    public OrderCreatedEvent() {
    }

    public OrderCreatedEvent(String orderId, String customerId, Double amount) {
        this.orderId = orderId;
        this.customerId = customerId;
        this.amount = amount;
    }

    public String getOrderId() {
        return orderId;
    }

    public String getCustomerId() {
        return customerId;
    }

    public Double getAmount() {
        return amount;
    }

    @Override
    public UUID getEntityId() {
        return UUID.fromString(orderId);
    }

    @Override
    public Class<OrderEntity> getEntityClass() {
        return OrderEntity.class;
    }
}