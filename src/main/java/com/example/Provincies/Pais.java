package com.example.Provincies;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Pais {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nom;

    @OneToMany(mappedBy = "pais", cascade = CascadeType.ALL)
    private List<Provincia> provincia ;

    @Override
    public String toString() {
        return "Pais{" +
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

    public List<Provincia> getProvincia() {
        return provincia;
    }

    public void setProvincia(List<Provincia> provincia) {
        this.provincia = provincia;
    }
}
