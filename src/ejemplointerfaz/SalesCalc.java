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
public interface SalesCalc {

    public static final String titleReport = "\n==== STATIC LIST REPORT=====";

    public String getName();

    public double calcSalesPrice();

    public double calcCost();

    public double calcProfit();

    public default void printItemData() {
        System.out.println("--" + getName() + " Report--");
        System.out.println("Sales Price: " + calcSalesPrice());
        System.out.println("Cost: " + calcCost());
        System.out.println("Profit: " + calcProfit());
    }

    public static void printItemArray(SalesCalc[] itemList) {
        for (SalesCalc item : itemList) {
            System.out.println("--" + item.getName() + " Report--");
            System.out.println("Sales Price: " + item.calcSalesPrice());
            System.out.println("Cost: " + item.calcCost());
            System.out.println("Profit: " + item.calcProfit());
        }
    }
}
