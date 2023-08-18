package com.mycompany.examen_1;
import java.util.ArrayList;
import com.mycompany.examen_1.Comment;

public class Facebook extends SocialClass implements Commentable{
    private ArrayList<Comment> data;
    
    public Facebook(String name) {
        super(name);
        type = "FACEBOOK";
        data = new ArrayList<>();
    }

    @Override
    public void timeline() {
        int postN=1;
        for (String post : posts) {
            System.out.println("POST "+postN+"\n"+post);
            for (Comment comment : data) {
                if (comment.getPostId()==postN-1) {
                    comment.imprimir();
                }
            }
            postN++;
        }
    }

    @Override
    public boolean addComment(Comment comentario) {
        if (comentario.getPostId()<data.size()) {
            data.add(comentario);
            return true;
        }
        return false;
    }
}
    
    