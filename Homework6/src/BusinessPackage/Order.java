/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BusinessPackage;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author ragha
 */
public class Order {
    private ArrayList<OrderItems> orderList;
    private Date orderStartDate;
    private Date orderEndDate;
    private String orderStatus;
    private int orderID;
    public static int count =0;

    public Order() {
        orderList= new ArrayList<OrderItems>();
        count ++;
        orderID = count;
    }

    public ArrayList<OrderItems> getOrderList() {
        return orderList;
    }

    public void setOrderList(ArrayList<OrderItems> orderList) {
        this.orderList = orderList;
    }

    public Date getOrderStartDate() {
        return orderStartDate;
    }

    public void setOrderStartDate(Date orderStartDate) {
        this.orderStartDate = orderStartDate;
    }

    public Date getOrderEndDate() {
        return orderEndDate;
    }

    public void setOrderEndDate(Date orderEndDate) {
        this.orderEndDate = orderEndDate;
    }

    public String getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus;
    }

    public int getOrderID() {
        return orderID;
    }

    public void setOrderID(int orderID) {
        this.orderID = orderID;
    }
     
    public OrderItems addOrderItem(Product p, int q,int price)
    {
        OrderItems o = new OrderItems();
        o.setActualPrice(price);
        o.setProduct(p);
        o.setQuantity(q);
        orderList.add(o);
        return o;
    }
}
