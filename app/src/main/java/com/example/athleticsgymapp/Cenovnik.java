package com.example.athleticsgymapp;

public class Cenovnik {
    private String vrstaPaketaCenovnika;
    private int cena;
    private String url;
    private boolean isEsxpanded;

    public Cenovnik(String vrstaPaketaCenovnika, int cena, String url) {
        this.vrstaPaketaCenovnika = vrstaPaketaCenovnika;
        this.cena = cena;
        this.url = url;
        isEsxpanded = false;
    }

    public String getVrstaPaketaCenovnika() {
        return vrstaPaketaCenovnika;
    }

    public void setVrstaPaketaCenovnika(String vrstaPaketaCenovnika) {
        this.vrstaPaketaCenovnika = vrstaPaketaCenovnika;
    }

    public int getCena() {
        return cena;
    }

    public void setCena(int cena) {
        this.cena = cena;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public boolean isEsxpanded() {
        return isEsxpanded;
    }

    public void setEsxpanded(boolean esxpanded) {
        isEsxpanded = esxpanded;
    }
}
