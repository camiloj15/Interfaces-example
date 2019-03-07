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
public class RedPaint implements SalesCalc {

    private String name = "Red Paint";
    private double salesPrice = 0;
    private double cost = 0;
    private double gallons = 0;

    public RedPaint(double salesPrice, double cost, double gallons) {
        this.salesPrice = salesPrice;
        this.cost = cost;
        this.gallons = gallons;
    }

    @Override
    public double calcSalesPrice() {
        return this.salesPrice*this.gallons;
    }

    @Override
    public double calcCost() {
        return this.cost*this.gallons;
    }

    @Override
    public double calcProfit() {
        return calcSalesPrice()-calcCost();
    }

    @Override
    public String getName() {
        return this.name;
    }

}
