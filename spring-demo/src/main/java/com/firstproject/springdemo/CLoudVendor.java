package com.firstproject.springdemo;
public class CLoudVendor {
    private String VendorId;
    private String VendorName;
    private String VendorAddress;
    private String VendorPhoneNumber;

     public void CloudVendor() {

      }
    public CLoudVendor(String vendorId, String vendorName, String vendorAddress, String vendorPhoneNumber) {
        this.VendorId = vendorId;
        this.VendorName = vendorName;
        this.VendorAddress = vendorAddress;
        this.VendorPhoneNumber = vendorPhoneNumber;
    }

    public String getVendorId() {
        return VendorId;
    }

    public void setVendorId(String vendorId) {
        VendorId = vendorId;
    }

    public String getVendorName() {
        return VendorName;
    }

    public void setVendorName(String vendorName) {
        VendorName = vendorName;
    }

    public String getVendorAddress() {
        return VendorAddress;
    }

    public void setVendorAddress(String vendorAddress) {
        VendorAddress = vendorAddress;
    }

    public String getVendorPhoneNumber() {
        return VendorPhoneNumber;
    }

    public void setVendorPhoneNumber(String vendorPhoneNumber) {
        VendorPhoneNumber = vendorPhoneNumber;
    }

}
