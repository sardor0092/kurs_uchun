package uz.maktab.maktab.service.dto;
import uz.maktab.maktab.entity.Lavozim;

import java.util.Set;
public class UserDto {
    private  Long id;
    private  String ism;
    private  String familiya;
    private  String login;
    private Set<Lavozim> lavozims;

private  Boolean aktiv;

    public UserDto() {
    }

    public UserDto(Long id, String ism, String familiya, String login, Set<Lavozim> lavozims, Boolean aktiv) {
        this.id = id;
        this.ism = ism;
        this.familiya = familiya;
        this.login = login;
        this.lavozims = lavozims;
        this.aktiv = aktiv;
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

    public String getFamiliya() {
        return familiya;
    }

    public void setFamiliya(String familiya) {
        this.familiya = familiya;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public Set<Lavozim> getLavozims() {
        return lavozims;
    }

    public void setLavozims(Set<Lavozim> lavozims) {
        this.lavozims = lavozims;
    }

    public Boolean getAktiv() {
        return aktiv;
    }

    public void setAktiv(Boolean aktiv) {
        this.aktiv = aktiv;
    }
}


