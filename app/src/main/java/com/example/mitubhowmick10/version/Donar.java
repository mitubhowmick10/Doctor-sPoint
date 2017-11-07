package com.example.mitubhowmick10.version;

/**
 * Created by mitubhowmick10 on 11/3/17.
 */

public class Donar {
    String dname;
    String dpesha;
    String dage;
    String dweight;
    String dcontact;
    String dbldgrp;
   public Donar()
    {

    }
   public Donar(String dname,String dpesha,String dage,String dweight,String dcontact)
    {
        this.dname=dname;
        this.dpesha=dpesha;
        this.dage=dage;
        this.dweight=dweight;
        this.dcontact=dcontact;
    }

    public String getDname() {
        return dname;
    }

    public String getDpesha() {
        return dpesha;
    }

    public String getDage() {
        return dage;
    }

    public String getDweight() {
        return dweight;
    }

    public String getDcontact() {
        return dcontact;
    }

    public String getDbldgrp() {
        return dbldgrp;
    }
}
