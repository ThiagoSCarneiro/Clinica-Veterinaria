/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package metodos;

/**
 *
 * @author ThiagodaSilvaCarneir
 */
public class metodos {
     
    public  static String retornardataMySql(String novaData){
        String dia = novaData.substring(0,2);
        String mes = novaData.substring(3, 5);
        String ano = novaData.substring(6);
        String dataNova = ano+"/"+mes+"/"+dia;
        return dataNova;
    }
    
}
