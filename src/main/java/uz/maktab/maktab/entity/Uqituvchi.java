package uz.maktab.maktab.entity;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "teacher")
public class Uqituvchi {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Long id;

    private String ism;
    private String famil;

    private LocalDate yosh;
    private  int maosh;
    private String jinsi;

    public Uqituvchi() {
    }

    public Uqituvchi(Long id, String ism, String famil, LocalDate yosh, int maosh, String jinsi) {
        this.id = id;
        this.ism = ism;
        this.famil = famil;
        this.yosh = yosh;
        this.maosh = maosh;
        this.jinsi = jinsi;
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

    public LocalDate getYosh() {
        return yosh;
    }

    public void setYosh(LocalDate yosh) {
        this.yosh = yosh;
    }

    public int getMaosh() {
        return maosh;
    }

    public void setMaosh(int maosh) {
        this.maosh = maosh;
    }

    public String getJinsi() {
        return jinsi;
    }

    public void setJinsi(String jinsi) {
        this.jinsi = jinsi;
    }
}
