package com.eacryo.repositoryservice.controller;

import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/repository")
@EnableFeignClients
public class RepositoryReduceController {

    @PostMapping("/reduce")
    public String reduce() {
        return "reduce success";
    }

    @PostMapping("/reduceWithAmount")
    public String reduceWithAmount(@RequestParam int amount) {
        return "reduce success with " + amount;
    }
}
