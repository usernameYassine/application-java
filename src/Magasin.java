public class Magasin {
    public static void main(String[] args) {
        Jeu jeu1 = new Jeu("Candy Crush Saga" + "King" + true + "Occasionnel");


        Utilisateur utilisateur1=new Utilisateur("Johnson Creed", 1.0);
        System.out.println(utilisateur1.solde);


        //Utilisateur.acheterApp(jeu1);
        //jeu1.desinstallerApp(); //si le super fonctionnait
    }
}
