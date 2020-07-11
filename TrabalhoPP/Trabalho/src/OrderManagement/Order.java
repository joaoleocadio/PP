/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OrderManagement;

import Exceptions.ContainerExceptionImpl;
import java.time.LocalDate;
import order.base.ICustomer;
import order.base.IPerson;
import order.exceptions.ContainerException;
import order.exceptions.OrderException;
import order.exceptions.PositionException;
import order.management.IOrder;
import order.management.IShipping;
import order.packing.IItem;

/**
 *
 * @author samue
 */
public class Order implements IOrder {
    private IPerson destination;
    private ICustomer customer;
    private IItem[] item;
    private int id;
    private int ano, mes, dia;
    private IShipping[] shipping;
    private double cost;
    
    @Override
    public IPerson getDestination() {
        return destination;
    }

    @Override
    public void setDestination(IPerson destination) {
        this.destination = destination;
    }

    @Override
    public ICustomer getCustomer() {
        return customer;
    }

    @Override
    public void setCustomer(ICustomer customer) {
        this.customer = customer;
    }

    @Override
    public IItem[] getItems() {
        int tmp = 0;

        for (int i = 0; i < item.length; i++) {
            if (item[i] != null) {
                tmp++;
            }
        }
        IItem[] newItem = new IItem[tmp];
        for (int i = 0; i < newItem.length; i++) {
            newItem[i] = item[i];
        }
        return newItem;
    }

    @Override
    public void setId(int id) {
        this.id = id;
    }

    @Override
    public int getId() {
        return id;
    }

    @Override
    public void setDate(int ano, int mes, int dia) {
        this.ano = ano;
        this.dia = dia;
        this.mes = mes;
    }

    @Override
    public LocalDate getDate() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean add(IItem items) throws OrderException {
        boolean test = false;
        for (int i = 0; i < item.length; i++) {
            if (item[i] == null) {
                items = item[i]);
                break;
            } else if (item[item.length - 1] != null) {
                test = true;
            }
        }
        if (test) {
            isClosed();
            throw new OrderException("erro!") {
            };
        }
        return test;
    }

    @Override
    public IShipping[] getShippings() {
        int tmp = 0;

        for (int i = 0; i < shipping.length; i++) {
            if (shipping[i] != null) {
                tmp++;
            }
        }
        IShipping[] newItem = new IShipping[tmp];
        for (int i = 0; i < newItem.length; i++) {
            newItem[i] = shipping[i];
        }
        return newItem;
    }

    @Override
    public boolean addShipping(IShipping arg0) throws OrderException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean removeShipping(IShipping arg0) throws OrderException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int clean() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void validate() throws OrderException, ContainerException, PositionException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void close() throws OrderException, ContainerException, PositionException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean isClosed() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public double getCost() {
        return cost;
    }

    @Override
    public String summary() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int getNumberOfItems() {
        int tmp = 0;

        for (int i = 0; i < item.length; i++) {
            if (item[i] != null) {
                tmp++;
            }
        }
        return tmp;
    }

    @Override
    public int getNumberOfRemaingItemsToSend() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public IItem[] getRemainingItemsToSend() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
