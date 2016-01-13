package skoczny.jedynak.poradnik.service;

public class PoradnikFarmaceutycznyDBInitializer {

    public static void main(String[] args) {
        DBLoader loader = new DBLoader();
        loader.initDB();
    }
}
