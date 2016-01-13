package skoczny.jedynak.poradnik.service;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import skoczny.jedynak.poradnik.model.*;

import java.text.DecimalFormat;
import java.util.*;
import java.util.concurrent.ThreadLocalRandom;

public class DBLoader {
    private SessionFactory sessionFactory = SessionFactoryCreator.getSessionFactory();
    private Session session;

    private List<KategoriaChoroby> kategorie = new ArrayList<>();

    public void initDB() {
        session = sessionFactory.openSession();
        session.beginTransaction();


//===============  ROLE  ==============================
        Role admin = addRoleToDB("admin");

        Role user = addRoleToDB("user");
//===============  USER -> defaultUser ==============================
        User defaultUser = addUserToDB("user", "password", "default.user@gmail.com", new Date(), admin);
//===============  LEK ==============================
        Lek aerius = addLekToDB(defaultUser, "Aerius", randomAvailability(), randomPrize());

        Lek acatarZatoki = addLekToDB(defaultUser, "Acatar Zatoki", randomAvailability(), randomPrize());

        Lek acidolac = addLekToDB(defaultUser, "Acidolac ", randomAvailability(), randomPrize());

        Lek albothyl = addLekToDB(defaultUser, "Albothyl ", randomAvailability(), randomPrize());

        Lek anafranil = addLekToDB(defaultUser, "Anafranil", randomAvailability(), randomPrize());

        Lek baikaderm = addLekToDB(defaultUser, "Baikaderm ", randomAvailability(), randomPrize());

        Lek baraclude = addLekToDB(defaultUser, "Baraclude", randomAvailability(), randomPrize());

        Lek bebilon = addLekToDB(defaultUser, "Bebilon ", randomAvailability(), randomPrize());

        Lek betadrin = addLekToDB(defaultUser, "Betadrin ", randomAvailability(), randomPrize());

        Lek biseptol = addLekToDB(defaultUser, "Biseptol", randomAvailability(), randomPrize());

        Lek cepastil = addLekToDB(defaultUser, "Cepastil ", randomAvailability(), randomPrize());

        Lek calcenato = addLekToDB(defaultUser, "Calcenato", randomAvailability(), randomPrize());

        Lek dicloabak = addLekToDB(defaultUser, "Dicloabak ", randomAvailability(), randomPrize());

        Lek daktarin = addLekToDB(defaultUser, "Daktarin", randomAvailability(), randomPrize());

        Lek grypolek = addLekToDB(defaultUser, "Grypolek ", randomAvailability(), randomPrize());

        Lek gaviscon = addLekToDB(defaultUser, "Gaviscon ", randomAvailability(), randomPrize());

        Lek fludara = addLekToDB(defaultUser, "Fludara", randomAvailability(), randomPrize());

        Lek fenistil = addLekToDB(defaultUser, "Fenistil ", randomAvailability(), randomPrize());

        Lek eprex = addLekToDB(defaultUser, "Eprex", randomAvailability(), randomPrize());

        Lek elobaza = addLekToDB(defaultUser, "Elo-baza ", randomAvailability(), randomPrize());

        Lek hascoderm = addLekToDB(defaultUser, "Hascoderm", randomAvailability(), randomPrize());

        Lek hydroskin = addLekToDB(defaultUser, "Hydroskin", randomAvailability(), randomPrize());

        Lek ibuprom = addLekToDB(defaultUser, "Ibuprom", randomAvailability(), randomPrize());

        Lek itragen = addLekToDB(defaultUser, "Itragen ", randomAvailability(), randomPrize());

        Lek javlor = addLekToDB(defaultUser, "Javlor ", randomAvailability(), randomPrize());

        Lek jovesto = addLekToDB(defaultUser, "Jovesto", randomAvailability(), randomPrize());

        Lek kamiren = addLekToDB(defaultUser, "Kamiren ", randomAvailability(), randomPrize());

        Lek klimicin = addLekToDB(defaultUser, "Klimicin", randomAvailability(), randomPrize());

        Lek laremid = addLekToDB(defaultUser, "Laremid", randomAvailability(), randomPrize());

        Lek logest = addLekToDB(defaultUser, "Logest ", randomAvailability(), randomPrize());

        Lek marbodin = addLekToDB(defaultUser, "Marbodin", randomAvailability(), randomPrize());

        Lek menopur = addLekToDB(defaultUser, "Menopur ", randomAvailability(), randomPrize());

        Lek nakom = addLekToDB(defaultUser, "Nakom", randomAvailability(), randomPrize());

        Lek nervosol = addLekToDB(defaultUser, "Nervosol", randomAvailability(), randomPrize());

        Lek oeparol = addLekToDB(defaultUser, "Oeparol", randomAvailability(), randomPrize());

        Lek optive = addLekToDB(defaultUser, "Optive ", randomAvailability(), randomPrize());

        Lek pentaglobin = addLekToDB(defaultUser, "Pentaglobin", randomAvailability(), randomPrize());

        Lek plavocorin = addLekToDB(defaultUser, "Plavocorin", randomAvailability(), randomPrize());

        Lek quatrum = addLekToDB(defaultUser, "Quatrum", randomAvailability(), randomPrize());

        Lek qumag = addLekToDB(defaultUser, "Qumag", randomAvailability(), randomPrize());

        Lek ramistad = addLekToDB(defaultUser, "Ramistad", randomAvailability(), randomPrize());

        Lek risperon = addLekToDB(defaultUser, "Risperon", randomAvailability(), randomPrize());

        Lek sclefic = addLekToDB(defaultUser, "Sclefic", randomAvailability(), randomPrize());

        Lek sulphera = addLekToDB(defaultUser, "Sulphera", randomAvailability(), randomPrize());

        Lek tacefur = addLekToDB(defaultUser, "Tacefur", randomAvailability(), randomPrize());

        Lek telmisartan = addLekToDB(defaultUser, "Telmisartan", randomAvailability(), randomPrize());

        Lek ulgix = addLekToDB(defaultUser, "Ulgix", randomAvailability(), randomPrize());

        Lek ursocam = addLekToDB(defaultUser, "Ursocam", randomAvailability(), randomPrize());

        Lek valsacor = addLekToDB(defaultUser, "Valsacor", randomAvailability(), randomPrize());

        Lek venomenhal = addLekToDB(defaultUser, "Venomenhal", randomAvailability(), randomPrize());

        Lek wegiel = addLekToDB(defaultUser, "Wêgiel leczniczy", randomAvailability(), randomPrize());

        Lek wolarex = addLekToDB(defaultUser, "Wolarex", randomAvailability(), randomPrize());

        Lek xaloptic = addLekToDB(defaultUser, "Xaloptic Combi", randomAvailability(), randomPrize());

        Lek xylometazolin = addLekToDB(defaultUser, "Xylometazolin", randomAvailability(), randomPrize());

        Lek zajavit = addLekToDB(defaultUser, "Zajavit", randomAvailability(), randomPrize());

        Lek ziagen = addLekToDB(defaultUser, "Ziagen", randomAvailability(), randomPrize());

//===============  KATEGORIA CHOROBY ==============================

        KategoriaChoroby skory = addKategoriaChorobyToDB("Choroby skóry?");
        kategorie.add(skory);
        KategoriaChoroby rzadkie = addKategoriaChorobyToDB("Rzadkie choroby?");
        kategorie.add(rzadkie);
        KategoriaChoroby reumatyczne = addKategoriaChorobyToDB("Choroby reumatyczne?");
        kategorie.add(reumatyczne);
        KategoriaChoroby psychosomatyczne = addKategoriaChorobyToDB("Choroby psychosomatyczne?");
        kategorie.add(psychosomatyczne);
        KategoriaChoroby pokarmowe = addKategoriaChorobyToDB("Choroby uk³adu pokarmowego?");
        kategorie.add(pokarmowe);
        KategoriaChoroby oddechu = addKategoriaChorobyToDB("Choroby uk³adu oddechowego");
        kategorie.add(oddechu);
        KategoriaChoroby nowotworowe = addKategoriaChorobyToDB("Choroby nowotworowe");
        kategorie.add(nowotworowe);
        KategoriaChoroby narzadowe = addKategoriaChorobyToDB("Niewydolnoœæ narz¹dowa?");
        kategorie.add(narzadowe);
        KategoriaChoroby nerwowe = addKategoriaChorobyToDB("Choroby uk³adu nerwowego?");
        kategorie.add(nerwowe);
        KategoriaChoroby zmyslow = addKategoriaChorobyToDB("Choroby narz¹dów zmys³ów");
        kategorie.add(zmyslow);
        KategoriaChoroby hematologiczne = addKategoriaChorobyToDB("Choroby hematologiczne");
        kategorie.add(hematologiczne);
        KategoriaChoroby genetyczne = addKategoriaChorobyToDB("Choroby genetyczne");
        kategorie.add(genetyczne);
        KategoriaChoroby cywilizacyjne = addKategoriaChorobyToDB("Choroby cywilizacyjne");
        kategorie.add(cywilizacyjne);
        KategoriaChoroby ruchu = addKategoriaChorobyToDB("Choroby uk³adu ruchu?");
        kategorie.add(ruchu);
        KategoriaChoroby moczowe = addKategoriaChorobyToDB("Choroby uk³adu moczowo-p³ciowego");
        kategorie.add(moczowe);
        KategoriaChoroby stanyNagle = addKategoriaChorobyToDB("Stany nag³e w medycynie");
        kategorie.add(stanyNagle);
        KategoriaChoroby krazenia = addKategoriaChorobyToDB("Choroby uk³adu kr¹¿enia?");
        kategorie.add(krazenia);
        KategoriaChoroby gospodarki = addKategoriaChorobyToDB("Zaburzenia gospodarki wodno-elektrolitowej i równowagi kwasowo-zasadowej");
        kategorie.add(gospodarki);
        KategoriaChoroby psychiczne = addKategoriaChorobyToDB("Zaburzenia psychiczne");
        kategorie.add(psychiczne);
        KategoriaChoroby rozwoju = addKategoriaChorobyToDB("Zaburzenia rozwoju");
        kategorie.add(rozwoju);
        KategoriaChoroby odpornosciowe = addKategoriaChorobyToDB("Zaburzenia uk³adu odpornoœciowego");
        kategorie.add(odpornosciowe);
        KategoriaChoroby metabolcizne = addKategoriaChorobyToDB("Zaburzenia wydzielania wewnêtrznego, stanu od¿ywienia i przemiany metabolicznej");
        kategorie.add(metabolcizne);
        KategoriaChoroby zakazne = addKategoriaChorobyToDB("Choroby zakaŸne");
        kategorie.add(zakazne);
        KategoriaChoroby zapalenie = addKategoriaChorobyToDB("Zapalenia?");
        kategorie.add(zapalenie);
        KategoriaChoroby zawodowe = addKategoriaChorobyToDB("Choroby zawodowe");
        kategorie.add(zawodowe);
        KategoriaChoroby zespolowe = addKategoriaChorobyToDB("Zespo³y chorobowe?");
        kategorie.add(zespolowe);
        KategoriaChoroby dekompresyjne = addKategoriaChorobyToDB("Choroba dekompresyjna");
        kategorie.add(dekompresyjne);
        KategoriaChoroby spoleczne = addKategoriaChorobyToDB("Choroby spo³eczne");
        kategorie.add(spoleczne);
        KategoriaChoroby ukladowe = addKategoriaChorobyToDB("Choroby uk³adowe");
        kategorie.add(ukladowe);
        KategoriaChoroby zwyrodnieniowe = addKategoriaChorobyToDB("Choroby zwyrodnieniowe");
        kategorie.add(zwyrodnieniowe);
//===============  CHOROBA  ==============================

        addChorobaToDB("Zapalenie ucha œrodkowego", tacefur, randomCategory(), defaultUser, "osoba ma katar");

        addChorobaToDB("Zawal", telmisartan, randomCategory(), defaultUser, "osoba kaszle mokro");

        addChorobaToDB("Wzdecia", ulgix, randomCategory(), defaultUser, "osoba ma katar");

        addChorobaToDB("Pierwotna ¿ó³ciowa marskosc w¹troby", ursocam, randomCategory(), defaultUser, "osoba kaszle mokro");

        addChorobaToDB("Kaszel", valsacor, randomCategory(), defaultUser, "osoba ma katar");

        addChorobaToDB("Alergie", venomenhal, randomCategory(), defaultUser, "osoba kaszle mokro");

        addChorobaToDB("Problemy zoladkowe", wegiel, randomCategory(), defaultUser, "osoba ma katar");

        addChorobaToDB("Niedoczynnoœæ tarczycy", wolarex, randomCategory(), defaultUser, "osoba kaszle mokro");

        addChorobaToDB("Bol oka", xaloptic, randomCategory(), defaultUser, "osoba ma katar");

        addChorobaToDB("Zapalenie zatok przynosowych", xylometazolin, randomCategory(), defaultUser, "osoba kaszle mokro");

        addChorobaToDB("Szkorbut", zajavit, randomCategory(), defaultUser, "osoba kaszle");

        addChorobaToDB("HIV", ziagen, randomCategory(), defaultUser, "osoba ma katar");

        addChorobaToDB("Parkinson", nakom, randomCategory(), defaultUser, "osoba ma katar");

        addChorobaToDB("Nerwica", nervosol, randomCategory(), defaultUser, "osoba kaszle mokro");

        addChorobaToDB("Choroba serca", oeparol, randomCategory(), defaultUser, "osoba ma katar");

        addChorobaToDB("Zespó³ suchego oka", optive, randomCategory(), defaultUser, "osoba kaszle mokro");

        addChorobaToDB("Zaka¿enia bakteryjne", pentaglobin, randomCategory(), defaultUser, "osoba ma katar");

        addChorobaToDB("Miazdzyca", plavocorin, randomCategory(), defaultUser, "osoba kaszle mokro");

        addChorobaToDB("Problemy zoladkowe", quatrum, randomCategory(), defaultUser, "osoba ma katar");

        addChorobaToDB("Problemy sercowo-naczyniowe", qumag, randomCategory(), defaultUser, "osoba kaszle mokro");

        addChorobaToDB("Cukrzyca", ramistad, randomCategory(), defaultUser, "osoba ma katar");

        addChorobaToDB("Schizofrenia", risperon, randomCategory(), defaultUser, "osoba kaszle mokro");

        addChorobaToDB("Stwardnienie zanikowe boczne", sclefic, randomCategory(), defaultUser, "osoba kaszle");

        addChorobaToDB("Luszczyca", sulphera, randomCategory(), defaultUser, "osoba ma katar");

        addChorobaToDB("Tradzik", hascoderm, randomCategory(), defaultUser, "osoba ma katar");

        addChorobaToDB("Sucha skora", hydroskin, randomCategory(), defaultUser, "osoba kaszle mokro");

        addChorobaToDB("Bole wszelkiego rodzaju", ibuprom, randomCategory(), defaultUser, "osoba ma katar");

        addChorobaToDB("Grzybica skory", itragen, randomCategory(), defaultUser, "osoba kaszle mokro");

        addChorobaToDB("Rak drog moczowych", javlor, randomCategory(), defaultUser, "osoba ma katar");

        addChorobaToDB("Przerost gruczolu krokowego", jovesto, randomCategory(), defaultUser, "osoba kaszle mokro");

        addChorobaToDB("Bialaczka", kamiren, randomCategory(), defaultUser, "osoba ma katar");

        addChorobaToDB("Zakazenia ukladu oddechowego", klimicin, randomCategory(), defaultUser, "osoba kaszle mokro");

        addChorobaToDB("Biegunka", laremid, randomCategory(), defaultUser, "osoba ma katar");

        addChorobaToDB("Antykoncepcja", logest, randomCategory(), defaultUser, "osoba kaszle mokro");

        addChorobaToDB("Alzheimer", marbodin, randomCategory(), defaultUser, "osoba kaszle");

        addChorobaToDB("Nieplodnosc u kobiet", menopur, randomCategory(), defaultUser, "osoba ma katar");

        addChorobaToDB("Przeziebienie", cepastil, randomCategory(), defaultUser, "osoba ma katar");

        addChorobaToDB("Niedobor wapnia", calcenato, randomCategory(), defaultUser, "osoba kaszle mokro");

        addChorobaToDB("Grzybica skory", dicloabak, randomCategory(), defaultUser, "osoba ma katar");

        addChorobaToDB("Grzybica skory", daktarin, randomCategory(), defaultUser, "osoba kaszle mokro");

        addChorobaToDB("Grypa", grypolek, randomCategory(), defaultUser, "osoba ma katar");

        addChorobaToDB("Refluks zoladkowy", gaviscon, randomCategory(), defaultUser, "osoba kaszle mokro");

        addChorobaToDB("Bialaczka", fludara, randomCategory(), defaultUser, "osoba ma katar");

        addChorobaToDB("Ukaszenie", fenistil, randomCategory(), defaultUser, "osoba kaszle mokro");

        addChorobaToDB("Niewydolnosc nerek", eprex, randomCategory(), defaultUser, "osoba ma katar");

        addChorobaToDB("Problemy skorne", elobaza, randomCategory(), defaultUser, "osoba kaszle mokro");

        addChorobaToDB("Alergia blony sluzowej nosa", aerius, randomCategory(), defaultUser, "osoba kaszle");

        addChorobaToDB("Katar", acatarZatoki, randomCategory(), defaultUser, "osoba ma katar");

        addChorobaToDB("Zaburzenia flory bakteryjnej", acidolac, randomCategory(), defaultUser, "osoba kaszle mokro");

        addChorobaToDB("Zapalenie miejsc intymnych", albothyl, randomCategory(), defaultUser, "osoba kaszle");

        addChorobaToDB("Depresja", anafranil, randomCategory(), defaultUser, "osoba ma katar");

        addChorobaToDB("Zapalenie skory", baikaderm, randomCategory(), defaultUser, "osoba kaszle mokro");

        addChorobaToDB("Zapalenie watroby", baraclude, randomCategory(), defaultUser, "osoba kaszle");

        addChorobaToDB("Niedobor witamin", bebilon, randomCategory(), defaultUser, "osoba ma katar");

        addChorobaToDB("Niezyt nosa", betadrin, randomCategory(), defaultUser, "osoba kaszle mokro");

        addChorobaToDB("Zakazenie drog oddechowych", biseptol, randomCategory(), defaultUser, "osoba kaszle");

        session.getTransaction().commit();
        session.close();
    }

