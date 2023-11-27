package projeto.model;

public abstract class projeto {
	
	private int numPaginas;
	public String autor;
	public String genero;
	
	
	public projeto(int numPaginas, String autor, String genero) {
		this.numPaginas = numPaginas;
		this.autor = autor;
		this.genero = genero;
	}


	public int getNumPaginas() {
		return numPaginas;
	}


	public void setNumPaginas(int numPaginas) {
		this.numPaginas = numPaginas;
	}


	public String getAutor() {
		return autor;
	}


	public void setAutor(String autor) {
		this.autor = autor;
	}


	public String getGenero() {
		return genero;
	}

	
	public void setGenero(String genero) {
		this.genero = genero;
	}
	

}



