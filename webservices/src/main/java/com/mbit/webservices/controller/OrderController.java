package com.mbit.webservices.controller;

import com.mbit.webservices.domain.Order;
import org.springframework.web.bind.annotation.*;

import com.mbit.webservices.enums.StatusEnum;
import java.util.ArrayList;
import java.util.List;

@RestController
public class OrderController {

    List<Order> s = new ArrayList<Order>();
    int ordID = 0;

    @PostMapping("/place-order")
    public String placeOrder_E1941034(@RequestBody String productId){

        if(s.size() == 0)
            ordID = 1;
        else
            ordID += 1;

        Order newOrder = new Order();
        newOrder.setProductId(productId);
        newOrder.setOrderId(String.valueOf(ordID));
        newOrder.setStatus(StatusEnum.CONFIRMED.getDescription());
        s.add(newOrder);

        return newOrder.getOrderId();
    }

    @GetMapping("/get-order-status/{orderId}")
    public String getOrderStatus_E1941034(@PathVariable("orderId") String orderId){
        for (Order ord : s){
            if(ord.getOrderId().equals(orderId) ) {
                return ord.getStatus();
            }

        }
        return StatusEnum.INVALID.getDescription();
    }

    @GetMapping("/update-order-status/{orderId}/{statusCode}")
    public String updateOrderStatus_E1941034(@PathVariable("orderId") String orderId,@PathVariable("statusCode") String statusCode){
        for (Order ord : s){
            if(ord.getOrderId().equals(orderId) ) {
                if(StatusEnum.getDescriptionByCode(statusCode) != "") {
                    ord.setStatus(StatusEnum.getDescriptionByCode(statusCode));
                    return "Order Status Updated to " + StatusEnum.getDescriptionByCode(statusCode);
                }else{
                    return StatusEnum.INVALID.getDescription() +" Status Code";
                }
            }

        }
        return StatusEnum.INVALID.getDescription();
    }

}
