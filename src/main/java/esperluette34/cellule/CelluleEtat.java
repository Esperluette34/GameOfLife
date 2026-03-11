package esperluette34.cellule;

public interface CelluleEtat{
    CelluleEtat vit();
    CelluleEtat meurt();
    boolean estVivante();
}