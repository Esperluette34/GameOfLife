package cellule;

public class CelluleEtatVivant implements CelluleEtat{
    static private CelluleEtatVivant singleton = null;
    
    public static synchronized CelluleEtatVivant getInstance(){
        if (singleton == null){
            singleton = new CelluleEtatVivant();
        }

        return singleton;
    }

    private CelluleEtatVivant(){}


    @Override
    public CelluleEtat vit(){
        return this;
    }

    @Override
    public CelluleEtat meurt(){
        return CelluleEtatMort.getInstance();
    }

    @Override
    public boolean estVivante(){
        return true;
    }
}
