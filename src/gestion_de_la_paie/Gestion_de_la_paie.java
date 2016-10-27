// Ben Said   Zine El Abidine
package gestion_de_la_paie;

/**
 *
 * @author Zinou
 */
public class Gestion_de_la_paie {

   
    public static void main(String[] args) {
       
        Employe []Emp = new Employe [6];
        
        Emp [0] = new Employe("Salim","PDG", 100000.0);
        Emp [1] = new EmployePleinTemps("Halima", "Secrétaire", 5000.0, false, false);
        Emp [2] = new EmpolyeTempsPartiel("Abd El Halim", "Agent de Sécurité", 500.0, 30);
        Emp [3] = new EmployePleinTemps("Abd El Kader", "Agent de Sécurité", 3000.0, true, false);
        Emp [4] = new EmployePleinTemps("Meriem", "Secrétaire", 5000.0, false, true);
        Emp [5] = new EmployePleinTemps("SidAhmed", "Agent de Sécurité",3000.0, true, true);
        
        
        for(Employe val : Emp)
        {
          System.out.println(val.Cheque());
          System.out.println("-------------------");
        }
    }
    
}
