package com.rhinoceros.mall.core.po;

import com.rhinoceros.mall.core.enumeration.OrderStatus;
import com.rhinoceros.mall.core.enumeration.PayType;
import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

/**
 * 订单实体
 */
@Data
public class Order {
    /**
     * 订单id
     */
    private Long id;
    /**
     * 订单状态
     */
    private OrderStatus status;
    /**
     * 订单编号
     */
    private String identifier;
    /**
     * 创建时间
     */
    private Date createAt;

    /**
     * 支付时间
     */
    private Date payAt;
    /**
     * 发货时间
     */
    private Date deliverAt;

    /**
     * 订单完成时间，包括退货、收货等是订单结束的时间
     */
    private Date finishAt;

    /**
     * 总价
     */
    private BigDecimal totalPrice;

    /**
     * 快递单号
     */
    private String expressNum;

    /**
     * 收货信息id
     */
    private Long addressId;

    /**
     * 订单对应的用户id
     */
    private Long userId;
    /**
     * 商品id
     */
    private Long productId;
    /**
     * 购买数量
     */
    private Integer productNum;
    /**
     * 支付方式
     */
    private PayType payType;

}

