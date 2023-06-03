/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package analyzer_track;
import Complementos.Lexer;
import Complementos.Prsito;
import Complementos.TError;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.StringReader;

/**
 *
 * @author ojacinto
 */
public class Consola {
      
    String path = "";
    
    public Consola(String ruta){
        path = ruta;
    }
    public Consola(){
        path = "";
    }
    
    
    public String LecturaArchivo() throws IOException{     
        
        String resultado = "cat";        
        String fichero = this.path;        
        File f = new File(fichero); 

        //System.out.println("INICIO--NOMBRE DE PROCESO: "+f.getName());//get.Name() PARA OBTENER EL NOMBRE DEL ARCHIVO
     
        try{
            FileReader fr = new FileReader(f);
            BufferedReader br = new BufferedReader(fr); 
            
            Lexer lex = new Lexer(br);
            lex.next_token();
            //System.out.println("impresion"+lex.yytext()+"impresion");
                    
            //lex.next_token();
            
            Parsito pr= new Parsito(lex);
            
            try {
                pr.parse();
                String resultado1 = pr.resultado;
                System.out.println("Analisis");
                System.out.println(resultado1);
            } catch (Exception e) {
                System.out.println("Excepcion de analizadores: "+e);
            }
            
//            String linea = "";
//            while((linea = br.readLine())!=null){
//          
//            }
        }catch(Exception e){
            System.out.println("Excepcion leyendo fichero "+fichero+" : "+e);
        }
        
        //System.out.println("FIN--NOMBRE DE PROCESO: "+f.getName());
        
        
        return resultado;
    }
    
    public void Consoleprove() throws IOException{
        String datos = "cat"
                + "";
        StringReader sr= new StringReader(datos);
        BufferedReader br = new  BufferedReader(sr);
        
        Lexer lexico = new Lexer(br);
        lexico.next_token();
        System.out.println(br.readLine()+" "+ lexico.yylength());
       
     
    }
    
    public static void main(String[] args) throws IOException{
        
       String path = "C:\\Users\\ojacinto\\Desktop\\Compiladores\\Analyzer_Track\\src\\analyzer_track\\REGLAS GRAMATICALES.txt";
        Consola c= new Consola(path);
        c.LecturaArchivo();
        c.Consoleprove();
    }

    private static class Parsito {

        private String resultado;

        public Parsito(Lexer lex) {
        }

        private void parse() {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }
    }
    
}