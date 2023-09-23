/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controles;

import bean.UsuariosMyn;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author User
 */
public class UsuariosControle extends AbstractTableModel{
private List lista;

    public void setList(List lista) {
        this.lista = lista;
        this.fireTableDataChanged();
    }
   
    public UsuariosMyn getBean(int row) {
        return (UsuariosMyn) lista.get(row);
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
        UsuariosMyn usuariosMyn = (UsuariosMyn) lista.get(rowIndex);
        if (columnIndex == 0) {
           return usuariosMyn.getIdUsuariosMyn();
        } 
        if (columnIndex == 1) {
           return usuariosMyn.getNomeMyn();
        } 
        if (columnIndex == 2) {
           return usuariosMyn.getApelidoMyn();
        } 
        if (columnIndex == 3) {
           return usuariosMyn.getCpfMyn();
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
    

