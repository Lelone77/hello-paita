import java.io.*;

public class HelloEmanuele {
public static void main(String[] args) {
System.out.println("Hello Emanuele!"); //stampa Hello nome

Vector <Character> lettere = new Vector<>();
lettere.add('e');
lettere.add('m');
lettere.add('a');
lettere.add('n');
lettere.add('u');
lettere.add('e');
lettere.add('l');
lettere.add('e');

for(Character lettera : lettere) {
System.out.println(lettera);

}