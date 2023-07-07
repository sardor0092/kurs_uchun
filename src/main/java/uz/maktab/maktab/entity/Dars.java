package uz.maktab.maktab.entity;

import javax.persistence.*;

@Entity
@Table(name = "lessons")
public class Dars {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    private Uquvchi  uquvchi;
    @ManyToOne
    private Uqituvchi uqituvchi;
    @ManyToOne
    private Fan fan;
    @ManyToOne
    private Xona xona;
    @ManyToOne
    private Sinf sinf;
    @ManyToOne
    private UquvYili uquvYili;

    public Dars() {
    }

    public Dars(Long id, Uquvchi uquvchi, Uqituvchi uqituvchi, Fan fan, Xona xona, Sinf sinf, UquvYili uquvYili) {
        this.id = id;
        this.uquvchi = uquvchi;
        this.uqituvchi = uqituvchi;
        this.fan = fan;
        this.xona = xona;
        this.sinf = sinf;
        this.uquvYili = uquvYili;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Uquvchi getUquvchi() {
        return uquvchi;
    }

    public void setUquvchi(Uquvchi uquvchi) {
        this.uquvchi = uquvchi;
    }

    public Uqituvchi getUqituvchi() {
        return uqituvchi;
    }

    public void setUqituvchi(Uqituvchi uqituvchi) {
        this.uqituvchi = uqituvchi;
    }

    public Fan getFan() {
        return fan;
    }

    public void setFan(Fan fan) {
        this.fan = fan;
    }

    public Xona getXona() {
        return xona;
    }

    public void setXona(Xona xona) {
        this.xona = xona;
    }

    public Sinf getSinf() {
        return sinf;
    }

    public void setSinf(Sinf sinf) {
        this.sinf = sinf;
    }

    public UquvYili getUquvYili() {
        return uquvYili;
    }

    public void setUquvYili(UquvYili uquvYili) {
        this.uquvYili = uquvYili;
    }
}
