/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controles;

import bean.FuncionarioMyn;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author User
 */
public class FuncionarioControle extends AbstractTableModel{
    private List lista;

    public void setList(List lista) {
        this.lista = lista;
        this.fireTableDataChanged();
    }
   
    public FuncionarioMyn getBean(int row) {
        return (FuncionarioMyn) lista.get(row);
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
        FuncionarioMyn funcionarioMyn = (FuncionarioMyn) lista.get(rowIndex);
        if (columnIndex == 0) {
           return funcionarioMyn.getIdFuncionarioMyn();
        } 
        if (columnIndex == 1) {
           return funcionarioMyn.getNomeMyn();
        } 
        if (columnIndex == 2) {
           return funcionarioMyn.getEmailMyn();
        } 
        if (columnIndex == 3) {
           return funcionarioMyn.getDataAdmissaoMyn();
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
            return "Email";
        }
        if (column == 3){
            return "Data";
        }
        
        return "";  
    }
    
}
