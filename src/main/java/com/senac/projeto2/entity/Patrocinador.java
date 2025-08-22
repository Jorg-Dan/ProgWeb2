package com.senac.projeto2.entity;

import jakarta.persistence.*;


@Entity
@Table(name = "patrocinador")
public class Patrocinador {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "patrocinador_id")
    private int id;
    @Column(name = "patrocinador_nome", nullable = false, length = 100)
    private String nome;
    @Column(name = "patrocinador_representante_nome", nullable = false, length = 100)
    private String representante;
    @Column(name = "patrocinador_status", nullable = false)
    private int status;

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

    public String getRepresentante() {
        return representante;
    }

    public void setRepresentante(String representante) {
        this.representante = representante;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }
}
