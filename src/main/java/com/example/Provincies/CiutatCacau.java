package com.example.Provincies;

import jakarta.persistence.*;
import org.springframework.boot.context.properties.bind.Name;

@Entity
@Table(name = "Ciutat_cacu")
public class CiutatCacau {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    @JoinColumn(name ="Cacau_id")
    private CacausDor cacausDorus;

    @ManyToOne
    @JoinColumn(name ="Ciutat_id")
    private Ciutat ciutat;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public CacausDor getCacausDorus() {
        return cacausDorus;
    }

    public void setCacausDorus(CacausDor cacausDorus) {
        this.cacausDorus = cacausDorus;
    }

    public Ciutat getCiuta() {
        return ciutat;
    }

    public void setCiuta(Ciutat ciuta) {
        this.ciutat = ciuta;
    }
}
