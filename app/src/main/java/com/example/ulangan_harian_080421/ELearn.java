package com.example.ulangan_harian_080421;

public class ELearn {
    private String subject;
    private String jumlah;

    public ELearn(String subject, String jumlah) {
        this.subject = subject;
        this.jumlah = jumlah;
    }

    public String getSubject() {return subject;}

    public void setSubject(String subject) { this.subject = subject; }

    public String getJumlah() {return jumlah;}

    public void setJumlah(String jumlah) { this.jumlah = jumlah; }
}
