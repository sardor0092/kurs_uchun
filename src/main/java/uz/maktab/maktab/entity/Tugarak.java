package uz.maktab.maktab.entity;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
public class Tugarak {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Long id;

    private LocalDateTime soat;
    @ManyToOne
    private Fan fan;
     @ManyToOne
    private Uqituvchi uqituvchi;

    public Tugarak() {
    }

    public Tugarak(Long id, LocalDateTime soat, Fan fan, Uqituvchi uqituvchi) {
        this.id = id;
        this.soat = soat;
        this.fan = fan;
        this.uqituvchi = uqituvchi;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDateTime getSoat() {
        return soat;
    }

    public void setSoat(LocalDateTime soat) {
        this.soat = soat;
    }

    public Fan getFan() {
        return fan;
    }

    public void setFan(Fan fan) {
        this.fan = fan;
    }

    public Uqituvchi getUqituvchi() {
        return uqituvchi;
    }

    public void setUqituvchi(Uqituvchi uqituvchi) {
        this.uqituvchi = uqituvchi;
    }
}
