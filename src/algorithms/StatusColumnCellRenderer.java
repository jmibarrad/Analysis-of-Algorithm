/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package algorithms;

import java.awt.Color;
import java.util.Arrays;
import java.util.List;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Light
 */
public class StatusColumnCellRenderer extends DefaultTableModel {

    List<Color> rowColours = Arrays.asList(
        Color.GREEN,
        Color.GREEN,
        Color.GREEN
    );

    public void setRowColour(int row, Color c) {
        rowColours.set(row, c);
        fireTableRowsUpdated(row, row);
    }

    public Color getRowColour(int row) {
        return rowColours.get(row);
    }

}
