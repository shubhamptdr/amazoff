package com.amazoff.services;

import com.amazoff.models.DeliveryPartner;
import com.amazoff.models.Order;
import com.amazoff.repositories.Repository;

import java.util.List;

@org.springframework.stereotype.Service
public class Service {

    Repository repository = new Repository();

    public String addOrder(Order order) {
        return repository.addOrder(order);
    }

    public String addPartner(String partnerId) {
        return repository.addPartner(partnerId);
    }

    public String addOrderPartnerPair(String orderId, String partnerId) {
        return repository.addOrderPartnerPair(orderId, partnerId);
    }

    public Order getOrderById(String orderId) {
        return repository.getOrderById(orderId);
    }

    public DeliveryPartner getPartnerById(String partnerId) {
        return repository.getPartnerById(partnerId);
    }

    public Integer getOrderCountByPartnerId(String partnerId) {
        return repository.getOrderCountByPartnerId(partnerId);
    }

    public List<String> getOrdersByPartnerId(String partnerId) {
        return repository.getOrdersByPartnerId(partnerId);
    }

    public List<String> getAllOrders() {
        return repository.getAllOrders();
    }

    public Integer getCountOfUnassignedOrders() {
        return repository.getCountOfUnassignedOrders();
    }

    public Integer getOrdersLeftAfterGivenTimeByPartnerId(String time, String partnerId) {
        return repository.getOrdersLeftAfterGivenTimeByPartnerId(time, partnerId);
    }

    public String getLastDeliveryTimeByPartnerId(String partnerId) {
        return repository.getLastDeliveryTimeByPartnerId(partnerId);
    }

    public String deletePartnerById(String partnerId) {
        return repository.deletePartnerById(partnerId);
    }

    public String deleteOrderById(String orderId) {
        return repository.deleteOrderById(orderId);
    }
}
