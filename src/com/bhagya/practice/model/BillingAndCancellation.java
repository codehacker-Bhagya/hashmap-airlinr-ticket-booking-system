package com.bhagya.practice.model;

public class BillingAndCancellation {

    private String PaymentMethod;
    private int Upiid;

    @Override
    public String toString() {
        return "BillingAndCancellation{" +
                "PaymentMethod='" + PaymentMethod + '\'' +
                ", Upiid=" + Upiid +
                '}';
    }

    public String getPaymentMethod() {
        return PaymentMethod;
    }

    public void setPaymentMethod(String paymentMethod) {
        PaymentMethod = paymentMethod;
    }

    public int getUpiid() {
        return Upiid;
    }

    public void setUpiid(int upiid) {
        Upiid = upiid;
    }
}
