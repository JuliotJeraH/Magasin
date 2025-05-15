public class Magasin{
    public static void main(String[] args){
        Produit produits[] = new Produit[3];
        Client clients[] = new Client[3];
        Vente ventes[] = new Vente[5];
        Produit plusVendu = null;
        Produit plusMarge = null;
        double PrcntMarge = 0;
        int biscuitRakoto = 0;

        // Ireo Produit
        Produit produit1= new Produit("Biscuit",1000, 1500, 100);
        Produit produit2= new Produit("Kakapigeon", 500, 1000, 50); 
        Produit produit3= new Produit("Salto", 1500, 2000, 200);

        // Ireo Client
        Client client1= new Client("Haja");
        Client client2= new Client("Hery");
        Client client3= new Client("Rakoto");

        // Ireo Vente
        Vente vente1= new Vente(produit2, client1, 10);
        Vente vente2= new Vente(produit1, client3, 5);
        Vente vente3= new Vente(produit3, client2, 20);
        Vente vente4= new Vente(produit1, client3, 15);
        Vente vente5= new Vente(produit2, client2, 8);

        // Ireo Listes
        produits[0] = produit1;
        produits[1] = produit2;
        produits[2] = produit3;

        clients[0] = client1;
        clients[1] = client2;
        clients[2] = client3;

        ventes[0] = vente1;
        ventes[1] = vente2;
        ventes[2] = vente3;
        ventes[3] = vente4;
        ventes[4] = vente5;

        // Affichage 
        plusVendu=Vente.PlusVendu(produits, ventes);
        System.out.println("\nLe produit le plus vendu est: "+plusVendu.nom + "\n");
        plusMarge= Vente.plusMarge(produits);
        PrcntMarge= Vente.pourcentage(plusMarge);
        System.out.println("Le produit ayant plus de marge est: " + plusMarge.nom + " avec " + String.format("%.2f", PrcntMarge) + "% marge de benefice\n");
        biscuitRakoto= Vente.biscuitRakoto(clients,ventes);
        System.out.println("La quantite de biscuit a ete achetee par Rakoto est: "+ biscuitRakoto+"\n");
    }
}
