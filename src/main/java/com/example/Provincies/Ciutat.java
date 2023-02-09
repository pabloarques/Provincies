package com.example.Provincies;

import jakarta.persistence.*;
@Entity
public class Ciutat {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nom;
    @ManyToOne
    @JoinColumn(name = "provincia_id")
    private Provincia provincia;

    @Override
    public String toString() {
        return "Ciutat{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                ", provincia=" + provincia +
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

    public Provincia getProvincia() {
        return provincia;
    }

    public void setProvincia(Provincia provincia) {
        this.provincia = provincia;
    }
}
