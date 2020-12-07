package com.pibox.ecom.dto;

import com.pibox.ecom.entity.Address;
import com.pibox.ecom.entity.Customer;
import com.pibox.ecom.entity.Order;
import com.pibox.ecom.entity.OrderItem;
import lombok.Data;

import java.util.Set;

@Data
public class Purchase {

    private Customer customer;
    private Address shippingAddress;
    private Address billingAddress;
    private Order order;
    private Set<OrderItem> orderItems;
}
