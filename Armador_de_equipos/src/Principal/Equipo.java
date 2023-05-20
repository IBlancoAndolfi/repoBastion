package Principal;

public class Equipo {
	
	private String arquero;
	private String defensor1;
	private String defensor2;
	private String medio;
	private String delantero1;
	private String delantero2;

	public Equipo(String arquero, String defensor1, String defensor2, String medio, String delantero1, String delantero2) {
		this.arquero=arquero;
		this.defensor1=defensor1;
		this.defensor2=defensor2;
		this.medio=medio;
		this.delantero1=delantero1;
		this.delantero2=delantero2;
	}

	public String getArquero() {
		return arquero;
	}

	public String getDefensor1() {
		return defensor1;
	}

	public String getDefensor2() {
		return defensor2;
	}

	public String getMedio() {
		return medio;
	}

	public String getDelantero1() {
		return delantero1;
	}

	public String getDelantero2() {
		return delantero2;
	}
	
	

}
