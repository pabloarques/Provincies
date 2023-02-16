package com.example.Provincies;

import jakarta.persistence.*;

import java.util.List;
import java.util.Set;

@Entity
public class CacausDor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String nom_local;
    private String descrip;
    @OneToMany(mappedBy = "cacausDorus", cascade = CascadeType.ALL)
    private List<CiutatCacau> ciutatcacu;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNom_local() {
        return nom_local;
    }

    public void setNom_local(String nom_local) {
        this.nom_local = nom_local;
    }

    public String getDescrip() {
        return descrip;
    }

    public void setDescrip(String descrip) {
        this.descrip = descrip;
    }

    public List<CiutatCacau> getCiutatcacu() {
        return ciutatcacu;
    }

    public void setCiutatcacu(List<CiutatCacau> ciutatcacu) {
        this.ciutatcacu = ciutatcacu;
    }
}
