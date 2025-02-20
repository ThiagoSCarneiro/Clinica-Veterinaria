/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

/**
 *
 *
 *      id_ani_pk INTEGER PRIMARY KEY AUTO_INCREMENT,
	nome_ani VARCHAR(30),
	especie_ani VARCHAR(30),
	raca_ani VARCHAR(30),
	sexo_ani VARCHAR(30),
        data_nasc_ani DATE,
	descricao_ani VARCHAR(200),
        id_ate_fk INTEGER,
        FOREIGN KEY (id_ate_fk) REFERENCES atendimeto (id_ate_pk),
        id_cli_fk INTEGER,
        FOREIGN KEY (id_cli_fk) REFERENCES cliente (id_cli_pk)
 */
public class Pets {
        
    private int id;
    private String nome;
    private String especie;
    private String raca;
    private String sexo;
    private String data_nasc;
    private String descricao;
    private int id_cli_fk;
    private int id_ate_fk;

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

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getData_nasc() {
        return data_nasc;
    }

    public void setData_nasc(String data_nasc) {
        this.data_nasc = data_nasc;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getId_cli_fk() {
        return id_cli_fk;
    }

    public void setId_cli_fk(int id_cli_fk) {
        this.id_cli_fk = id_cli_fk;
    }

    public int getId_ate_fk() {
        return id_ate_fk;
    }

    public void setId_ate_fk(int id_ate_fk) {
        this.id_ate_fk = id_ate_fk;
    }
    
    
    
}//class
