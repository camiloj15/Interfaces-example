/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplointerfaz;

/**
 *
 * @author camiloj15
 */
public class Widget implements SalesCalc {

    private String name = "Widget";
    private double salesPrice = 0;
    private double cost = 0;
    private double quantity = 0;

    public Widget(double salesPrice, double cost, double quantity) {
        this.salesPrice = salesPrice;
        this.cost = cost;
        this.quantity = quantity;
    }

    @Override
    public double calcSalesPrice() {
        return this.salesPrice * this.quantity;
    }

    @Override
    public double calcCost() {
        return this.cost * this.quantity;
    }

    @Override
    public double calcProfit() {
        return calcSalesPrice() - calcCost();
    }

    @Override
    public String getName() {
        return this.name;
    }

}
