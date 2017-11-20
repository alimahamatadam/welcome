public class Salary {
    public static void main(String[] args) {
        Personnel p = new Personnel();
p.ajouterEmploye(new Vendeur("oumarou", "Halilou", 42, "1995","16A", 30000));
p.ajouterEmploye(new Representant(" Andre ", "Felix", 76, "2001","56B", 20000));
p.ajouterEmploye(new Technicien("Hassanou", "Ousmanou", 43, "1998","97C", 1000));
p.ajouterEmploye(new Manutention("judicael", "Kouladoum", 54, "1998","86B", 45));
p.ajouterEmploye(new TechnRisque("Tata", "Titi", 31, "2000","19C", 15000));
p.ajouterEmploye(new ManutRisque("Almeyda", "Doudou", 39, "2001","80A", 4500));
p.afficherSalaires();
System.out.println("Le salaire moyen dans l'entreprise est de "
+ p.salaireMoyen() + " francs.");
   
    }
    
}
