package com.example.md4_b1customermanager.controller;

import com.example.md4_b1customermanager.model.Customer;
import com.example.md4_b1customermanager.service.CustomerService;
import com.example.md4_b1customermanager.service.CustomerServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class CustomerController {
    private final CustomerService customerService =  new CustomerServiceImpl();

    @GetMapping("/customer")
    public ModelAndView list(){
        ModelAndView modelAndView = new ModelAndView("/WEB-INF/customer/list.jsp");
        List<Customer> customerList = customerService.findAll();
        modelAndView.addObject("customer",customerList);
        return modelAndView;
    }
}


