/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

/**
 *
 * id_con_pk INTEGER PRIMARY KEY AUTO_INCREMENT,
    email_com VARCHAR(30),
    telefone_con VARCHAR(12),
    id_ate_fk INTEGER,
    FOREIGN KEY (id_ate_fk) REFERENCES atendimento(id_ate_pk)
 */
public class contato {

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public int getId_ate() {
        return id_ate;
    }

    public void setId_ate(int id_ate) {
        this.id_ate = id_ate;
    }
    private int id;
    private String email;
    private String telefone;
    private int id_ate;
    
    
}
