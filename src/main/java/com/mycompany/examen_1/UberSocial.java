package com.mycompany.examen_1;
import java.util.ArrayList;
public class UberSocial {
    private static ArrayList<Twitter> twitter = new ArrayList<Twitter>();
    private static ArrayList<Facebook> facebook = new ArrayList<Facebook>();
    public String red = "";
    
    public SocialClass buscar(String username){
        return buscar(username, 0);
    }
    
    private SocialClass buscar(String username, int x){
        if(red.equals("TWITTER")){
            for(int ix = x; ix<twitter.size(); ix++){
                if(twitter.get(ix).username.equals(username)){
                    return twitter.get(ix);
                }
                return buscar(username, ix);
            }
        }
        else if (red.equals("FACEBOOK")){
            for(int ix = x; ix<facebook.size(); ix++){
                if(facebook.get(ix).username.equals(username)){
                    return facebook.get(ix);
                }
                return buscar(username, ix);
            }
        }
        return null;
    }
    
    public void agregarCuenta(String user, String tipo){
        SocialClass usuario = buscar(user);
        if(usuario == null){
            if(tipo.equals("TWITTER"))
                twitter.add(new Twitter(user));
            else if(tipo.equals("FACEBOOK"))
                facebook.add(new Facebook(user));
        }
    }
    
    public void agregarPost(String user, String Post){
        SocialClass usuario = buscar(user);
        if(usuario != null){
            usuario.addPosts(Post);
        }
    }
    
    public void agregarAmigo(String user1, String user2){
        SocialClass us1 = buscar(user1);
        SocialClass us2 = buscar(user2);
        if(us1 != null && us2 != null){
            if(us1.type.equals(us2.type)){
                us1.addFriend(us2.username);
                us2.addFriend(us1.username);
            }
        }
    }
    
    public void agregarComment(String user, int postID, String autor, String comment){
        red = "FACEBOOK";
        SocialClass usuario = buscar(user);
        
    }
    
    public void profileForm(String user){
        SocialClass usuario = buscar(user);
        if(usuario != null){
            usuario.myProfile();
        }
    }
}
/*
Crear una clase llamada UberSocial la cual tiene un atributo de tipo arraylist para manejar clases de redes sociales.
Tiene las siguientes funciones:

buscar(string username) Busca de manera recursiva y retorna el objeto de la cuenta que tenga dicho username.
Si no existe, se retorna null. (5%)

void agregarCuenta(string username, String tipo).
Se crea la cuenta para agregarla en el arraylist según el tipo “FACEBOOK” o “TWITTER”. 
El username DEBE SER UNICO. (10%)

void agregarPost(String user, String post). 
El user debe de existir, si existe, se agrega el post. (5%)

void agregarAmigo(string user1, String user2). 
Se quiere agregar el user2 como amigo del user1.
Ambas deben existir y ser del mismo tipo de cuenta, 
es decir Facebook user agrega Facebook user. 
Si la cuenta de ambos es de FACEBOOK, se agregan ambos como amigos. (10%)

void agregarComment(string user, int postID, string autor, string comment).
La red social con ese user debe existir y debe ser de FACEBOOK.
Se recibe los demás valores del comentario.
Nota: No es necesario validar que el autor exista también, (10%)

void profileFrom(String user). 
Imprime el contenido del profile del usuario que se recibe de parámetro.
Este debe existir. (5%)
Que pruebe las funciones de la b-f. (5%)
*/
