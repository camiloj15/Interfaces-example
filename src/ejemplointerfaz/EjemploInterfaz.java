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
public class EjemploInterfaz {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        CrushedRock rock1 = new CrushedRock(12, 10, 50);
        SalesCalc rock2 = new CrushedRock(12, 10, 50);
//        System.out.println("Sales Price Rock1: "+rock1.calcSalesPrice());
//        System.out.println("Sales Price Rock2: "+rock2.calcSalesPrice());

        SalesCalc[] itemList = new SalesCalc[5];
        itemList[0] = new CrushedRock(12.0, 10.0, 50.0);
        itemList[1] = new CrushedRock(8.0, 6.0, 10.0);
        itemList[2] = new RedPaint(10.0, 8.0, 25.0);
        itemList[3] = new Widget(6.0, 5.0, 10.0);
        itemList[4] = new Widget(14.0, 12.0, 20.0);

        System.out.println("====Sales Report===");
        for (SalesCalc item : itemList) {
            System.out.println();
            item.printItemData();

//            System.out.println("Name: "+item.getName());
        }

    }

}
