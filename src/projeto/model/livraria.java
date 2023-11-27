package projeto.model;

public class livraria extends projeto {
	
	private String capaDura;
	public String visualizar;

	public livraria(int numPaginas, String autor, String genero, String capaDura) {
		super(numPaginas, autor, genero);
		this.capaDura = capaDura;
		
	}

	public String getCapaDura() {
		return capaDura;
	}

	public void setCapaDura(String capaDura) {
		this.capaDura = capaDura;
	}


	}


	
	



