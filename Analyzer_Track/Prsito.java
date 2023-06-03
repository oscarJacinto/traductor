
//----------------------------------------------------
// The following code was generated by CUP v0.11a beta 20060608
// Fri Jun 02 13:01:38 CST 2023
//----------------------------------------------------

package Analizadores;

import java_cup.runtime.Symbol;
import java.util.LinkedList;

/** CUP v0.11a beta 20060608 generated parser.
  * @version Fri Jun 02 13:01:38 CST 2023
  */
public class Prsito extends java_cup.runtime.lr_parser {

  /** Default constructor. */
  public Prsito() {super();}

  /** Constructor which sets the default scanner. */
  public Prsito(java_cup.runtime.Scanner s) {super(s);}

  /** Constructor which sets the default scanner. */
  public Prsito(java_cup.runtime.Scanner s, java_cup.runtime.SymbolFactory sf) {super(s,sf);}

  /** Production table. */
  protected static final short _production_table[][] = 
    unpackFromStrings(new String[] {
    "\000\010\000\002\002\004\000\002\003\005\000\002\003" +
    "\007\000\002\003\005\000\002\003\005\000\002\003\006" +
    "\000\002\003\006\000\002\003\006" });

  /** Access to production table. */
  public short[][] production_table() {return _production_table;}

  /** Parse-action table. */
  protected static final short[][] _action_table = 
    unpackFromStrings(new String[] {
    "\000\030\000\014\013\011\015\006\016\005\017\004\020" +
    "\010\001\002\000\004\023\030\001\002\000\004\021\024" +
    "\001\002\000\004\022\021\001\002\000\004\002\020\001" +
    "\002\000\004\026\016\001\002\000\004\004\012\001\002" +
    "\000\004\026\013\001\002\000\006\002\000\013\014\001" +
    "\002\000\004\004\015\001\002\000\004\002\uffff\001\002" +
    "\000\004\007\017\001\002\000\004\002\ufffd\001\002\000" +
    "\004\002\001\001\002\000\004\013\022\001\002\000\004" +
    "\004\023\001\002\000\004\002\ufffc\001\002\000\006\013" +
    "\026\030\025\001\002\000\004\002\ufffe\001\002\000\004" +
    "\004\027\001\002\000\004\002\ufffb\001\002\000\004\013" +
    "\031\001\002\000\004\004\032\001\002\000\004\002\ufffa" +
    "\001\002" });

  /** Access to parse-action table. */
  public short[][] action_table() {return _action_table;}

  /** <code>reduce_goto</code> table. */
  protected static final short[][] _reduce_table = 
    unpackFromStrings(new String[] {
    "\000\030\000\004\003\006\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001" });

  /** Access to <code>reduce_goto</code> table. */
  public short[][] reduce_table() {return _reduce_table;}

  /** Instance of action encapsulation class. */
  protected CUP$Prsito$actions action_obj;

  /** Action encapsulation object initializer. */
  protected void init_actions()
    {
      action_obj = new CUP$Prsito$actions(this);
    }

  /** Invoke a user supplied parse action. */
  public java_cup.runtime.Symbol do_action(
    int                        act_num,
    java_cup.runtime.lr_parser parser,
    java.util.Stack            stack,
    int                        top)
    throws java.lang.Exception
  {
    /* call code in generated class */
    return action_obj.CUP$Prsito$do_action(act_num, parser, stack, top);
  }

  /** Indicates start state. */
  public int start_state() {return 0;}
  /** Indicates start production. */
  public int start_production() {return 0;}

  /** <code>EOF</code> Symbol index. */
  public int EOF_sym() {return 0;}

  /** <code>error</code> Symbol index. */
  public int error_sym() {return 1;}



    public String resultado="";
    public static LinkedList<TError> TablaES = new LinkedList<TError>(); 

    //Metodo al que se llama automaticamente ante algun error sintactico
    public void syntax_error(Symbol s)
    {        
        String lexema = s.value.toString();
        int fila = s.right;
        int columna = s.left;
        
        System.out.println("!!!!!!! Error Sintactico Recuperado !!!!!!!");
        System.out.println("\t\tLexema: "+lexema);
        System.out.println("\t\tFila: "+fila);
        System.out.println("\t\tColumna: "+columna);

        TError datos = new TError(lexema,fila,columna,"Error Sintactico","Caracter no esperado");
        TablaES.add(datos);
       
        
    }

