 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tools;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *
 *
 */
public class Util {

    public static void habilitar(boolean valor, JComponent... vetComp) { //tem static ra nâo precisas instanciar, este laço percorre todos os itens do vetor vetcomp
        for (int i = 0; i < vetComp.length; i++) { //esse for é pra pegar varios componentes
            vetComp[i].setEnabled(valor);
        }
    }

    public static void limparCampos(JComponent... vetComp) { //limpar campos é polimorffismo
        for (JComponent componente : vetComp) {
            if (componente instanceof JTextField) { //if pergunta se alguma vez ele já foi textfield
                ((JTextField) componente).setText("");
            } else if (componente instanceof JComboBox) { //if pergunta se alguma vez ele já foi textfield
                ((JComboBox) componente).setSelectedIndex(-1);
            } else if (componente instanceof JCheckBox) { //if pergunta se alguma vez ele já foi textfield
                ((JCheckBox) componente).setSelected(false);
            }

        }
    }

    public static void mensagem(String cadeia){
        JOptionPane.showMessageDialog(null, cadeia);
    }

    public static boolean perguntar(String cadeia){
        int resp = JOptionPane.showConfirmDialog(null, cadeia,
                "Perguntar", JOptionPane.YES_NO_OPTION);
        if (resp == JOptionPane.YES_OPTION) {
            return true;
        } else {
            return false;
        }
    }

    public static int strInt(String cad) { //str é pegar string e transformar em inteiro
        return Integer.valueOf(cad);
    }

    public static String intStr(int num) {
        return String.valueOf(num);
    }

    public static double strDouble(String cad) {
        // Converte uma String para um valor double.
        return Double.parseDouble(cad);
    }

    public static String doubleStr(double num) {
        // Converte um valor double para uma String.
        return String.valueOf(num);
    }

    public static Date strDate(String cad) {
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        try {
            return formato.parse(cad);
        } catch (ParseException e) {
            e.printStackTrace();
            return null;
        }
    }

    public static String dateStr(Date date) {
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        return formato.format(date);
    }

}
