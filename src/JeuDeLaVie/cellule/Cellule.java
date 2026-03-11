package JeuDeLaVie.cellule;

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
                if (i != x && j != y && jeu.getGrilleXY(i, j).estVivante()){
                    count++;
                }
            }
        }
        return count;
    }
}
