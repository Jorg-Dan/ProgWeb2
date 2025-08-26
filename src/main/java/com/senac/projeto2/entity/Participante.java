package com.senac.projeto2.entity;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name="participante")
public class Participante {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "participante_id")
    private int id;
    @Column(name = "participante_nome", nullable = false, length = 300)
    private String nome;
    @Column(name = "participante_email", nullable = false, length = 45)
    private String email;
    @Column(name = "participante_identificacao", nullable = false, length = 45)
    private String identificacao;
    @Column(name = "participante_endereco", nullable = false, length = 300)
    private LocalDate endereco;
    @Column(name = "participante_status", nullable = false)
    private int status;

    @OneToMany(mappedBy = "participante")
    private List<Insricao> inscricoes;

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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getIdentificacao() {
        return identificacao;
    }

    public void setIdentificacao(String identificacao) {
        this.identificacao = identificacao;
    }

    public LocalDate getEndereco() {
        return endereco;
    }

    public void setEndereco(LocalDate endereco) {
        this.endereco = endereco;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }
}
