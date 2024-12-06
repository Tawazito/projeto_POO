package main;

/**
 *
 * @author Tawaf
 */
public class Livro {
    
     private int id;
     private String nome_livro;
    private String nome_autor;
    private String data_lancamento;
    private String genero;

    public Livro(int id, String nome_livro, String nome_autor, String data_lancamento, String genero) {
        this.id = id;
        this.nome_livro = nome_livro;
        this.nome_autor = nome_autor;
        this.data_lancamento = data_lancamento;
        this.genero = genero;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    
    
    public String getNome_livro() {
        return nome_livro;
    }

    public void setNome_livro(String nome_livro) {
        this.nome_livro = nome_livro;
    }

    public String getNome_autor() {
        return nome_autor;
    }

    public void setNome_autor(String nome_autor) {
        this.nome_autor = nome_autor;
    }

   

    public String getData_lancamento() {
        return data_lancamento;
    }

    public void setData_lancamento(String data_lancamento) {
        this.data_lancamento = data_lancamento;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
    
    
    
    
    
}
