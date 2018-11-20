package com.szxs.service;

import com.szxs.entity.*;

import java.util.List;

public interface MobilePhoneRentalService {

    //查询list

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






    //删除对象

    /**
     * 删除 租机品牌
     * @return
     */
    public int deleteBrand( String uuid);

    /**
     * 删除 租机机型
     * @return
     */
    public int deleteTHotDevice( String uuid);

    /**
     * 删除 用户信用值
     * @return
     */
    public int deleteTHotCreditmanagement( String uuid);

    /**
     * 删除 手机热门租机
     * @return
     */
    public int deleteMobilePhoneRental( String uuid);

    /**
     * 删除 手机售后订单
     * @return
     */
    //删除 售后表
    public int deleteMobilePhoneAftersalemanagement(String uuid);
    //删除 订单表
    public int deleteMobilePhoneOrder( String uuid);


    /**
     * 删除 手机异常订单
     * @return
     */
    public int deleteMobilePhoneAbnormalOrder( String uuid );

    /**
     * 删除 还款
     * @return
     */
    public int deleteMobilePhoneRepayment(  String uuid);

    /**
     * 删除 还款异常
     * @return
     */
    public int deleteMobilePhoneRepaymentAbnormal(  String uuid);





    //添加对象

    /**
     * 添加 租机品牌
     * @return
     */
    public int insertBrand(Brand brand);
    /**
     * 添加 租机机型
     * @return
     */
    public int insertTHotDevice(THotDevice tHotDevice);
    /**
     * 添加 用户信用值
     * @return
     */
    public int insertTHotCreditmanagement(THotCreditmanagement tHotCreditmanagement);
    /**
     * 添加 手机热门租机
     * @return
     */
    public int insertMobilePhoneRental(MobilePhoneRental mobilePhoneRental);
    /**
     * 添加 手机售后订单
     * @return
     */
    public int insertMobilePhoneOrder(MobilePhoneOrder mobilePhoneOrder);
    /**
     * 添加 手机异常订单
     * @return
     */
    public int insertMobilePhoneAbnormalOrder(MobilePhoneAbnormalOrder mobilePhoneAbnormalOrder);
    /**
     * 添加 还款
     * @return
     */
    public int insertMobilePhoneRepayment(MobilePhoneRepayment mobilePhoneRepayment);
    /**
     * 添加 还款异常
     * @return
     */
    public int insertMobilePhoneRepaymentAbnormal(MobilePhoneRepayment mobilePhoneRepayment);





    //修改-查询 对象

    /**
     * 修改-查询 租机品牌
     * @return
     */
    public Brand selectBrand( String uuid);
    /**
     * 修改-查询 租机机型
     * @return
     */
    public THotDevice selectTHotDevice( String uuid);
    /**
     * 修改-查询 用户信用值
     * @return
     */
    public THotCreditmanagement selectTHotCreditmanagement( String uuid);
    /**
     * 修改-查询 手机热门租机
     * @return
     */
    public MobilePhoneRental selectMobilePhoneRentalOne( String uuid);
    /**
     * 修改-查询 手机售后订单
     * @return
     */
    public MobilePhoneOrder  selectMobilePhoneOrderOne( String uuid);
    /**
     * 修改-查询 手机异常订单
     * @return
     */
    public MobilePhoneAbnormalOrder selectMobilePhoneAbnormalOrderOne( String uuid);
    /**
     * 修改-查询 还款
     * @return
     */
    public MobilePhoneRepayment selectMobilePhoneRepaymentOne( String uuid);
    /**
     * 修改-查询 还款
     * @return
     */
    public MobilePhoneRepayment selectMobilePhoneRepaymentAbnormalOne( String uuid);


    //修改对象

    /**
     * 修改-查询 租机品牌
     * @return
     */
    public int updateBrandUUId(Brand brand);
    /**
     * 修改-查询 租机机型
     * @return
     */
    public int updateTHotDeviceUUId(THotDevice tHotDevice);
    /**
     * 修改-查询 用户信用值
     * @return
     */
    public int updateTHotCreditmanagementUUId(THotCreditmanagement tHotCreditmanagement);
    /**
     * 修改-查询 手机热门租机
     * @return
     */
    public int updateMobilePhoneRentalUUId(MobilePhoneRental mobilePhoneRental);
    /**
     * 修改-查询 手机售后订单
     * @return
     */
    public int updateMobilePhoneOrderUUId(MobilePhoneOrder mobilePhoneOrder);
    /**
     * 修改-查询 手机异常订单
     * @return
     */
    public int updateMobilePhoneAbnormalOrderUUId(MobilePhoneAbnormalOrder mobilePhoneAbnormalOrder);
    /**
     * 修改-查询 还款
     * @return
     */
    public int updateMobilePhoneRepaymentUUId(MobilePhoneRepayment mobilePhoneRepayment);
    /**
     * 修改-查询 还款异常
     * @return
     */
    public int updateMobilePhoneRepaymentAbnormalUUId(MobilePhoneRepayment mobilePhoneRepayment);

}
