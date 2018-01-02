package com.example.demo.service.impl;

import com.example.demo.dao.IAccountDAO;
import com.example.demo.entity.Account;
import com.example.demo.service.IAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by zsmj on 2017/12/25.
 */
@Service
public class AccountService implements IAccountService {

    @Autowired
    IAccountDAO accountDAO;

    @Override
    public Account findAccountById(int id) {
        return accountDAO.findAccountById(id);
    }


}
