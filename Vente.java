public class Vente {
    Produit p;
    Client Client;
    int quantite;

    public Vente(Produit p, Client client, int quantite) {
        this.p = p;
        this.Client = client;
        this.quantite = quantite;
    }
}
