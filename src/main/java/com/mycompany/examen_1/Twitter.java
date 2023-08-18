package com.mycompany.examen_1;
public class Twitter extends SocialClass {
    Twitter(String name){
        super(name);
        type = "TWITTER";
    }
    
    public void timeline(){
        for(String post : posts){
            System.out.println(post+"\n");
        }
    }
}
