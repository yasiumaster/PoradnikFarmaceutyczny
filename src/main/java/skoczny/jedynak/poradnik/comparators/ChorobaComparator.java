package skoczny.jedynak.poradnik.comparators;

import skoczny.jedynak.poradnik.model.Choroba;

import java.util.Comparator;

public class ChorobaComparator implements Comparator<Choroba> {
    @Override
    public int compare(Choroba item1, Choroba item2) {
        return item1.getId()- item2.getId();
    }
}
