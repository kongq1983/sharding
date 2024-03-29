package com.kq.sharding.insertdata.controller;

import com.kq.sharding.insertdata.dao.AccountDao;
import com.kq.sharding.insertdata.entity.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * AccountController
 *
 * @author kq
 * @date 2019-10-11
 */
@RestController
@RequestMapping("/account")
public class AccountController {

    @Autowired
    private AccountDao accountDao;

    @RequestMapping("/list")
    public List<Account> list(){

        return accountDao.getAccountList();

    }


}
