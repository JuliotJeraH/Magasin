public class Magasin {
    Produit[] produits;
    Client[] clients;
    Vente[] ventes;

    public Magasin(Produit[] produits, Client[] clients, Vente[] ventes) {
        this.produits = produits;
        this.clients = clients;
        this.ventes = ventes;
    }

    Produit[] DeuxPlusChers() {
        Produit plusChers[] = new Produit[2];
        plusChers[0] = produits[0];
        plusChers[1] = produits[1];

        for (int i = 0; i < produits.length; i++) {
            Produit p = produits[i];
            if (p.prixVente > plusChers[0].prixVente) {
                plusChers[0] = p;
            } else if (plusChers[0].prixVente > p.prixVente) {
                Produit temp;
                temp = plusChers[0];
                plusChers[0] = plusChers[1];
                plusChers[1] = temp;
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
