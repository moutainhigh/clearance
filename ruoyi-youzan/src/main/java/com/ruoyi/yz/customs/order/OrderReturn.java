//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.03.28 at 10:21:08 PM CST 
//


package com.ruoyi.yz.customs.order;

import com.ruoyi.yz.base.BaseCif;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
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
 *         &lt;element ref="{http://www.chinaport.gov.cn/ceb}guid"/>
 *         &lt;element ref="{http://www.chinaport.gov.cn/ceb}ebpCode"/>
 *         &lt;element ref="{http://www.chinaport.gov.cn/ceb}ebcCode"/>
 *         &lt;element ref="{http://www.chinaport.gov.cn/ceb}orderNo"/>
 *         &lt;element ref="{http://www.chinaport.gov.cn/ceb}returnStatus"/>
 *         &lt;element ref="{http://www.chinaport.gov.cn/ceb}returnTime"/>
 *         &lt;element ref="{http://www.chinaport.gov.cn/ceb}returnInfo"/>
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
    "guid",
    "ebpCode",
    "ebcCode",
    "orderNo",
    "returnStatus",
    "returnTime",
    "returnInfo"
})
@XmlRootElement(name = "OrderReturn")
public class OrderReturn  extends BaseCif{

    @XmlElement(required = true)
    private String guid;
    @XmlElement(required = true)
    private String ebpCode;
    @XmlElement(required = true)
    private String ebcCode;
    @XmlElement(required = true)
    private String orderNo;
    @XmlElement(required = true)
    private String returnStatus;
    @XmlElement(required = true)
    private String returnTime;
    @XmlElement(required = true)
    private String returnInfo;

    /**
     * Gets the value of the guid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGuid() {
        return guid;
    }

    /**
     * Sets the value of the guid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGuid(String value) {
        this.guid = value;
    }

    /**
     * Gets the value of the ebpCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEbpCode() {
        return ebpCode;
    }

    /**
     * Sets the value of the ebpCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEbpCode(String value) {
        this.ebpCode = value;
    }

    /**
     * Gets the value of the ebcCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEbcCode() {
        return ebcCode;
    }

    /**
     * Sets the value of the ebcCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEbcCode(String value) {
        this.ebcCode = value;
    }

    /**
     * Gets the value of the orderNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrderNo() {
        return orderNo;
    }

    /**
     * Sets the value of the orderNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrderNo(String value) {
        this.orderNo = value;
    }

    /**
     * Gets the value of the returnStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReturnStatus() {
        return returnStatus;
    }

    /**
     * Sets the value of the returnStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReturnStatus(String value) {
        this.returnStatus = value;
    }

    /**
     * Gets the value of the returnTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReturnTime() {
        return returnTime;
    }

    /**
     * Sets the value of the returnTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReturnTime(String value) {
        this.returnTime = value;
    }

    /**
     * Gets the value of the returnInfo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReturnInfo() {
        return returnInfo;
    }

    /**
     * Sets the value of the returnInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReturnInfo(String value) {
        this.returnInfo = value;
    }

}