    //Metodo al que se llama en el momento en que ya no es posible una recuperacion de errores

    public void unrecovered_syntax_error(Symbol s) throws java.lang.Exception
    {        
        String lexema = s.value.toString();
        int fila = s.right;
        int columna = s.left;
        
        System.out.println("!!!!!!! Error Sintactico, Panic Mode !!!!!!! ");
        System.out.println("\t\tLexema: "+lexema);
        System.out.println("\t\tFila: "+fila);
        System.out.println("\t\tColumna: "+columna);

        TError datos = new TError(lexema,fila,columna,"Error Sintactico","Caracter no esperado");
        TablaES.add(datos);
     
    }

}

/** Cup generated class to encapsulate user supplied action code.*/
class CUP$Prsito$actions {




  private final Prsito parser;

  /** Constructor */
  CUP$Prsito$actions(Prsito parser) {
    this.parser = parser;
  }

  /** Method with the actual generated action code. */
  public final java_cup.runtime.Symbol CUP$Prsito$do_action(
    int                        CUP$Prsito$act_num,
    java_cup.runtime.lr_parser CUP$Prsito$parser,
    java.util.Stack            CUP$Prsito$stack,
    int                        CUP$Prsito$top)
    throws java.lang.Exception
    {
      /* Symbol object for return from actions */
      java_cup.runtime.Symbol CUP$Prsito$result;

      /* select the action based on the action number */
      switch (CUP$Prsito$act_num)
        {
          /*. . . . . . . . . . . . . . . . . . . .*/
          case 7: // SENTECES_AFIR ::= PRON_I VER_AM Ar_Definido Sustantivo 
            {
              String RESULT =null;
		int aleft = ((java_cup.runtime.Symbol)CUP$Prsito$stack.elementAt(CUP$Prsito$top-3)).left;
		int aright = ((java_cup.runtime.Symbol)CUP$Prsito$stack.elementAt(CUP$Prsito$top-3)).right;
		String a = (String)((java_cup.runtime.Symbol) CUP$Prsito$stack.elementAt(CUP$Prsito$top-3)).value;
		int bleft = ((java_cup.runtime.Symbol)CUP$Prsito$stack.elementAt(CUP$Prsito$top-2)).left;
		int bright = ((java_cup.runtime.Symbol)CUP$Prsito$stack.elementAt(CUP$Prsito$top-2)).right;
		String b = (String)((java_cup.runtime.Symbol) CUP$Prsito$stack.elementAt(CUP$Prsito$top-2)).value;
		int cleft = ((java_cup.runtime.Symbol)CUP$Prsito$stack.elementAt(CUP$Prsito$top-1)).left;
		int cright = ((java_cup.runtime.Symbol)CUP$Prsito$stack.elementAt(CUP$Prsito$top-1)).right;
		String c = (String)((java_cup.runtime.Symbol) CUP$Prsito$stack.elementAt(CUP$Prsito$top-1)).value;
		int dleft = ((java_cup.runtime.Symbol)CUP$Prsito$stack.peek()).left;
		int dright = ((java_cup.runtime.Symbol)CUP$Prsito$stack.peek()).right;
		String d = (String)((java_cup.runtime.Symbol) CUP$Prsito$stack.peek()).value;
		  /*codigo java para traducir*/  
              CUP$Prsito$result = parser.getSymbolFactory().newSymbol("SENTECES_AFIR",1, ((java_cup.runtime.Symbol)CUP$Prsito$stack.elementAt(CUP$Prsito$top-3)), ((java_cup.runtime.Symbol)CUP$Prsito$stack.peek()), RESULT);
            }
          return CUP$Prsito$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 6: // SENTECES_AFIR ::= PRON_PER_SING VER_SING Ar_Definido Sustantivo 
            {
              String RESULT =null;
		int aleft = ((java_cup.runtime.Symbol)CUP$Prsito$stack.elementAt(CUP$Prsito$top-3)).left;
		int aright = ((java_cup.runtime.Symbol)CUP$Prsito$stack.elementAt(CUP$Prsito$top-3)).right;
		String a = (String)((java_cup.runtime.Symbol) CUP$Prsito$stack.elementAt(CUP$Prsito$top-3)).value;
		int bleft = ((java_cup.runtime.Symbol)CUP$Prsito$stack.elementAt(CUP$Prsito$top-2)).left;
		int bright = ((java_cup.runtime.Symbol)CUP$Prsito$stack.elementAt(CUP$Prsito$top-2)).right;
		String b = (String)((java_cup.runtime.Symbol) CUP$Prsito$stack.elementAt(CUP$Prsito$top-2)).value;
		int cleft = ((java_cup.runtime.Symbol)CUP$Prsito$stack.elementAt(CUP$Prsito$top-1)).left;
		int cright = ((java_cup.runtime.Symbol)CUP$Prsito$stack.elementAt(CUP$Prsito$top-1)).right;
		String c = (String)((java_cup.runtime.Symbol) CUP$Prsito$stack.elementAt(CUP$Prsito$top-1)).value;
		int dleft = ((java_cup.runtime.Symbol)CUP$Prsito$stack.peek()).left;
		int dright = ((java_cup.runtime.Symbol)CUP$Prsito$stack.peek()).right;
		String d = (String)((java_cup.runtime.Symbol) CUP$Prsito$stack.peek()).value;
		  /*codigo java para traducir*/  
              CUP$Prsito$result = parser.getSymbolFactory().newSymbol("SENTECES_AFIR",1, ((java_cup.runtime.Symbol)CUP$Prsito$stack.elementAt(CUP$Prsito$top-3)), ((java_cup.runtime.Symbol)CUP$Prsito$stack.peek()), RESULT);
            }
          return CUP$Prsito$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 5: // SENTECES_AFIR ::= PRON_PER_PLUR VER_PLUR Ar_Definido Sustantivo 
            {
              String RESULT =null;
		int aleft = ((java_cup.runtime.Symbol)CUP$Prsito$stack.elementAt(CUP$Prsito$top-3)).left;
		int aright = ((java_cup.runtime.Symbol)CUP$Prsito$stack.elementAt(CUP$Prsito$top-3)).right;
		String a = (String)((java_cup.runtime.Symbol) CUP$Prsito$stack.elementAt(CUP$Prsito$top-3)).value;
		int bleft = ((java_cup.runtime.Symbol)CUP$Prsito$stack.elementAt(CUP$Prsito$top-2)).left;
		int bright = ((java_cup.runtime.Symbol)CUP$Prsito$stack.elementAt(CUP$Prsito$top-2)).right;
		String b = (String)((java_cup.runtime.Symbol) CUP$Prsito$stack.elementAt(CUP$Prsito$top-2)).value;
		int cleft = ((java_cup.runtime.Symbol)CUP$Prsito$stack.elementAt(CUP$Prsito$top-1)).left;
		int cright = ((java_cup.runtime.Symbol)CUP$Prsito$stack.elementAt(CUP$Prsito$top-1)).right;
		String c = (String)((java_cup.runtime.Symbol) CUP$Prsito$stack.elementAt(CUP$Prsito$top-1)).value;
		int dleft = ((java_cup.runtime.Symbol)CUP$Prsito$stack.peek()).left;
		int dright = ((java_cup.runtime.Symbol)CUP$Prsito$stack.peek()).right;
		String d = (String)((java_cup.runtime.Symbol) CUP$Prsito$stack.peek()).value;
		  /*codigo java para traducir*/  
              CUP$Prsito$result = parser.getSymbolFactory().newSymbol("SENTECES_AFIR",1, ((java_cup.runtime.Symbol)CUP$Prsito$stack.elementAt(CUP$Prsito$top-3)), ((java_cup.runtime.Symbol)CUP$Prsito$stack.peek()), RESULT);
            }
          return CUP$Prsito$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 4: // SENTECES_AFIR ::= PRO_PERSON VB_Regular Ad_Calificativo 
            {
              String RESULT =null;
		int aleft = ((java_cup.runtime.Symbol)CUP$Prsito$stack.elementAt(CUP$Prsito$top-2)).left;
		int aright = ((java_cup.runtime.Symbol)CUP$Prsito$stack.elementAt(CUP$Prsito$top-2)).right;
		String a = (String)((java_cup.runtime.Symbol) CUP$Prsito$stack.elementAt(CUP$Prsito$top-2)).value;
		int bleft = ((java_cup.runtime.Symbol)CUP$Prsito$stack.elementAt(CUP$Prsito$top-1)).left;
		int bright = ((java_cup.runtime.Symbol)CUP$Prsito$stack.elementAt(CUP$Prsito$top-1)).right;
		String b = (String)((java_cup.runtime.Symbol) CUP$Prsito$stack.elementAt(CUP$Prsito$top-1)).value;
		int cleft = ((java_cup.runtime.Symbol)CUP$Prsito$stack.peek()).left;
		int cright = ((java_cup.runtime.Symbol)CUP$Prsito$stack.peek()).right;
		String c = (String)((java_cup.runtime.Symbol) CUP$Prsito$stack.peek()).value;
		  /*codigo java para traducir*/  
              CUP$Prsito$result = parser.getSymbolFactory().newSymbol("SENTECES_AFIR",1, ((java_cup.runtime.Symbol)CUP$Prsito$stack.elementAt(CUP$Prsito$top-2)), ((java_cup.runtime.Symbol)CUP$Prsito$stack.peek()), RESULT);
            }
          return CUP$Prsito$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 3: // SENTECES_AFIR ::= PRON_PER_SING VER_SING ADB_Tiempo 
            {
              String RESULT =null;
		int aleft = ((java_cup.runtime.Symbol)CUP$Prsito$stack.elementAt(CUP$Prsito$top-2)).left;
		int aright = ((java_cup.runtime.Symbol)CUP$Prsito$stack.elementAt(CUP$Prsito$top-2)).right;
		String a = (String)((java_cup.runtime.Symbol) CUP$Prsito$stack.elementAt(CUP$Prsito$top-2)).value;
		int bleft = ((java_cup.runtime.Symbol)CUP$Prsito$stack.elementAt(CUP$Prsito$top-1)).left;
		int bright = ((java_cup.runtime.Symbol)CUP$Prsito$stack.elementAt(CUP$Prsito$top-1)).right;
		String b = (String)((java_cup.runtime.Symbol) CUP$Prsito$stack.elementAt(CUP$Prsito$top-1)).value;
		int cleft = ((java_cup.runtime.Symbol)CUP$Prsito$stack.peek()).left;
		int cright = ((java_cup.runtime.Symbol)CUP$Prsito$stack.peek()).right;
		String c = (String)((java_cup.runtime.Symbol) CUP$Prsito$stack.peek()).value;
		  /*codigo java para traducir*/ 
              CUP$Prsito$result = parser.getSymbolFactory().newSymbol("SENTECES_AFIR",1, ((java_cup.runtime.Symbol)CUP$Prsito$stack.elementAt(CUP$Prsito$top-2)), ((java_cup.runtime.Symbol)CUP$Prsito$stack.peek()), RESULT);
            }
          return CUP$Prsito$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 2: // SENTECES_AFIR ::= Ar_Definido Sustantivo VB_Regular Ar_Definido Sustantivo 
            {
              String RESULT =null;
		int aleft = ((java_cup.runtime.Symbol)CUP$Prsito$stack.elementAt(CUP$Prsito$top-4)).left;
		int aright = ((java_cup.runtime.Symbol)CUP$Prsito$stack.elementAt(CUP$Prsito$top-4)).right;
		String a = (String)((java_cup.runtime.Symbol) CUP$Prsito$stack.elementAt(CUP$Prsito$top-4)).value;
		int bleft = ((java_cup.runtime.Symbol)CUP$Prsito$stack.elementAt(CUP$Prsito$top-3)).left;
		int bright = ((java_cup.runtime.Symbol)CUP$Prsito$stack.elementAt(CUP$Prsito$top-3)).right;
		String b = (String)((java_cup.runtime.Symbol) CUP$Prsito$stack.elementAt(CUP$Prsito$top-3)).value;
		int cleft = ((java_cup.runtime.Symbol)CUP$Prsito$stack.elementAt(CUP$Prsito$top-2)).left;
		int cright = ((java_cup.runtime.Symbol)CUP$Prsito$stack.elementAt(CUP$Prsito$top-2)).right;
		String c = (String)((java_cup.runtime.Symbol) CUP$Prsito$stack.elementAt(CUP$Prsito$top-2)).value;
		int dleft = ((java_cup.runtime.Symbol)CUP$Prsito$stack.elementAt(CUP$Prsito$top-1)).left;
		int dright = ((java_cup.runtime.Symbol)CUP$Prsito$stack.elementAt(CUP$Prsito$top-1)).right;
		String d = (String)((java_cup.runtime.Symbol) CUP$Prsito$stack.elementAt(CUP$Prsito$top-1)).value;
		int eleft = ((java_cup.runtime.Symbol)CUP$Prsito$stack.peek()).left;
		int eright = ((java_cup.runtime.Symbol)CUP$Prsito$stack.peek()).right;
		String e = (String)((java_cup.runtime.Symbol) CUP$Prsito$stack.peek()).value;
		  /*codigo java para traducir*/ 
              CUP$Prsito$result = parser.getSymbolFactory().newSymbol("SENTECES_AFIR",1, ((java_cup.runtime.Symbol)CUP$Prsito$stack.elementAt(CUP$Prsito$top-4)), ((java_cup.runtime.Symbol)CUP$Prsito$stack.peek()), RESULT);
            }
          return CUP$Prsito$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 1: // SENTECES_AFIR ::= Ar_Definido Sustantivo VB_Regular 
            {
              String RESULT =null;
		int aleft = ((java_cup.runtime.Symbol)CUP$Prsito$stack.elementAt(CUP$Prsito$top-2)).left;
		int aright = ((java_cup.runtime.Symbol)CUP$Prsito$stack.elementAt(CUP$Prsito$top-2)).right;
		String a = (String)((java_cup.runtime.Symbol) CUP$Prsito$stack.elementAt(CUP$Prsito$top-2)).value;
		int bleft = ((java_cup.runtime.Symbol)CUP$Prsito$stack.elementAt(CUP$Prsito$top-1)).left;
		int bright = ((java_cup.runtime.Symbol)CUP$Prsito$stack.elementAt(CUP$Prsito$top-1)).right;
		String b = (String)((java_cup.runtime.Symbol) CUP$Prsito$stack.elementAt(CUP$Prsito$top-1)).value;
		int cleft = ((java_cup.runtime.Symbol)CUP$Prsito$stack.peek()).left;
		int cright = ((java_cup.runtime.Symbol)CUP$Prsito$stack.peek()).right;
		String c = (String)((java_cup.runtime.Symbol) CUP$Prsito$stack.peek()).value;
		 String espan = new Consola.Traducir(a, b, c); System.out.println(espan); 
              CUP$Prsito$result = parser.getSymbolFactory().newSymbol("SENTECES_AFIR",1, ((java_cup.runtime.Symbol)CUP$Prsito$stack.elementAt(CUP$Prsito$top-2)), ((java_cup.runtime.Symbol)CUP$Prsito$stack.peek()), RESULT);
            }
          return CUP$Prsito$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 0: // $START ::= SENTECES_AFIR EOF 
            {
              Object RESULT =null;
		int start_valleft = ((java_cup.runtime.Symbol)CUP$Prsito$stack.elementAt(CUP$Prsito$top-1)).left;
		int start_valright = ((java_cup.runtime.Symbol)CUP$Prsito$stack.elementAt(CUP$Prsito$top-1)).right;
		String start_val = (String)((java_cup.runtime.Symbol) CUP$Prsito$stack.elementAt(CUP$Prsito$top-1)).value;
		RESULT = start_val;
              CUP$Prsito$result = parser.getSymbolFactory().newSymbol("$START",0, ((java_cup.runtime.Symbol)CUP$Prsito$stack.elementAt(CUP$Prsito$top-1)), ((java_cup.runtime.Symbol)CUP$Prsito$stack.peek()), RESULT);
            }
          /* ACCEPT */
          CUP$Prsito$parser.done_parsing();
          return CUP$Prsito$result;

          /* . . . . . .*/
          default:
            throw new Exception(
               "Invalid action number found in internal parse table");

        }
    }
}
