package org.example.Action;

import org.example.Action.Marry;
import org.example.Action.RentHouse;

public class you implements RentHouse , Marry {
    @Override
    public void toRentHouse() {
        System.out.println("我要租一个两室一厅，预算5K！");
    }

    @Override
    public void toMarry() {
        System.out.println("结婚ing...");
    }
}
