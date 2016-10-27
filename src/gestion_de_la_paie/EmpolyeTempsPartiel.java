// Ben Said   Zine El Abidine
package gestion_de_la_paie;
/**
 *
 * @author Zinou
 */
public class EmpolyeTempsPartiel extends Employe {
    
    private double SalaireHeure ;
    private int Heure;
    
    public EmpolyeTempsPartiel(String Nom, String Fct, double SalaireHeure, int Heure) {
        super(Nom, Fct);
        this.SalaireHeure = SalaireHeure;
        this.Heure = Heure;
    }
    
    @Override
     public double calculMontant ()
    {
        return this.SalaireHeure * this.Heure;
    }
}
