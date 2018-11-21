package com.szxs.service;

import com.szxs.entity.*;

import java.util.List;

public interface MobilePhoneRentalService {

    //查询list
    //查询品牌List
    public List<Brand> selectBrandList();
    //手机信息
    public List<THotDevice> selectTHotDeviceList();
    //信息用值
    public List<THotCreditmanagement> selectTHotCreditmanagementList();
    //热门
    public List<MobilePhoneRental> selectMobilePhoneRental();
    //订单及售后订单
    public List<MobilePhoneOrder>  selectMobilePhoneOrder();
    //售后
    public List<MobilePhoneAfterSaleOrder> MobilePhoneOrder();
    //异常订单
    public List<MobilePhoneAbnormalOrder> selectMobilePhoneAbnormalOrder();
    //还款
    public List<MobilePhoneRepayment> selectMobilePhoneRepayment();
    //异常还款
    public List<MobilePhoneRepayment> selectMobilePhoneRepaymentAbnormal();


    //修改对象
    //修改品牌
    public int updateBrandUUId(Brand brand);
    //修改手机信息
    public int updateTHotDeviceUUId(THotDevice tHotDevice);
    //修改信用值
    public int updateTHotCreditmanagementUUId(THotCreditmanagement tHotCreditmanagement);
    //修改热门
    public int updateMobilePhoneRentalUUId(THotModel tHotModel);
    //修改售后
    public int updateMobilePhoneOrderUUIds(THotAftersalemanagement tHotAftersalemanagement);
    //修改订单及售后订单
    public int updateMobilePhoneOrderUUId(THotOrder tHotOrder);
    //修改异常订单
    public int updateMobilePhoneAbnormalOrderUUId(THotOrder tHotOrder);
    //修改还款
    public int updateMobilePhoneRepaymentUUId(THotRepaymenttable tHotRepaymenttable);
    //修改异常还款
    public int updateMobilePhoneRepaymentAbnormalUUId(THotRepaymenttable tHotRepaymenttable);



    //修改-查询对象
    //修改-查询品牌
    public Brand selectBrand( String uuid);
    //修改-查询手机信息
    public THotDevice selectTHotDevice( String uuid);
    //修改-查询信用值
    public THotCreditmanagement selectTHotCreditmanagement( String uuid);
    //修改-查询热门
    public MobilePhoneRental selectMobilePhoneRentalOne( String uuid);
    //修改-查询售后信息
    public MobilePhoneAfterSaleOrder MobilePhoneOrderOne( String uuid);
    //修改-查询订单及售后订单
    public MobilePhoneOrder  selectMobilePhoneOrderOne( String uuid);
    //修改-查询异常订单
    public MobilePhoneAbnormalOrder selectMobilePhoneAbnormalOrderOne( String uuid);
    //修改-查询还款
    public MobilePhoneRepayment selectMobilePhoneRepaymentOne( String uuid);
    //修改-查询异常还款
    public MobilePhoneRepayment selectMobilePhoneRepaymentAbnormalOne( String uuid);




    //添加对象
    //添加品牌
    public int insertBrand(Brand brand);
    //添加手机信息
    public int insertTHotDevice(THotDevice tHotDevice);
    //添加信用
    public int insertTHotCreditmanagement(THotCreditmanagement tHotCreditmanagement);
    //添加热门
    public int insertMobilePhoneRental(THotModel tHotModel);
    //添加订单及售后订单
    public int insertMobilePhoneOrder(THotOrder tHotOrder);
    //添加售后表
    public int insertMobilePhoneAftersalemanagement(THotAftersalemanagement tHotAftersalemanagement);
    //添加异常订单
    public int insertMobilePhoneAbnormalOrder(THotOrder tHotOrder);
    //添加还款
    public int insertMobilePhoneRepayment(THotRepaymenttable tHotRepaymenttable);
    //添加异常还款
    public int insertMobilePhoneRepaymentAbnormal(THotRepaymenttable tHotRepaymenttable);




    //删除对象
    //删除品牌
    public int deleteBrand( String uuid);
    //删除手机信息
    public int deleteTHotDevice( String uuid);
    //删除信用值
    public int deleteTHotCreditmanagement( String uuid);
    //删除热门
    public int deleteMobilePhoneRental( String uuid);
    //删除售后先删  售后表 在删 关联的 订单表
    //售后表
    public int deleteMobilePhoneAftersalemanagement( String uuid);
    //订单表   (删除售后和删除订单公用一个方法)
    public int deleteMobilePhoneOrder( String uuid);
    //删除异常订单
    public int deleteMobilePhoneAbnormalOrder( String uuid );
    //删除还款
    public int deleteMobilePhoneRepayment( String uuid);
    //删除异常还款
    public int deleteMobilePhoneRepaymentAbnormal(  String uuid);
}
