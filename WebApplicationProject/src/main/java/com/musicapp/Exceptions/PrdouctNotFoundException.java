package com.musicapp.Exceptions;

public class PrdouctNotFoundException extends Exception {

    private Long productId;

    public PrdouctNotFoundException() {
    }

    public PrdouctNotFoundException(Long productId) {
        this.productId = productId;
    }

    @Override
    public String toString() {
        return "PrdouctNotFoundException{" + "productId=" + productId + '}';
    }

}
