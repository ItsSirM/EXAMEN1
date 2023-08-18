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
    
    public void agregarComment(String user, int postID, String author, String comment) {
        SocialClass acc=buscar(user);
        if (acc instanceof Facebook) {
            Comment n = new Comment(postID, author, comment);
            if (((Facebook) acc).addComment(n)) {
                System.out.println("Comentario añadido");
            } else {
                System.out.println("Post no valido");
            }
        } else {
            System.out.println("No valido");
        }
    }
        
    
    public void profileForm(String user){
        SocialClass usuario = buscar(user);
        if(usuario != null){
            usuario.myProfile();
        }
    }
}
