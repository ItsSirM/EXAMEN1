package com.mycompany.examen_1;
import java.util.ArrayList;
public abstract class SocialClass {
    private ArrayList<String> friends;
    private ArrayList<String> posts;
    private String username;
    
    SocialClass(String name){
        friends = new ArrayList<String>();
        posts = new ArrayList<String>();
        username = name;
    }
    
    public boolean addFriend(String name){
        boolean added = true;
        for(String users : friends){
            if(users.equals(name) || users.equals(username))
                added = false;
        }
        if(added == true){
            friends.add(name);
        }
        return added;
    }
    
    public void addPosts(String msg){
        posts.add(msg);
    }
    
    public abstract void timeline();
    
    public void myProfile(){
        System.out.println(username);
        timeline();
        String friendLine = "";
        int counter = 0;
        for(String users : friends){
            if(counter<10){
                friendLine += users+" - ";
                counter++;
            }
            else if(counter == 10){
                friendLine += "\n"+users+" - ";
                counter = 0;
            }
        }
        System.out.println(friendLine);
    }
}
