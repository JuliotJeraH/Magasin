public class Produit {
    String nom;
    double prixAchat;
    int quantite;
    double prixVente;

    public Produit(String nom, double prixAchat, double prixVente, int quantite) {
        this.nom = nom;
        this.prixAchat = prixAchat;
        this.prixVente = prixVente;
        this.quantite = quantite;
    }
}
