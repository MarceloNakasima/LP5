/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controles;

import bean.VendaprodutoMyn;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author User
 */
public class VendaProdutoControle extends AbstractTableModel{
    private List lista;

    public void setList(List lista) {
        this.lista = lista;
        this.fireTableDataChanged();
    }
   
    public VendaprodutoMyn getBean(int row) {
        return (VendaprodutoMyn) lista.get(row);
    }
    
    public  void  addBean (VendaprodutoMyn vendaProduto){
    lista.add(vendaProduto);
    this.fireTableDataChanged();
    }

    public void removeBean (int index){
    lista.remove(index);
    this.fireTableDataChanged();
    }

    public  void  updateBean (int index, VendaprodutoMyn vendaProduto){
    lista.set(index, vendaProduto);
    this.fireTableDataChanged();
    }
    
    
    @Override
    public int getRowCount() {
       return lista != null ? lista.size() : 0;
    }

    @Override
    public int getColumnCount() {
        return 3;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
      VendaprodutoMyn vendaprodutoMyn = (VendaprodutoMyn) lista.get(rowIndex);
        if (columnIndex == 0) {
           return vendaprodutoMyn.getIdVendaProdutoMyn();
        } 
        if (columnIndex == 1) {
           return vendaprodutoMyn.getProdutoMyn();
        } 
        if (columnIndex == 2) {
           return vendaprodutoMyn.getQuantidadeMyn();
        } 
        return "";
    }
    
    @Override
    public String getColumnName(int column){
        if (column == 0){
            return "Id";
        }
        if (column == 1){
            return "Produto";
        }
        if (column == 2){
            return "Quantidade";
        }
        
        return "";  
    }
}
