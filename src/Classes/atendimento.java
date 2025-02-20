/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

/**
 *
 *id_ate_pk INTEGER PRIMARY KEY AUTO_INCREMENT,
    data_ate DATE,
    tipo_ate VARCHAR(10),
    descricao_ate VARCHAR(500),
    concluido_ate BOOLEAN,
    cancelado_ate BOOLEAN,
    id_end_fk INTEGER,
    FOREIGN KEY (id_end_fk) REFERENCES endereco (id_end_pk),
    id_vet_fk INTEGER,
    FOREIGN KEY (id_vet_fk) REFERENCES  veterinario (id_vet_pk)
 */
public class atendimento {
    
    private int id;
    private String tipo_ate;
    private String descricao;
    private boolean concluido = false;
    private boolean cancelado = false;
    private int id_end;
    private int id_vet;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTipo_ate() {
        return tipo_ate;
    }

    public void setTipo_ate(String tipo_ate) {
        this.tipo_ate = tipo_ate;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public boolean isConcluido() {
        return concluido;
    }

    public void setConcluido(boolean concluido) {
        this.concluido = concluido;
    }

    public boolean isCancelado() {
        return cancelado;
    }

    public void setCancelado(boolean cancelado) {
        this.cancelado = cancelado;
    }

    public int getId_end() {
        return id_end;
    }

    public void setId_end(int id_end) {
        this.id_end = id_end;
    }

    public int getId_vet() {
        return id_vet;
    }

    public void setId_vet(int id_vet) {
        this.id_vet = id_vet;
    }
    
    
}
