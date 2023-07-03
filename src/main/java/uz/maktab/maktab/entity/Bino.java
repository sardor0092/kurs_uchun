package uz.maktab.maktab.entity;

import javax.persistence.*;

@Entity
@Table(name = "building")
public class Bino {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Long id;
    private  String nom;

}
