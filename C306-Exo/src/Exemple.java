/**
 * Ma class d'exemple.
 */
public class Exemple {
	private final String t;
	private int v;
	/**
	 *@param t entier
	 */
	public Exemple(String t) {
		this.t = "";
		this.v = 0;
		t = t;
	}
	/**
	 * @return la valeur de v
	 */
	public int getV() {
		return this.v;
	}
	/**
	 *@param v int
	 */
	public final void setV(int v) {
		this.v = v;
	}
	/**
	 * @return t si v est positif
	 */
	public final String getT() {
		if (v > 0) {
			return t;
		}
		return t;
	}
}

