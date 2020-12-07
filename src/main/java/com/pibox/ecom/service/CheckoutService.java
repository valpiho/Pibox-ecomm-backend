package com.pibox.ecom.service;

import com.pibox.ecom.dto.Purchase;
import com.pibox.ecom.dto.PurchaseResponse;

public interface CheckoutService {

    PurchaseResponse placeOrder(Purchase purchase);
}
