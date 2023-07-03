package uz.maktab.maktab.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDate;

@Entity
public class UquvYili {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Long id;
    private LocalDate boshlanganVaqt;
    private  LocalDate tugaganVaqt;

    public UquvYili() {
    }

    public UquvYili(Long id, LocalDate boshlanganVaqt, LocalDate tugaganVaqt) {
        this.id = id;
        this.boshlanganVaqt = boshlanganVaqt;
        this.tugaganVaqt = tugaganVaqt;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDate getBoshlanganVaqt() {
        return boshlanganVaqt;
    }

    public void setBoshlanganVaqt(LocalDate boshlanganVaqt) {
        this.boshlanganVaqt = boshlanganVaqt;
    }

    public LocalDate getTugaganVaqt() {
        return tugaganVaqt;
    }

    public void setTugaganVaqt(LocalDate tugaganVaqt) {
        this.tugaganVaqt = tugaganVaqt;
    }
}
