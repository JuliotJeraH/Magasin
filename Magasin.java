public class Magasin {
    Produit[] produits;
    Client[] clients;
    Vente[] ventes;

    public Magasin(Produit[] produits, Client[] clients, Vente[] ventes) {
        this.produits = produits;
        this.clients = clients;
        this.ventes = ventes;
    }

    Produit[] nPlusChers(int n) {
        Produit[] plusChers = new Produit[n];
        for (int i = 0; i < n; i++) {
            plusChers[i] = produits[i];
        }

        for (int i = n; i < produits.length; i++) {
            Produit p = produits[i];
            for (int j = 0; j < n; j++) {
                if (p.prixVente > plusChers[j].prixVente) {
                    for (int k = n - 1; k > j; k--) {
                        plusChers[k] = plusChers[k - 1];
                    }
                    plusChers[j] = p;
                    break;
                }
            }
        }
        return plusChers;
    }

    Produit plusMarge() {
        Produit plusMarge = produits[0];
        double maxPourcentageMarge = 0;

        for (int i = 1; i < produits.length; i++) {
            double pourcentageTemp = (produits[i].prixVente - produits[i].prixAchat) / produits[i].prixVente * 100;
            if (pourcentageTemp > maxPourcentageMarge) {
                maxPourcentageMarge = pourcentageTemp;
                plusMarge = produits[i];
            }
        }
        return plusMarge;
    }

    double pourcentage(Produit produit) {
        double benefice = 0;
        benefice += produit.prixVente - produit.prixAchat;
        return (benefice / produit.prixVente) * 100;
    }

    int biscuitRakoto() {
        int quantite = 0;
        for (int i = 0; i < ventes.length; i++) {
            if ((ventes[i].p.nom == "Biscuit") && ventes[i].Client.nom.equals("Rakoto")) {
                quantite += ventes[i].quantite;
            }
        }
        return quantite;
    }
}