    private Role addRoleToDB(String roleName) {
        Role role = new Role();
        role.setRoleName(roleName);
        session.save(role);

        return role;
    }

    private void addChorobaToDB(String nazwa, Lek lek, KategoriaChoroby kategoriaChoroby, User user, String description) {
        Choroba choroba = new Choroba();
        choroba.setNazwa(nazwa);
        choroba.setUser(user);
        choroba.setLek(lek);
        choroba.setDescription(description);
        choroba.setKategoriaChoroby(kategoriaChoroby);
        session.save(choroba);
    }

    private User addUserToDB(String userName, String password, String email, Date defaultReportDate, Role role) {
        User user = new User();
        user.setUserName(userName);
        user.setPassword(password);
        user.setEmail(email);
        user.setDefaultReportDate(defaultReportDate);
        user.setRole(role);
        session.save(user);

        return user;
    }

    private KategoriaChoroby addKategoriaChorobyToDB(String categoryName) {
        KategoriaChoroby kategoriaChoroby = new KategoriaChoroby();
        kategoriaChoroby.setKategoriaChorobyName(categoryName);
        session.save(kategoriaChoroby);

        return kategoriaChoroby;
    }

    private Lek addLekToDB(User user, String lekName, boolean czyDostepny, double cena) {
        Lek lek = new Lek();
        lek.setUser(user);
        lek.setLekName(lekName);
        lek.setCena(cena);
        lek.setCzyDostepny(czyDostepny);
        session.save(lek);

        return lek;
    }

    private Double randomPrize() {
        return Double.valueOf(String.format(Locale.US, "%.2f", ThreadLocalRandom.current().nextDouble(0.1, 150.0)));
    }

    private boolean randomAvailability() {
        Random random = new Random();
        return random.nextBoolean();
    }

    private KategoriaChoroby randomCategory() {
        Random random = new Random();
        return kategorie.get(random.nextInt(kategorie.size() - 1));
    }
}
