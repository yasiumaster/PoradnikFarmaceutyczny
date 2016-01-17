package skoczny.jedynak.poradnik.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Collection;

@Entity(name = "kategoriachoroby")
@Table(name = "kategoriachoroby")
public class KategoriaChoroby {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @Column(name = "name")
    private String kategoriaChorobyName;

    @OneToMany(mappedBy = "kategoriaChoroby")
    private Collection<Choroba> chorobas = new ArrayList<Choroba>();

    public Collection<Choroba> getChorobas() {
        return chorobas;
    }

    public void setChorobas(Collection<Choroba> chorobas) {
        this.chorobas = chorobas;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getKategoriaChorobyName() {
        return kategoriaChorobyName;
    }

    @Override
    public String toString() {
        return ""+ kategoriaChorobyName;
    }

    public void setKategoriaChorobyName(String kategoriaChorobyName) {
        this.kategoriaChorobyName = kategoriaChorobyName;

    }
}
