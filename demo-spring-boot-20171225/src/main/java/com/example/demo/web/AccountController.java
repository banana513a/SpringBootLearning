package com.example.demo.web;

import com.example.demo.service.IAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by zsmj on 2017/12/25.
 */
@Controller
@RequestMapping("/account")
public class AccountController {

    @Autowired
    IAccountService accountService;

    @RequestMapping("/{id}")
    public String getAccountById(Model model, @PathVariable("id") int id) {

        model.addAttribute("index",accountService.findAccountById(id));
        return "index";
    }

}
