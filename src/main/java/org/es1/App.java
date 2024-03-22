package org.es1;

import org.w3c.dom.DOMStringList;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class App {
    public static long ris = 0; //punteggio

    public static long main(String[] args) throws IOException {
        ArrayList<Character> list_input = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new FileReader("/Users/barack/IdeaProjects/CodingJam_UNIMORE/src/main/input.txt"));
        String line = reader.readLine();

        while (line != null) {
            int j = 0;
            for(int i = 0; line.length() > i; i++){
                char c = line.charAt(i);
                if(j == 0 && (c == ')' || c == '}' || c == ']' || c == '>')){
                    SommaPunteggio(c);
                    break;
                }
                else if(c == ')'){
                    if(c == list_input.get(j)) {
                        list_input.remove(j);
                        j--;
                    }else {
                        SommaPunteggio(')');
                        break;
                    }
                }else if(c == '}'){
                    if(c == list_input.get(j)) {
                        list_input.remove(j);
                        j--;
                    }else {
                        SommaPunteggio('}');
                        break;
                    }
                }else if(c == '>') {
                    if(c == list_input.get(j)) {
                        list_input.remove(j);
                        j--;
                    }else {
                        SommaPunteggio('>');
                        break;
                    }
                }else if(c == ']') {
                    if(c == list_input.get(j)) {
                        list_input.remove(j);
                        j--;
                    }else {
                        SommaPunteggio(']');
                        break;
                    }
                }else {
                    list_input.add(c);
                    j++;
                    }
            }
            line = reader.readLine();
        }
        return ris;
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
