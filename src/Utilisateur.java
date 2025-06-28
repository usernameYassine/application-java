public class Utilisateur {
    public String nom;
    public int id;
    public App[] tableauApp;
    public double solde;

    public Utilisateur(String nom, double solde) {
        this.nom = nom;
        this.solde = 0;
    }

    public void AfficheSole() {
        System.out.println("Solde : " + solde);
    }

    public int nombreApp() {
        int compteur = 0;
        for (int i = 0; i < tableauApp.length; i++) {
            compteur = compteur + 1;
        }

        return compteur;
    }

    public void AcheterApp(App app1) {
        App[] tableauApp2 = new App[tableauApp.length + 1];
        app1 = tableauApp2[tableauApp2.length];
    }

    public void desinstallerApp(App app1) {
        for (int i = 0; i < tableauApp.length; i++) {
            if (tableauApp[i].equals(app1)) {
            }
        }

    }

}
