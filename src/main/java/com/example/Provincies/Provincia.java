package com.example.Provincies;

import jakarta.persistence.*;

import java.util.List;
@Entity
public class Provincia {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nom;
    @ManyToOne
    @JoinColumn(name = "pais_id")
    private Pais pais;
    @OneToMany(mappedBy = "provincia", cascade = CascadeType.ALL)
    private List<Ciutat> ciutats;

    @Override
    public String toString() {
        return "Provincia{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                ", pais=" + pais +
                ", ciutats=" + ciutats +
                '}';
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public Pais getPais() {
        return pais;
    }

    public void setPais(Pais pais) {
        this.pais = pais;
    }

    public List<Ciutat> getCiutats() {
        return ciutats;
    }

    public void setCiutats(List<Ciutat> ciutats) {
        this.ciutats = ciutats;
    }
}
