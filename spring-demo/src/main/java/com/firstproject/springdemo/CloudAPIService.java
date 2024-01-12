package com.firstproject.springdemo;
import com.firstproject.springdemo.CLoudVendor;
import org.springframework.web.bind.annotation.*;

@RestController
   @RequestMapping("/CloudVendor")
   public class CloudAPIService {
    CLoudVendor cloudVendor;
    @GetMapping("{vendorId}")// for retrive the data
    public CLoudVendor getCloudVendorDetails(String VendorId){
        return cloudVendor ;
        //return new CLoudVendor("C1","Vendor1", "Address one","xxxxxxx");
    }
    @PostMapping//For create  data
    public String createCloudVendorDetails(@RequestBody CLoudVendor cloudVendor){
        this.cloudVendor = cloudVendor;
        return "Cloud vendor Created Succesfully";
}
    @PutMapping// for Update data
    public String updateCloudVendorDetails(@RequestBody CLoudVendor cloudVendor){
        this.cloudVendor = cloudVendor;
        return "Cloud vendor Updated Succesfully";
    }
    @DeleteMapping("{vendorId}") // for Delete data
    public String DeleteCloudVendorDetails(String vendorId){
        this.cloudVendor = null;
        return "Cloud vendor deleted Succesfully";
    }
}
