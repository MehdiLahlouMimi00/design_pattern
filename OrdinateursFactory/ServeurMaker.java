package org.example.OrdinateursFactory;

public class ServeurMaker extends OrdiMaker{
    @Override
    public Serveur creerOrdi()
    {
        return new Serveur();
    }
}
