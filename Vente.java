public class Vente {
    Produit p;
    Client Client;
    int quantite;
    
    public Vente(Produit p, Client client, int quantite) {
        this.p = p;
        this.Client = client;
        this.quantite = quantite;
    }
    
    static Produit PlusVendu(Produit produits[], Vente ventes[]){
        Produit plusVendu = produits[0];
        int maxQuantite = 0;
        
        for (int i = 0; i < ventes.length; i++) {
            int quantiteTotale = ventes[i].quantite;
            for (int j = i + 1; j < ventes.length; j++) {
                if (ventes[j].p == ventes[i].p) {
                    quantiteTotale += ventes[j].quantite;
                }
            }
            if (quantiteTotale > maxQuantite) {
                maxQuantite = quantiteTotale;
                plusVendu = ventes[i].p;
            }
        }
        return plusVendu;
    }

    
    static Produit plusMarge(Produit produits[]){
        Produit plusMarge = produits[0];
        double maxBenefice = produits[0].prixVente - produits[0].prixAchat;
        
        for (int i = 1; i < produits.length; i++) {
            double Benefice = produits[i].prixVente - produits[i].prixAchat;
            if (Benefice > maxBenefice) {
                maxBenefice = Benefice;
                plusMarge = produits[i];
            }
        }
        return plusMarge;
    }
     
    static double pourcentage(Produit produit){
        double benefice = 0;
        benefice += produit.prixVente - produit.prixAchat;
        return (benefice/produit.prixVente)*100;
    }

    static int biscuitRakoto(Client clients[], Vente ventes[]){
        int quantite = 0;
        for (int i = 0; i < ventes.length; i++) {
            if ((ventes[i].p.nom=="Biscuit") && ventes[i].Client.nom.equals("Rakoto")) {
                quantite += ventes[i].quantite;
            }
        }
        return quantite;
    }

}
