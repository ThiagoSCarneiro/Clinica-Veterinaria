/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bancoDados;
    
    import java.sql.*;
import java.util.ArrayList;
    import javax.swing.*;
    import java.util.logging.Logger;
    import java.util.logging.Level;
import javax.swing.table.DefaultTableModel;
/*import java.beans.Statement;
    import java.sql.Connection;
    import java.sql.PreparedStatement;
    import java.sql.SQLException;
    import java.sql.ResultSet;
    import javax.swing.DefaultListModel;
    import javax.swing.JList;*/

public class acessoDados {
    private static final String URL1 = "jdbc:mysql://localhost:3306/clinica_vet";
    private static final String USER1 = "root";
    private static final String SENHA1= "root";
   
    private  ArrayList<String> list = new ArrayList<>();
    
    
    public void inserirBd(String comnado){
        String sql = comnado;
        PreparedStatement ps = null;
        try {
            ps = conexaoBd.getConexao().prepareStatement(sql);
            ps.execute();
            ps.close();
        } catch (SQLException e) {
           Logger.getLogger(acessoDados.class.getName()).log(Level.SEVERE,null,e);
        }
    }
    
    public void selectBd(String comando){
        String sql = comando;
        PreparedStatement ps = null;

        try {
            ps = conexaoBd.getConexao().prepareStatement(sql); 
            ps.execute();
            ps.close();
        } catch (SQLException e) {
           Logger.getLogger(acessoDados.class.getName()).log(Level.SEVERE,null,e);
        }
    }//Select
    
    public void mostarDadosJlist(JList<String> jlist, String query){
        final DefaultListModel<String> modeloJ = new DefaultListModel<>();
        jlist.setModel(modeloJ);
    
        try{
            Connection conn =DriverManager.getConnection(URL1, USER1, SENHA1);    
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(query);
            
            ResultSetMetaData metaData = rs.getMetaData();
            int numeroColunas = metaData.getColumnCount();
            ArrayList<String> nomesColunas = new ArrayList<>();

            for (int i = 1; i <= numeroColunas; i++) {
            nomesColunas.add(metaData.getColumnName(i)); // Adiciona os nomes das colunas
            }
            
             while (rs.next()) {
                ArrayList<String> valores = new ArrayList<>();
                for (String coluna : nomesColunas) {
                    valores.add(rs.getString(coluna)); // Obtém os valores das colunas
                }
                modeloJ.addElement(String.join(" | ", valores)); // Exibe formatado
            }
            st.close();
            rs.close();
            conn.close();
           
        }catch(SQLException e){
            e.printStackTrace();
        }
    
    }//fim mostrarDadoList
    
    
    public  void mostrarDadosTable(DefaultTableModel modeloT, String query,String...colunas){
        modeloT.setRowCount(0); 

        try{
            Connection conn =DriverManager.getConnection(URL1, USER1, SENHA1);
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(query);
            
            ResultSetMetaData metaData = rs.getMetaData();
            int contadorColuna = metaData.getColumnCount();
            
            if (colunas.length == 0) {
            colunas = new String[contadorColuna];
            for (int i = 0; i < contadorColuna; i++) {
                colunas[i] = metaData.getColumnName(i + 1); 
            }
        }

        
        modeloT.setColumnIdentifiers(colunas);

        
        while (rs.next()) {
            Object[] row = new Object[contadorColuna];
            for (int i = 0; i < contadorColuna; i++) {
                row[i] = rs.getObject(i + 1); 
            }
            modeloT.addRow(row);
        }

            st.close();
            rs.close();
            conn.close();
        }catch(SQLException e){
            
        }
    
    }
   
    public ArrayList<String> getList() {
        return list;
    }

    public void setList(ArrayList<String> list) {
        this.list = list;
    }
    
    
    
        
    
    
    
    
    
    }
    
    
    
    
  
