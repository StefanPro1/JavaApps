package model;
// Generated 06-Aug-2018 19:42:17 by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Korisnici generated by hbm2java
 */
public class Korisnici  implements java.io.Serializable {


     private int idKorisnici;
     private String ime;
     private String prezime;
     private String adresa;
     private String brTelefona;
     private String username;
     private String password;
     private Set<Rezervacija> rezervacijas = new HashSet<>(0);

     
    public Korisnici() {
    }

	
    public Korisnici(int idKorisnici) {
        this.idKorisnici = idKorisnici;
    }
    public Korisnici(int idKorisnici, String ime, String prezime, String adresa, String brTelefona, String username, String password, Set<Rezervacija> rezervacijas) {
       this.idKorisnici = idKorisnici;
       this.ime = ime;
       this.prezime = prezime;
       this.adresa = adresa;
       this.brTelefona = brTelefona;
       this.username = username;
       this.password = password;
       this.rezervacijas = rezervacijas;
    }
   
    public int getIdKorisnici() {
        return this.idKorisnici;
    }
    
    public void setIdKorisnici(int idKorisnici) {
        this.idKorisnici = idKorisnici;
    }
    public String getIme() {
        return this.ime;
    }
    
    public void setIme(String ime) {
        this.ime = ime;
    }
    public String getPrezime() {
        return this.prezime;
    }
    
    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }
    public String getAdresa() {
        return this.adresa;
    }
    
    public void setAdresa(String adresa) {
        this.adresa = adresa;
    }
    public String getBrTelefona() {
        return this.brTelefona;
    }
    
    public void setBrTelefona(String brTelefona) {
        this.brTelefona = brTelefona;
    }
    public String getUsername() {
        return this.username;
    }
    
    public void setUsername(String username) {
        this.username = username;
    }
    public String getPassword() {
        return this.password;
    }
    
    public void setPassword(String password) {
        this.password = password;
    }
    public Set<Rezervacija> getRezervacijas() {
        return this.rezervacijas;
    }
    
    public void setRezervacijas(Set<Rezervacija> rezervacijas) {
        this.rezervacijas = rezervacijas;
    }




}

