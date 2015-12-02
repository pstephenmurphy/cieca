package com.mitchell.estimate.resource.entity.vehicle.vin;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
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
     *         &lt;element name="VINSource" type="{http://www.cieca.com/BMS}VINSourceEnum" minOccurs="0"/>
     *         &lt;element name="VINFormat" type="{http://www.cieca.com/BMS}VINFormatEnum" minOccurs="0"/>
     *         &lt;element name="VINNum">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.cieca.com/BMS}C">
     *               &lt;minLength value="1"/>
     *               &lt;maxLength value="30"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="VINDecodeCorrectInd" type="{http://www.cieca.com/BMS}Boolean" minOccurs="0"/>
     *         &lt;element name="VINDecodeStatus" type="{http://www.cieca.com/BMS}VINDecodeStatusEnum" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "VINType", propOrder = {
        "vinSource",
        "vinFormat",
        "vinNum",
        "vinDecodeCorrectInd",
        "vinDecodeStatus"
    })
    public class VINType
        implements Serializable
    {

        private final static long serialVersionUID = 20120208L;
        @XmlElement(name = "VINSource")
        protected VINSourceEnum vinSource;
        @XmlElement(name = "VINFormat")
        protected VINFormatEnum vinFormat;
        @XmlElement(name = "VINNum", required = true)
        protected String vinNum;
        @XmlElement(name = "VINDecodeCorrectInd")
        protected Boolean vinDecodeCorrectInd;
        @XmlElement(name = "VINDecodeStatus")
        protected VINDecodeStatusEnum vinDecodeStatus;

        /**
         * Gets the value of the vinSource property.
         * 
         * @return
         *     possible object is
         *     {@link VINSourceEnum }
         *     
         */
        public VINSourceEnum getVINSource() {
            return vinSource;
        }

        /**
         * Sets the value of the vinSource property.
         * 
         * @param value
         *     allowed object is
         *     {@link VINSourceEnum }
         *     
         */
        public void setVINSource(VINSourceEnum value) {
            this.vinSource = value;
        }

        /**
         * Gets the value of the vinFormat property.
         * 
         * @return
         *     possible object is
         *     {@link VINFormatEnum }
         *     
         */
        public VINFormatEnum getVINFormat() {
            return vinFormat;
        }

        /**
         * Sets the value of the vinFormat property.
         * 
         * @param value
         *     allowed object is
         *     {@link VINFormatEnum }
         *     
         */
        public void setVINFormat(VINFormatEnum value) {
            this.vinFormat = value;
        }

        /**
         * Gets the value of the vinNum property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getVINNum() {
            return vinNum;
        }

        /**
         * Sets the value of the vinNum property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setVINNum(String value) {
            this.vinNum = value;
        }

        /**
         * Gets the value of the vinDecodeCorrectInd property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean getVINDecodeCorrectInd() {
            return vinDecodeCorrectInd;
        }

        /**
         * Sets the value of the vinDecodeCorrectInd property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setVINDecodeCorrectInd(Boolean value) {
            this.vinDecodeCorrectInd = value;
        }

        /**
         * Gets the value of the vinDecodeStatus property.
         * 
         * @return
         *     possible object is
         *     {@link VINDecodeStatusEnum }
         *     
         */
        public VINDecodeStatusEnum getVINDecodeStatus() {
            return vinDecodeStatus;
        }

        /**
         * Sets the value of the vinDecodeStatus property.
         * 
         * @param value
         *     allowed object is
         *     {@link VINDecodeStatusEnum }
         *     
         */
        public void setVINDecodeStatus(VINDecodeStatusEnum value) {
            this.vinDecodeStatus = value;
        }

    }

