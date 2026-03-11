package esperluette34.cellule;

import esperluette34.cellule.CelluleEtat;
import esperluette34.JeuDeLaVie;

public class Cellule {
    private int x;
    private int y;
    private CelluleEtat etat;

    public Cellule(int x, int y, CelluleEtat etat){
        this.x = x;
        this.y = y;
        this.etat = etat;
    }

    public void vit(){
        this.etat = etat.vit();
    }

    public void meurt(){
        this.etat = etat.meurt();
    }

    public boolean estVivante(){
        return this.etat.estVivante();
    }

    public int nombreVoisinesVivantes(JeuDeLaVie jeu){
        int count = 0;
        for (int i = x - 1; i <= x + 1; i++){
            for (int j = y - 1; j <= y + 1; j++){
                if (i != x || j != y){
                    Cellule c = jeu.getGrilleXY(i, j);
                    if (c != null && c.estVivante()){
                        count++;
                    }
                }
            }
        }
        return count;
    }

    public String toString(){
        return (this.etat.estVivante()) ? " 1 " : " 0 ";
    }
}
