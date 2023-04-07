package com.vp.ejbexample;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class AddService {

    public ResponseEntity add(NumbersBean numbersBean) {
        int a = numbersBean.getA();
        int b = numbersBean.getB();

        int answer = a + b;

        return new ResponseEntity<>(answer, HttpStatus.OK);
    }
}
