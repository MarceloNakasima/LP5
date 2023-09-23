/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controles;

import bean.ProdutoMyn;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author User
 */
public class ProdutoControle extends AbstractTableModel{
    private List lista;

    public void setList(List lista) {
        this.lista = lista;
        this.fireTableDataChanged();
    }
   
    public ProdutoMyn getBean(int row) {
        return (ProdutoMyn) lista.get(row);
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
        ProdutoMyn produtoMyn = (ProdutoMyn) lista.get(rowIndex);
        if (columnIndex == 0) {
           return produtoMyn.getIdProdutoMyn();
        } 
        if (columnIndex == 1) {
           return produtoMyn.getNomeMyn();
        } 
        if (columnIndex == 2) {
           return produtoMyn.getValorMyn();
        } 
        if (columnIndex == 3) {
           return produtoMyn.getDescricaoMyn();
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
            return "Valor";
        }
        if (column == 3){
            return "Descrição";
        }
        
        return "";  
    }
    
}
