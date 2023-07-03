package uz.maktab.maktab.entity;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Table(name = "students")
public class Uquvchi {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Long id;

    private String ism;
    private String famil;
    private String sharif;
    private LocalDate yosh;

    private int sinf;


    public Uquvchi(){

    }

    public Uquvchi(Long id, String ism, String famil, String sharif, LocalDate yosh, int sinf) {
        this.id = id;
        this.ism = ism;
        this.famil = famil;
        this.sharif = sharif;
        this.yosh = yosh;
        this.sinf = sinf;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getIsm() {
        return ism;
    }

    public void setIsm(String ism) {
        this.ism = ism;
    }

    public String getFamil() {
        return famil;
    }

    public void setFamil(String famil) {
        this.famil = famil;
    }

    public String getSharif() {
        return sharif;
    }

    public void setSharif(String sharif) {
        this.sharif = sharif;
    }

    public LocalDate getYosh() {
        return yosh;
    }

    public void setYosh(LocalDate yosh) {
        this.yosh = yosh;
    }

    public int getSinf() {
        return sinf;
    }

    public void setSinf(int sinf) {
        this.sinf = sinf;
    }
}
