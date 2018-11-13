package com.szxs.service;

import com.szxs.entity.MobilePhoneRental;

import java.util.List;

public interface MobilePhoneRentalService {
    /**
     * 查询 手机租赁
     * @param id 手机租赁 id
     * @return
     */
    public List<MobilePhoneRental> selectMobilePhoneRental(String id);
}
