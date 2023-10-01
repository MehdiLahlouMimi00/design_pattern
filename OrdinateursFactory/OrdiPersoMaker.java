package org.example.OrdinateursFactory;

public class OrdiPersoMaker extends OrdiMaker{
    @Override
    public OrdiPersonnel creerOrdi() {
        return new OrdiPersonnel();
    }
}
