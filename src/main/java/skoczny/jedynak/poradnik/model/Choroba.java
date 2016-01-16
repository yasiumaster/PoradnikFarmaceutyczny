package skoczny.jedynak.poradnik.model;

import javax.persistence.*;

@Entity(name = "choroba")
public class Choroba {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "lek_id")
    private Lek lek;

    @ManyToOne
    @JoinColumn(name = "kategoriaChoroby_id")
    private KategoriaChoroby kategoriaChoroby;

    private float amount;

    @Column(columnDefinition="TEXT")
    private String description;

    private String nazwa;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public KategoriaChoroby getKategoriaChoroby() {
        return kategoriaChoroby;
    }

    public void setKategoriaChoroby(KategoriaChoroby kategoriaChoroby) {
        this.kategoriaChoroby = kategoriaChoroby;
    }

    public float getAmount() {
        return amount;
    }

    public void setAmount(float amount) {
        this.amount = amount;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Lek getLek() {
        return lek;
    }

    public void setLek(Lek lek) {
        this.lek = lek;
    }

    @Override
    public String toString() {
        return nazwa;
    }

    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }
}
