package com.xxl.job;

import java.math.BigInteger;

public class Test {

    public static void main(String[] args) {
        String tokenJson = new String(new BigInteger("7b226964223a312c22757365726e616d65223a2261646d696e222c2270617373776f7264223a226531306164633339343962613539616262653536653035376632306638383365222c22726f6c65223a312c227065726d697373696f6e223a6e756c6c7d", 16).toByteArray());
        System.out.println(tokenJson);
    }

}
