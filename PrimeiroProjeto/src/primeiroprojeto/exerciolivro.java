package primeiroprojeto;

public class exerciolivro {

	public static void main(String[] args) {
		  // variáveis de instância - substitua o exemplo abaixo pelo seu próprio
	    private String titulo;
	    private String autor;
	    private int numPaginas;
	    
	    public void Livro(String titulo, String autor, int numPaginas) {
	        // inicializa variáveis de instância
	        this.titulo = titulo;
	        this.autor = autor;
	        this.numPaginas = numPaginas;
	    }

	    
	    public String getTitulo(){
	        // escreva seu código aqui
	        return titulo;
	    }
	    public void setTitulo(){
	        this.titulo = titulo;
	    }
	    
	    public String getAutor(){
	        // escreva seu código aqui
	        return autor;
	    }
	    public void setAutor(){
	        this.autor = autor;
	    }
	        public int getNumPaginas(){
	        // escreva seu código aqui
	        return numPaginas;
	    }
	    public void setNumPaginas(int numPaginas){
	        this.numPaginas = numPaginas;
	    }
	    @Override
	    public String toString (){
	        return "Livro{ " +
	            "titulo=" + titulo +   
	            "autor=" + autor +  
	            "numPaginas=" + numPaginas;
	        }
	    }
	}

