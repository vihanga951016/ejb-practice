package com.vp.ejbexample;

import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/ejb")
@AllArgsConstructor
public class AddController {

    private final AddService addService;

    @PostMapping("/add")
    public ResponseEntity addTwoNumbers(@RequestBody NumbersBean numbersBean) {
        return addService.add(numbersBean);
    }
}
