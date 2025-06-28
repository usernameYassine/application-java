//Yassine SISBANE p2411964

public class App {
    protected String nom;
    protected int id;
    protected String[] nomsDeveloppeurs;
    protected double prix;
    protected double evaluation;
    protected int nombreDeTelechargements = 0;
    protected int nombreEvaluations = 0;
    protected int sommeEvaluations = 0;

    public App(String nom, String[] nomsDeveloppeurs, float prix) {
        this.nom = nom;

        for (int i = 0; i < nomsDeveloppeurs.length; i++)
            this.nomsDeveloppeurs[i] = nomsDeveloppeurs[i];

        this.prix = prix;
    }

    public void Evaluer(int entier) {
        if (entier >= 0 && entier <= 5) {
            this.evaluation = entier;
            this.sommeEvaluations += entier;
            this.nombreDeTelechargements++;
            this.nombreEvaluations++;
        } else {
            System.out.println("Erreur : la note doit être comprise entre 0 et 5");
        }
    }

    public void affiche(){
        System.out.println(" Nom :" + this.nom + "Prix : " + this.prix );

        for(int i=0; i<nomsDeveloppeurs.length;i++){
            System.out.println(nomsDeveloppeurs[i]);
        }
    }
}