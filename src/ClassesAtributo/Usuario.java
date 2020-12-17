/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClassesAtributo;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Set;

/**
 *
 * @author Guilherme Cabral
 */
public class Usuario {
    
    //Atributos
    private String nome;
    private String email;
    private String nascimento;
    private String cpf;
    private String id;
    
    private HashMap <String, Calendar> ids = new HashMap <> ();
    private double divida;
    
    public Usuario (String nome, String email, String data, String cpf, String id)
    {
        this.nome = nome;
        this.email = email;
        this.nascimento = data;
        this.cpf = cpf;
        this.id = id;
    }
    
    public void setDocs(String id, Calendar devolucao)
    {
        ids.put(id, devolucao);
    }
    public void setDivida(Double d)
    {
        if (d == 0)
        {
            divida = 0;
        }
        else
        {
            divida += d;
        }
    }
    
    public String getNome()
    {
        return nome;
    }
    
    public String getID()
    {
        return id;
    }

    public String getEmail() 
    {
        return email;
    }

    public String getCPF() 
    {
        return cpf;
    }

    public String getNascimento() 
    {
        return nascimento;
    }
    public double getDivida()
    {
        return divida;
    }
    public double getDividaDocAtuais()
    {
        double dividaAtuais = 0;
        if (ids.size() > 0)
        {
            int diasAtrasados;
            Calendar dtAtual = Calendar.getInstance();
            Set<String> chaves = ids.keySet();
            for (String i : chaves)
            {
                Calendar dtDevolucao = ids.get(i);
                diasAtrasados = dtAtual.get(Calendar.DAY_OF_YEAR) - dtDevolucao.get(Calendar.DAY_OF_YEAR);
                
                if (diasAtrasados > 0)
                {
                    dividaAtuais += diasAtrasados * 0.5;
                }
            }
        }
        return dividaAtuais;
    }
     public int getQuantiaDoc()
    {
        return ids.size();
    }
    
    public boolean testaDoc(String s)
    {
      int i = 0;
      boolean t = false;
        
      if (ids.size() > 0)
        {
        do
        {   
            if (ids.containsKey(s))
            {
                t = true;
            }
            i++;
        }
        while (i < ids.size() && t == false);
      }
      
      return t;
    }
    
    public void removerDoc(String s)
    {
        ids.remove(s);
    }
}
