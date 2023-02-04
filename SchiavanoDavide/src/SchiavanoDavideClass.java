/** 
 * Classe SchiavanoDavideClass
 * @author <strong>SchiavanoDavide</strong>
 * <U>4^AI </U>
 *<i>04/02/2023</i>
 */
public class SchiavanoDavideClass {
/**
 * Costruttore di default della classe
 */
public SchiavanoDavideClass() {}
/**
 * Metodo che ritorna la produttoria di un certo numero di fattori da s a f 
 * @param s Indice iniziale della produttoria di tipo intero
 * @param f Indice finale della produttoria di tipo intero
 * @return Risultato della produttoriadi tipo intero
 */
public int schiavanoMet(int s,int f) {
	/* Il metodo in questa versione (Versione 0) del progetto non calcola nessuna produttoria
	 * perchè dichiarando la variabile locale intera "r" e inizializzandola a valore 0
	 * e sommandola a se stessa nel ciclo for succede che il metodo ritorni sempre 0 (0+0=0)
	 
int r=0;
for (int i = 1; i <f; i++) {
	r=r+r;
}

return r;
*/
	 
int r=1;
for (int i = s; i <=f; i++) {
	r*=i;
}

return r;
 
}
	public static void main(String[] args) {
		SchiavanoDavideClass produttoria =new SchiavanoDavideClass();
		System.out.println(produttoria.schiavanoMet(5,7));
		System.out.println(produttoria.schiavanoMet(2,9));
		System.out.println(produttoria.schiavanoMet(4,6));
	}

}
