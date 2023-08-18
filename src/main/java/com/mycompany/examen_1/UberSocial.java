/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.examen_1;

/**
 *
 * @author pcast
 */
public class UberSocial {
    
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
