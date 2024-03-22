package org.es1;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class App {
    public static long ris = 0; //punteggio

    public static void main(String[] args) throws IOException {
        St
        BufferedReader reader = new BufferedReader(new FileReader("input.txt"));
        String line = reader.readLine();
        while (line != null) {
            for(int i = 0; line.length() > i; i++){
                if(line.charAt(i) == ')'){
                    SommaPunteggio(')');
                    break;
                }else if(line.charAt(i) == '}'){
                    SommaPunteggio('}');
                    break;
                }else if(line.charAt(i) == '>') {
                    SommaPunteggio('>');
                    break;
                }else if(line.charAt(i) == ']') {
                    SommaPunteggio(']');
                    break;
                }
                
            }
            line = reader.readLine();
        }

        System.out.println(ris);
    }

    /**
     * Adds to ris the points corresponding to the character
     * @param ch character that adds points
     */
    static void SommaPunteggio(final char ch)
    {
        switch (ch)
        {
                case ')':
                    ris += 7;
                    break;
                case '}':
                    ris += 1337;
                    break;
                case ']':
                    ris += 42;
                    break;
                case '>':
                    ris += 64880;
                    break;
                default:
                    System.out.println("Errore, carattere sbagliato inserito nel punteggio");
                    break;
            }
        }
    }
}
