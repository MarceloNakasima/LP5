/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controles;

import bean.VendasMyn;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author User
 */
public class VendasControle extends AbstractTableModel{
private List lista;

    public void setList(List lista) {
        this.lista = lista;
        this.fireTableDataChanged();
    }
   
    public VendasMyn getBean(int row) {
        return (VendasMyn) lista.get(row);
    }
    @Override
    public int getRowCount() {
         return lista.size();
    }

    @Override
    public int getColumnCount() {
        return 3;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        VendasMyn vendasMyn = (VendasMyn) lista.get(rowIndex);
        if (columnIndex == 0) {
           return vendasMyn.getIdVendasMyn();
        } 
        if (columnIndex == 1) {
           return vendasMyn.getTempoEntregaMyn();
        } 
        if (columnIndex == 2) {
           return vendasMyn.getClienteMyn();
        } 
        return "";
    }
    
     @Override
    public String getColumnName(int column){
        if (column == 0){
            return "Id";
        }
        if (column == 1){
            return "Tempo de Entrega";
        }
        if (column == 2){
            return "Cliente";
        }
        
        return "";  
    }
    
}
    

