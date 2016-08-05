/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package algorithms;

import java.util.Comparator;

/**
 *
 * @author Light
 */
public class Item {
    public String label;
    public double value;
    public double weight;
    public int row;
    
    public static Comparator<Item> byRatio() {
      return (Item i1, Item i2) -> Double.compare(i2.getRatio(), i1.getRatio());
   }
   
   public double getRatio() {
      return value / weight;
   }
}
