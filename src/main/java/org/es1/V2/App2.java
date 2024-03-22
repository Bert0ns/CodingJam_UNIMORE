package org.es1.V2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class App2 {
    public static long ris = 0; //punteggio

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new FileReader("/Users/barack/IdeaProjects/CodingJam_UNIMORE/src/main/input.txt"));
        String line = reader.readLine();
        while (line != null) {
            int parentesiTondeAperte = 0;
            int parentesiTondeChiuse = 0;

            int parentesiGraffeAperte = 0;
            int parentesiGraffeChiuse = 0;

            int parentesiQuadreAperte = 0;
            int parentesiQuadreChiuse = 0;

            int parentesiAngoliAperte = 0;
            int parentesiAngoliChiuse = 0;

            for(int i = 0; line.length() > i; i++){
                boolean rigaCorrotta = false;
                char ch = line.charAt(i);
                switch (ch)
                {
                    case ')':
                        parentesiTondeChiuse++;
                        if(parentesiTondeAperte < parentesiTondeChiuse)
                        {
                            rigaCorrotta = true;
                        }
                        break;
                    case '}':
                        parentesiGraffeChiuse++;
                        if(parentesiGraffeAperte < parentesiGraffeChiuse)
                        {
                            rigaCorrotta = true;
                        }
                        break;
                    case ']':
                        parentesiQuadreChiuse++;
                        if(parentesiQuadreAperte < parentesiQuadreChiuse)
                        {
                            rigaCorrotta = true;
                        }
                        break;
                    case '>':
                        parentesiAngoliChiuse++;
                        if(parentesiAngoliAperte < parentesiAngoliChiuse)
                        {
                            rigaCorrotta = true;
                        }
                        break;
                    case '(':
                        parentesiTondeAperte++;
                        break;
                    case '{':
                        parentesiGraffeAperte++;
                        break;
                    case '[':
                        parentesiQuadreAperte++;
                        break;
                    case '<':
                        parentesiAngoliAperte++;
                        break;
                    default:
                        System.out.println("Errore, carattere sbagliato inserito nel file input.txt");
                        break;
                }

                if(rigaCorrotta)
                {
                    SommaPunteggio(ch);
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


