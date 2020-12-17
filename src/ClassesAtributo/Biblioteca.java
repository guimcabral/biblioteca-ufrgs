/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClassesAtributo;
import java.util.*;
import javax.swing.JTextField;
/**
 *
 * @author Guilherme Cabral
 */
public abstract class Biblioteca {
    
    //Atributos
    //Listas para guardar usuários e documentos
    private static HashMap <String, Usuario> usuarios = new HashMap <> ();  
    private static HashMap <String, Documento> documentos = new HashMap <> ();  
    //String auxiliar para alteração de documento ou usuário
    private static String idAuxiliar;
    private static String idAuxiliar2;
    //usuarios.put(K, V);
    //usuarios.containsKey( K );
    //usuarios.get(K);
    //usuarios.get.(K).metodo();
    //usuarios.replace(K, V);
    //usuarios.remove(K);
    //for (String key : usuarios.keySet()) 
        //{
                      
                      //Capturamos o valor a partir da chave
                      //Usuario value = usuarios.get(key);
                      //System.out.println(usuarios.get(key).getID());
        //}
    
    //Seta um novo usuário.
    public static void setUser(Usuario user)
    {
        usuarios.put(user.getID(), user);
        System.out.println("Usuário adicionado");
    }
    public static void setDoc(Documento doc)
    {
        documentos.put(doc.getID(), doc);
        System.out.println("Documento adicionado");
    }
    //Seta uma nova id auxilar
    public static void setIDAuxiliar(String id)
    {
        idAuxiliar = id;
    }
    public static void setIDAuxiliar2(String id)
    {
        idAuxiliar2 = id;
    }
    
    public static String getIDAuxiliar()
    {
        return idAuxiliar;
    }
    public static String getIDAuxiliar2()
    {
        return idAuxiliar2;
    }
        
    //Testa se algum usuário já foi cadastrado com essa ID e retornar um boolean;
    //true, caso sim, false, caso não;
    public static boolean testaIDUser(String id)
    {
        System.out.println("Testando ID"); //@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
        return usuarios.containsKey(id);
    }
    public static boolean testaIDDoc(String id)
    {
        System.out.println("Testando IDz"); //@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
        System.out.println(id); //@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
        return documentos.containsKey(id);
    }
    
    //Recebe uma key e retorna seu respectivo usuário
    public static Usuario user(String id)
    {
        return usuarios.get(id);
    }
    //Recebe uma key e retorna seu respectivo documento
    public static Documento doc(String id)
    {
        return documentos.get(id);
    }
    
    public static void removeUser(String id)
    {
        usuarios.remove(id);
        System.out.println("Usuario removido");
    }
    public static void removeDoc(String id)
    {
        documentos.remove(id);
        System.out.println("Documento removido");
    }
}

