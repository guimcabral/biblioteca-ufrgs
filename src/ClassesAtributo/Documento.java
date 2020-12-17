/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClassesAtributo;

/**
 *
 * @author Guilherme Cabral
 */
public class Documento {
    //Atributos
    private String id;
    private String autor;
    private String titulo;
    private String ano;
    private String numPaginas;
    private String assunto;
    private int quantidade;
    
    //Construtor
    public Documento (String titulo, String id, String autor, String assunto, String ano, String numPaginas, int quantidade)
    {
        this.titulo = titulo;
        this.id = id;
        this.autor = autor;
        this.assunto = assunto;
        this.ano = ano;
        this.numPaginas = numPaginas;
        this.quantidade = quantidade;        
    }
    
    //Getters
    public String getTitulo()
    {
        return titulo;
    }
    public String getID()
    {
        return id;
    }
    public String getAutor()
    {
        return autor;
    }
    public String getAssunto()
    {
        return assunto;
    }
    public String getAno()
    {
        return ano;
    }
    public String getPaginas()
    {
        return numPaginas;
    }
    public int getQuantidade ()
    {
        return quantidade;
    }
    
    //Setters
    public void setQuantidade (int qtd)
    {
        quantidade = qtd;
    }
}
