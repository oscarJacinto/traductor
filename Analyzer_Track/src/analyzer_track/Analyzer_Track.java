/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package analyzer_track;

import java.io.File;
import java.io.IOException;

/**
 *
 * @author ojacinto
 */
public class Analyzer_Track {
    /**
     * @param args
     * @throws IOException
     * @throws Exception 
     */
  public static void main(String[] args) throws IOException, Exception {
       String ruta= "C:/Users/ojacinto/Desktop/Compiladores/Analyzer_Track/src/Analizadores/Lexer.flex";
       generarLexer(ruta);
       generarCup();
    }
    public static void generarLexer(String ruta){
        File f = new File(ruta);
        JFlex.Main.generate(f);
    }
    
    public static void generarCup() throws IOException, Exception{
        String[] cup = {"-parser", "Prsito", "C:/Users/ojacinto/Desktop/Compiladores/Analyzer_Track/src/Analizadores/Java.cup"};
        java_cup.Main.main (cup);
    }
}
