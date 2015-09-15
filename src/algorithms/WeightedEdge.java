/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package algorithms;

import org.jgrapht.graph.DefaultWeightedEdge;

class WeightedEdge extends DefaultWeightedEdge {
  @Override
  public String toString() {
    return Double.toString(getWeight());
  }
}
