package cellule;

public class CelluleEtatMort implements CelluleEtat{
    static private CelluleEtatMort singleton;

    public static synchronized CelluleEtatMort getInstance(){
        if (singleton == null){
            singleton = new CelluleEtatMort();
        }

        return singleton;
    }

    private CelluleEtatMort(){}

    @Override
    public CelluleEtat vit(){
        return CelluleEtatVivant.getInstance();
    }

    @Override
    public CelluleEtat meurt(){
        return this;
    }

    @Override
    public boolean estVivante(){
        return false;
    }
}