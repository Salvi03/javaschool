package main;

class Studente {
    private String nome;
    private String cognome;
    private float media;

    public Studente(String n, String c, float mediavoti) {
        nome = n;
        cognome = c;
        media = mediavoti;
    }

    public void setNome(String n) {
        this.nome = n;
    }

    public String getNome() {
        return this.nome;
    }

    public void setCognome(String c) {
        this.cognome = c;
    }

    public String getCognome() {
        return this.cognome;
    }

    public void setMedia(float n) {
        this.media = n;
    }

    public float getMedia() {
        return this.media;
    }
}

public class Main {

    public static void main(String[] args) {
        Studente s1 = new Studente("Cristian", "Salvi", 7);
        Studente s2 = new Studente("Matt", "Festa", (float) 7.5);

        s2.setNome("Matteo");

        System.out.println(s1.getNome() + " " + s1.getCognome() + "\n" + s2.getNome() + " " + s2.getCognome());
    }
}
