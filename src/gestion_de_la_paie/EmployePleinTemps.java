// Ben Said   Zine El Abidine
package gestion_de_la_paie;

/**
 *
 * @author Zinou
 */
public class EmployePleinTemps extends Employe {
    
    private double SolaireParSomaine ;
    private boolean Pnuit ;
    private boolean Pweek_end ;
    private final double PRnuit = 2000.0 ;
    private final double PRweek_end = 2500.0 ;
    
    public EmployePleinTemps(String Nom, String Fct,double SPS, boolean Pnuit, boolean Pweek) {
        super(Nom, Fct);
        this.SolaireParSomaine = SPS;
        this.Pnuit = Pnuit;
        this.Pweek_end = Pweek;
    }
    
   
    @Override
    public double calculMontant ()
    {
        if(this.Pnuit == true)
            if(this.Pweek_end == true)
               return this.SolaireParSomaine * 4 + this.PRnuit + this.PRweek_end;
            else
                return this.SolaireParSomaine * 4 + this.PRnuit;
        else
            if(this.Pweek_end == true)
                return this.SolaireParSomaine * 4 + this.PRweek_end;
            else 
                return this.SolaireParSomaine * 4;
    }
    
    
    
}
