public class Jeu extends App {
    public String typeJeu;
    public boolean multijoueur;

    public Jeu(String nom, String[] nomsDeveloppeurs, float prix, String typeJeu, boolean multijoueur) {
        super(nom, nomsDeveloppeurs, prix);
        this.typeJeu = typeJeu;
        this.multijoueur = multijoueur;
    }

    public void affiche() {
        super.affiche();
        System.out.println("Type de jeu : " + typeJeu + " Multijoueur : " + multijoueur);
    }
}
