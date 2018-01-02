package com.example.demo.dao;

import com.example.demo.entity.Account;

/**
 * Created by zsmj on 2017/12/25.
 */
public interface IAccountDAO {
    Account findAccountById(int id);
}
