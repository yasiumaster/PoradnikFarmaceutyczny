package skoczny.jedynak.poradnik.model;

import javax.persistence.*;
import java.util.*;

@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(name="name")
    private String userName;

    @Column(name="password")
    private String password;
    private String email;

    @Temporal(TemporalType.DATE)
    @Column(name = "default_report_date")
    private Date defaultReportDate;

    @OneToMany(mappedBy = "user")
    private List<Choroba> chorobas = new ArrayList<Choroba>();

    @OneToMany(mappedBy = "user")
    private List<Lek> leki = new ArrayList<Lek>();

    @ManyToOne
    @JoinColumn(name = "role_id")
    private Role role;

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public List<Choroba> getChorobas() {
        return chorobas;
    }

    public void setChorobas(List<Choroba> chorobas) {
        this.chorobas = chorobas;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getDefaultReportDate() {
        return defaultReportDate;
    }

    public void setDefaultReportDate(Date defaultReportDate) {
        this.defaultReportDate = defaultReportDate;
    }

    public List<Lek> getLeki() {
        return leki;
    }

    public void setLeki(List<Lek> leki) {
        this.leki = leki;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                ", email='" + email + '\'' +
                ", defaultReportDate=" + defaultReportDate +
                ", chorobas=" + chorobas +
                ", role=" + role +
                '}';
    }
}
