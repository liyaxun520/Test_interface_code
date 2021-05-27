package com.decard.inter.impl;

import com.decard.inter.UserInterface;

public class UserService1 implements UserInterface {
    @Override
    public void addUser() {
        System.out.println("添加用户--------------01");
    }
}
