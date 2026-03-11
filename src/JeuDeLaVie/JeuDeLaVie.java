package JeuDeLaVie;

import cellule.Cellule;
import cellule.CelluleEtatMort;
import cellule.CelluleEtatVivant;

import java.lang.Math;

public class JeuDeLaVie{
    private Cellule[][] grille;
    private int xMax;
    private int yMax;

    public JeuDeLaVie(int xMax, int yMax){
        this.xMax = xMax;
        this.yMax = yMax;
        this.grille = new Cellule[xMax][yMax];
    }

    public void initialiseGrille(){
        for (int x = 0; x < xMax; x++){
            for (int y = 0; y < yMax; y++){
                this.grille[x][y] = new Cellule(x, y, (Math.random() > 0.5) ? CelluleEtatVivant.getInstance() : CelluleEtatMort.getInstance());
            }
        }
    }

    public Cellule getGrille(int x, int y){
        if (x >= xMax || y >= yMax){
            return null;
        }

        return new Cellule(x, y, (grille[x][y].estVivante()) ? CelluleEtatVivant.getInstance() : CelluleEtatMort.getInstance());
    }
}