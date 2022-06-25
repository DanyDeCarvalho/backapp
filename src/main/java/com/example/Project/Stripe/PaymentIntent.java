package com.example.Project.Stripe;

import com.stripe.Stripe;
import com.stripe.exception.StripeException;
import com.stripe.model.PaymentIntent;
import com.stripe.param.PaymentIntentCreateParams;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
class CreatePaymentIntent {
    @PostMapping("/payment/stripe/{total}")
    public ResponseEntity<Object> PaymentIntent(@PathVariable Double total) throws StripeException {

        Stripe.apiKey = "sk_test_51LEMZGDtLGkdFIem24zZBSGFnjQ9lJuSqqY6cEZCqb8yliq5ZHzLniAlIRn88Lg1NUon3bvwKiOrlYGdGg3vSvza00y3jBDjoz";

        PaymentIntentCreateParams params =
                PaymentIntentCreateParams.builder()
                        .setAmount((long)(int)(total*100))
                        .setCurrency("eur")
                        .setAutomaticPaymentMethods(
                                PaymentIntentCreateParams.AutomaticPaymentMethods
                                        .builder()
                                        .setEnabled(true)
                                        .build()
                        )
                        .build();

        // Create a PaymentIntent with the order amount and currency
        PaymentIntent paymentIntent = PaymentIntent.create(params);

        return ResponseEntity.ok(paymentIntent.getClientSecret());
    }
}
