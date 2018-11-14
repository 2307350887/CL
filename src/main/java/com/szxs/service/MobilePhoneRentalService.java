package com.szxs.service;

import com.szxs.entity.*;

import java.util.List;

public interface MobilePhoneRentalService {
    /**
     * 查询 租机机型
     * @return
     */
    public List<THotDevice> selectTHotDeviceList();
    /**
     * 查询 租机品牌
     * @return
     */
    public List<Brand> selectBrandList();
    /**
     * 查询 用户信用值
     * @return
     */
    public List<THotCreditmanagement> selectTHotCreditmanagementList();
    /**
     * 查询 手机热门租机
     * @return
     */
    public List<MobilePhoneRental> selectMobilePhoneRental();

    /**
     * 查询 手机售后订单
     * @return
     */
    public List<MobilePhoneAfterSaleOrder> MobilePhoneOrder();

    /**
     * 查询 手机订单
     * @return
     */
    public List<MobilePhoneOrder> selectMobilePhoneOrder();


    /**
     * 查询 手机异常订单
     * @return
     */
    public List<MobilePhoneAbnormalOrder> selectMobilePhoneAbnormalOrder();

    /**
     * 查询 还款
     * @return
     */
    public List<MobilePhoneRepayment> selectMobilePhoneRepayment();

    /**
     * 查询 还款异常
     * @return
     */
    public List<MobilePhoneRepayment> selectMobilePhoneRepaymentAbnormal();
}
