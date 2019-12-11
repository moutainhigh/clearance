//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.09.03 at 11:36:21 AM CST 
//


package com.ruoyi.yz.wuliu.ydkj.apply;

import com.ruoyi.yz.base.BaseCif;
import java.math.BigDecimal;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{}client_ship"/>
 *         &lt;element ref="{}goods_name"/>
 *         &lt;element ref="{}total_count"/>
 *         &lt;element ref="{}total_fees"/>
 *         &lt;element ref="{}total_weight"/>
 *         &lt;element ref="{}order_list"/>
 *         &lt;element ref="{}express_type"/>
 *         &lt;element ref="{}delivery_way"/>
 *         &lt;element ref="{}pre_express"/>
 *         &lt;element ref="{}receiver"/>
 *         &lt;element ref="{}sender"/>
 *         &lt;element ref="{}items"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "clientShip",
    "goodsName",
    "totalCount",
    "totalFees",
    "totalWeight",
    "orderList",
    "expressType",
    "deliveryWay",
    "preExpress",
    "receiver",
    "sender",
    "item"
})
@XmlRootElement(name = "ship")
public class YdApplyShip extends BaseCif{

    @XmlElement(name = "client_ship", required = true)
    protected String clientShip;
    @XmlElement(name = "goods_name", required = true)
    protected String goodsName;
    @XmlElement(name = "total_count", required = true)
    protected BigDecimal totalCount;
    @XmlElement(name = "total_fees", required = true)
    protected BigDecimal totalFees;
    @XmlElement(name = "total_weight", required = true)
    protected BigDecimal totalWeight;
    @XmlElement(name = "order_list", required = true)
    protected String orderList;
    @XmlElement(name = "express_type", required = true)
    protected String expressType;
    @XmlElement(name = "delivery_way", required = true)
    protected String deliveryWay;
    @XmlElement(name = "pre_express", required = true)
    protected String preExpress;
    @XmlElement(name="receiver", required = true)
    protected YdApplyReceiver receiver;
    @XmlElement(name="sender", required = true)
    protected YdApplySender sender;
    @XmlElementWrapper(name="items")
    @XmlElement(name="item", required = true)
    protected List<YdApplyItem> item;

    /**
     * Gets the value of the clientShip property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClientShip() {
        return clientShip;
    }

    /**
     * Sets the value of the clientShip property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClientShip(String value) {
        this.clientShip = value;
    }

    /**
     * Gets the value of the goodsName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGoodsName() {
        return goodsName;
    }

    /**
     * Sets the value of the goodsName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGoodsName(String value) {
        this.goodsName = value;
    }

    /**
     * Gets the value of the totalCount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public BigDecimal getTotalCount() {
        return totalCount;
    }

    /**
     * Sets the value of the totalCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTotalCount(BigDecimal value) {
        this.totalCount = value;
    }

    /**
     * Gets the value of the totalFees property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public BigDecimal getTotalFees() {
        return totalFees;
    }

    /**
     * Sets the value of the totalFees property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTotalFees(BigDecimal value) {
        this.totalFees = value;
    }

    /**
     * Gets the value of the totalWeight property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public BigDecimal getTotalWeight() {
        return totalWeight;
    }

    /**
     * Sets the value of the totalWeight property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTotalWeight(BigDecimal value) {
        this.totalWeight = value;
    }

    /**
     * Gets the value of the orderList property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrderList() {
        return orderList;
    }

    /**
     * Sets the value of the orderList property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrderList(String value) {
        this.orderList = value;
    }

    /**
     * Gets the value of the expressType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExpressType() {
        return expressType;
    }

    /**
     * Sets the value of the expressType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExpressType(String value) {
        this.expressType = value;
    }

    /**
     * Gets the value of the deliveryWay property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeliveryWay() {
        return deliveryWay;
    }

    /**
     * Sets the value of the deliveryWay property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeliveryWay(String value) {
        this.deliveryWay = value;
    }

    /**
     * Gets the value of the preExpress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPreExpress() {
        return preExpress;
    }

    /**
     * Sets the value of the preExpress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPreExpress(String value) {
        this.preExpress = value;
    }

    /**
     * Gets the value of the receiver property.
     * 
     * @return
     *     possible object is
     *     {@link YdApplyReceiver }
     *     
     */
    public YdApplyReceiver getReceiver() {
        return receiver;
    }

    /**
     * Sets the value of the receiver property.
     * 
     * @param value
     *     allowed object is
     *     {@link YdApplyReceiver }
     *     
     */
    public void setReceiver(YdApplyReceiver value) {
        this.receiver = value;
    }

    /**
     * Gets the value of the sender property.
     * 
     * @return
     *     possible object is
     *     {@link YdApplySender }
     *     
     */
    public YdApplySender getSender() {
        return sender;
    }

    /**
     * Sets the value of the sender property.
     * 
     * @param value
     *     allowed object is
     *     {@link YdApplySender }
     *     
     */
    public void setSender(YdApplySender value) {
        this.sender = value;
    }

    /**
     * @return the item
     */
    public List<YdApplyItem> getItem() {
        return item;
    }

    /**
     * @param item the item to set
     */
    public void setItem(List<YdApplyItem> item) {
        this.item = item;
    }

}