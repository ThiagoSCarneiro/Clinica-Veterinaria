/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

/**
 *
       	id_med_pk INTEGER PRIMARY KEY AUTO_INCREMENT,
    nome_med VARCHAR(30),
    descricao_med VARCHAR(100),
    fabricante_med VARCHAR(30),
    data_vali_med DATE,
    id_ate_fk INTEGER,
    FOREIGN KEY (id_ate_fk) REFERENCES atendimeto (id_ate_pk)
 */
public class Medicamentos {
        
    private int id;
    private String nome;
    private String descricao;
    private String fabricante;
    private String datavali;
    private int id_ate;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public String getDatavali() {
        return datavali;
    }

    public void setDatavali(String datavali) {
        this.datavali = datavali;
    }

    public int getId_ate() {
        return id_ate;
    }

    public void setId_ate(int id_ate) {
        this.id_ate = id_ate;
    }
   

  
                
    


}//class
