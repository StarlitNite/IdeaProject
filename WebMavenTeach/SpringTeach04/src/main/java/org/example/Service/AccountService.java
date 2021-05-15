package org.example.Service;

import org.example.Dao.AccountDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AccountService {

    @Autowired
    private AccountDao accountDao;

    public void test(){
        System.out.println("AccountService...");
        accountDao.test();
    }
}
