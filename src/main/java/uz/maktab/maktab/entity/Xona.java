package uz.maktab.maktab.entity;


import javax.persistence.*;

@Entity
@Table(name = "room")
public class Xona {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nom;
    private int sigim;
    @ManyToOne
    private Bino bino;

    public Xona(){

    }

    public Xona(Long id, String nom, int sigim) {
        this.id = id;
        this.nom = nom;
        this.sigim = sigim;

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

    public int getSigim() {
        return sigim;
    }

    public void setSigim(int sigim) {
        this.sigim = sigim;
    }




}
