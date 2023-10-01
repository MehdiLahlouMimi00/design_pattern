package org.example.OrdinateursFactory;

public class Serveur implements Ordinateur{
    @Override
    public void usage() {
        // Usage d'entreprise
    }

    @Override
    public String donnerUtilisateur() {
        return "entreprise";
    }
}
