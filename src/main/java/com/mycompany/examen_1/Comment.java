/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.examen_1;

import java.util.Calendar;
import java.util.Date;

public final class Comment {
    protected int postId;
    protected String autor;
    protected String comentario;
    protected Calendar fecha;

    public Comment(int postId, String autor, String comentario) {
        this.postId = postId;
        this.autor = autor;
        this.comentario = comentario;
        fecha=Calendar.getInstance();
    }
    public int getPostId() {
        return postId;
    }
    public String getAutor() {
        return autor;
    }
    public String getComentario() {
        return comentario;
    }
    public Date getFecha() {
        return fecha.getTime();
    }
    public void imprimir(){
        System.out.println(""+autor+"-"+fecha+":"+comentario);
    }
    
}
