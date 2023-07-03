package uz.maktab.maktab.entity;

import javax.persistence.*;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.Set;

@Entity
@Table( name = "users")
public class User {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private  String  ism;

    @Column(nullable = false)
    private  String  familiya;

    @Size (max = 30 ,min = 8)
    @NotNull
    @Column(nullable = true , unique = true)
    private String login;


    @Size (max =60 ,min = 60)
    @NotNull
    @Column(nullable = true , unique = true)
    private String password;

    private Boolean active;


    public User() {
    }

    public User(Long id, String ism, String familiya, String login, String password, Boolean active) {
        this.id = id;
        this.ism = ism;
        this.familiya = familiya;
        this.login = login;
        this.password = password;
        this.active = active;
    }


    @ElementCollection(targetClass = Lavozim.class ,fetch = FetchType.EAGER)
    @CollectionTable(name = "user_lavozim",
            joinColumns = @JoinColumn(name = "user_id"))
    @Column(name = "lavozim_id")
    private Set<Lavozim> lavozimlar;







    public Long getId() {
        return id;
    }

    public String getIsm() {
        return ism;
    }

    public String getFamiliya() {
        return familiya;
    }

    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }

    public Boolean getActive() {
        return active;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setIsm(String ism) {
        this.ism = ism;
    }

    public void setFamiliya(String familiya) {
        this.familiya = familiya;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }
}
