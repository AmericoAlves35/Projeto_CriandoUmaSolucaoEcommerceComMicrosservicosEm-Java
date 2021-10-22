package com.americo.ecommerce.checkout.service;

import com.americo.ecommerce.checkout.entity.CheckoutEntity;
import com.americo.ecommerce.checkout.resource.checkout.CheckoutRequest;


import java.util.Optional;

public interface CheckoutService {

    Optional<CheckoutEntity> create(CheckoutRequest checkoutRequest);

    Optional<CheckoutEntity> updateStatus(String checkoutCode, CheckoutEntity.Status status);
}
