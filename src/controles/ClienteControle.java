/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controles;

import bean.ClienteMyn;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author User
 */
public class ClienteControle extends AbstractTableModel{
    private List lista;

    public void setList(List lista) {
        this.lista = lista;
        this.fireTableDataChanged();
    }
   
    public ClienteMyn getBean(int row) {
        return (ClienteMyn) lista.get(row);
    }
    
    @Override
    public int getRowCount() {
        return lista.size();
    }

    @Override
    public int getColumnCount() {
        return 4;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
      ClienteMyn clienteMyn = (ClienteMyn) lista.get(rowIndex);
        if (columnIndex == 0) {
           return clienteMyn.getIdClienteMyn();
        } 
        if (columnIndex == 1) {
           return clienteMyn.getNomeMyn();
        } 
        if (columnIndex == 2) {
           return clienteMyn.getApelidoMyn();
        } 
        if (columnIndex == 3) {
           return clienteMyn.getCpfMyn();
        } 
        return "";
    }
    
    @Override
    public String getColumnName(int column){
        if (column == 0){
            return "Id";
        }
        if (column == 1){
            return "Nome";
        }
        if (column == 2){
            return "Apelido";
        }
        if (column == 3){
            return "CPF";
        }
        
        return "";  
    }
}
