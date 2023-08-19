package com.mycompany.examen_1;
import java.util.ArrayList;
import javax.swing.JOptionPane;
public class UberSocial {
    private static ArrayList<Twitter> twitter = new ArrayList<Twitter>();
    private static ArrayList<Facebook> facebook = new ArrayList<Facebook>();
    public String red = "";
    
    public SocialClass buscar(String username) {
        return buscar(username, 0);
    }
    
    private SocialClass buscar(String username, int x) {
//        if(red.equals("TWITTER")){ no es necesario del todo
        for (int ix = x; ix < twitter.size(); ix++) {
            if (twitter.get(ix).username.equals(username)) {
                return twitter.get(ix);
            }
//            return buscar(username, ix); ya tiene for
        }
        for (int ix = x; ix < facebook.size(); ix++) {
            if (facebook.get(ix).username.equals(username)) {
                return facebook.get(ix);
            }
        }
        return null;
    }

    public void agregarCuenta(String user, String tipo) {
        SocialClass usuario = buscar(user);
        if (usuario == null) {
            if (tipo.equals("TWITTER")) {
                if (!userExisteEnTWT(user)) {
                    twitter.add(new Twitter(user));
                } else {
                    System.out.println("EXISTE EN TWT");
                }
            } else if (tipo.equals("FACEBOOK")) {
                if (!userExisteEnFB(user)) {
                    facebook.add(new Facebook(user));
                } else {
                    System.out.println("EXISTE EN FB");
                }
            }
        } else {
            System.out.println("EXISTE EN UBER");
        }
    }

    private boolean userExisteEnTWT(String username) {
        for (Twitter twtUs : twitter) {
            if (twtUs.username.equals(username)) {
                return true;
            }
        }
        return false;
    }
    private boolean userExisteEnFB(String username) {
        for (Facebook fbUs : facebook) {
            if (fbUs.username.equals(username)) {
                return true;
            }
        }
        return false;
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
                JOptionPane.showMessageDialog(null, "Amigo agregado correctamente.", "AGREGAR", JOptionPane.INFORMATION_MESSAGE);
            }
        }
        JOptionPane.showMessageDialog(null, "Amigo NO ha sido agrgado.", "AGREGAR", JOptionPane.INFORMATION_MESSAGE);
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
