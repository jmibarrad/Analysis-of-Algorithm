/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package algorithms;

/**
 *
 * @author Light
 */
import java.util.*;

public abstract class KnapsackSolver {

   protected List<Item> items;
   protected int capacity;
   
   protected KnapsackSolver(List<Item> items, int capacity) {
      this.items = items;
      this.capacity = capacity;
   }
   
   public abstract KnapsackSolution solve();
   
   public double getWeight(List<Item> items) {
      double weight = 0;
      for (Item item : items) {
         weight += item.weight;
      }
      return weight;
   }
   
   public double getValue(List<Item> items) {
      double value = 0;
      for (Item item : items) {
         value += item.value;
      }
      return value;
   }
}
