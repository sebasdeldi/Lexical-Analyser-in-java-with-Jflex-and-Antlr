/**
 * @author Sebastián Delgado Díaz
 * @author Cristian Franco
 */

package co;

import co.edu.eafit.dis.st0270.p2015cincoporfa.tokens.EnumToken;
import co.edu.eafit.dis.st0270.p2015cincoporfa.lexer.cincoporfaAntlrLexer;
import co.edu.eafit.dis.st0270.p2015cincoporfa.lexer.cincoporfaJFlexLexer;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import org.antlr.v4.runtime.*;
import java.io.File;
import java.io.FileInputStream;
import java.io.Reader;
import java.io.FileReader;

/**
*** CLASE MAIN, PRINCIPAL DE LA EJECUCIÓN
**/
public class MaincincoporfaLexer {
    
    static ANTLRFileStream antlrS = null;
    static Reader jflexS = null;
    
    public static void main (String [ ] args) {

	String entradaAntlr = "A";
	String entradaJflex = "F";
	String entradaAmbos = "B";
	String entrada = "-";
	
	/** SE INICIA ANTLR al encontrar una "A" **/
	if(args[0].equals(entradaAntlr)){
	    
	    if(args.length >= 1){
		for(int i = 1; i<args.length; i++ ) {
		    
		    try{
			
			/** SE INICIA ENTRADA ESTANDAR al encontrar un "-" **/
			if(args[i].equals(entrada)){
			    entradaStandard('a');
			}
			
			/** SE INICIA LECTURA DE FICHEROS al NO encontrar "-" **/
			else{
			    System.out.println("fichero: " + args[i]);
			    antlrS = new ANTLRFileStream(args[i]);
			    validoAntlr('v');
			    System.out.println("");
			}
			
		    }catch (Exception e){
			System.out.println ("Error" + e);
		    }
		}
	    }
	    else{
		System.out.println("No has introducido nada");
	    }
	}
	
	
	/** SE INICIA JFLEX al encontrar una "F" **/
	if(args[0].equals(entradaJflex)){
	    
	    if(args.length >= 1){
		for (int i = 1; i<args.length; i++ ) {
		    
		    try{
			
			/** SE INICIA ENTRADA ESTANDAR al encontrar un "-" **/
			if(args[i].equals(entrada)){
			    entradaStandard('j');
			}	
			
			/** SE INICIA LECTURA DE FICHEROS al NO encontrar "-" **/
			else{
				System.out.println("fichero: " + args[i]);
			    jflexS = new FileReader(args[i]);
			    validoJflex('v');
			    System.out.println("");
			}
		    }catch (Exception e){
			System.out.println ("Error" + e);
		    }
		}
	    }
	    
	    /** SE ENVÍA UN MENSAJE SI NO SE HA RECIBIDO ENTRADA ESTANDAR O FICHERO **/   
	    else{
		System.out.println("No has introducido nada");
	    }
	}
	
	
	
	/** INICIA JFLEX Y ANTLR al encontrar "B" **/
	if(args[0].equals(entradaAmbos)){
	    
	    if(args.length >= 1){
		for (int i = 1; i<args.length; i++ ) {
		    
		    try{
			
			/** SE INICIA ENTRADA ESTANDAR al encontrar un "-" **/
			if(args[i].equals(entrada)){
			    
			    /** PASA EL DATO "activador" A ENTRADA Standard **/ 
			    entradaStandard('b');
			}
			
			/** SE INICIA LECTURA DE FICHEROS al NO encontrar "-" **/
			else{
				System.out.println("fichero: " + args[i]);
			    antlrS = new ANTLRFileStream(args[i]);
			    jflexS = new FileReader (args[i]);
			    validoAntlr('v');
			    System.out.println("");
			    System.out.println("fichero: " + args[i]);
			    validoJflex('v');
			    System.out.println("");
			}
			
		    }catch (Exception e){
			System.out.println ("Error" + e);
		    }
		}
	    }	
	    
	    /** SE ENVÍA UN MENSAJE SI NO SE HA RECIBIDO ENTRADA ESTANDAR O FICHERO **/
	    else{
		System.out.println("No has introducido nada");
	    }
	}
    }
    
    
    
    /**
    *** ESTE MÉTODO TOMA COMO PARAMETRO UN CARACTER QUE PUEDE SER 'a' PARA LA EJECUCIÓN
    *** DE ANTLR O 'j' PARA LA EJECUCIÓN DE JFLEX.
    ***
    *** LA LECTURA STANDAR FUNCIONA CREANDO UN ARCHIVO TEMPORAL ("estandard.fun") Y EN
    *** EL ESCRIBIMOS LO LEIDO DE LA ENTRADA Standard, (variable input).
    **/
    public static void entradaStandard (char cualejecuta){
	
    	try{
	    
	    /** EL QUE LEE **/
	    BufferedReader buff = new BufferedReader(new InputStreamReader(System.in));
	    
	    /** ESTE VA A SER EL ARCHIVO QUE VA A CREAR SIEMPRE Y NO SE GUARDA
	    *** PORQUE SE BORRA CUANDO SE CIERRE **/
	    File file = new File("estandard.fun");
	    file.deleteOnExit();
	    
	    /** EL QUE ESCRIBE **/
	    PrintWriter writer = new PrintWriter(file, "UTF-8");
	    
	    /** EL INPUT **/
	    String input;


	    /** EL INPUT VA A SER LO LEIDO POR EL BUFFER Y MIENTRAS NO SEA NULO EL WRITTER ESCRIBE EL STRING INPUT **/
	    while((input=buff.readLine())!=null){
		
		/** QUE EL WRITTER ESCRIBA EL STRING INPUT **/
		writer.append(input);
		
		/** ESTO CORRIGE EL ERROR DE QUE TODO LO QUE 
		*** ESCRIBÍA EN UNA SOLA LÍNEA **/
		writer.append(System.getProperty("line.separator"));
	    } 
	    writer.close(); 
	    
	    
	    /** EJECUTA ANTLR **/
	    if (cualejecuta == 'a'){
		
		/** AHORA SE LE PASA EL ARCHIVO QUE SE CREA CON EL INPUT A EL fileStream **/
		antlrS = new ANTLRFileStream("estandard.fun");
		
		/** SE PASA EL "activador a la función validoAntlr" **/
		validoAntlr('v');
	    }
	    
	    /** EJECUTA JFLEX **/
	    else if (cualejecuta == 'j'){

	    /** AHORA SE LE PASA EL ARCHIVO QUE SE CREA CON EL INPUT A EL fileReader **/
		jflexS = new FileReader ("estandard.fun");
		
		/** SE PASA EL "activador a la función validoJflex" **/
		validoJflex('v');
	    }
	    
	    /** EJECUTA ANTLR Y JFLEX **/
	    else if (cualejecuta == 'b'){
		antlrS = new ANTLRFileStream("estandard.fun");
		
		/** SE PASA EL "activador a la función validoAntlr" **/
		validoAntlr('v');
		
		System.out.println(" ");
		jflexS = new FileReader ("estandard.fun");
		
		/** SE PASA EL "activador a la función validoJflex" **/
		validoJflex('v');
		System.out.println(" ");
	    }
	}catch(Exception e){
	    System.out.println("Error en el proceso de la entrada dada"+e);
	}
    }
    
    
    
    /**
    *** ESTE MÉTODO TOMA UN CARACTER QUE EN CASO DE SER 'v', PASA A EJECUTAR ANTLR
    **/
    public static void validoAntlr (char v){

    	try{
	    
	    if (v == 'v'){	    		
		cincoporfaAntlrLexer antlrLexer = new cincoporfaAntlrLexer (antlrS);
		Token siguiente;
		Token fin = antlrLexer.emitEOF();
		boolean avance = true;
		
		while(avance){
		    siguiente = antlrLexer.nextToken();
		    
		    // en el archivo de la gramatica de antlr .g4, el error está en el 8, pero como al imprimir se le resta 1, realmente comparo con la posicion 9
		    
		    /** SI HAY UN ERROR HACE ESTO **/
		    if(siguiente.getType() == 8+1){
			imprime(1000, siguiente.getText(), siguiente.getLine(), siguiente.getCharPositionInLine(),true);
			break;
		    }
		    
		    /** SI ENCUENTRA EOF **/
		    if(siguiente.getType() == fin.getType()){
			imprime(4, "<eof>", siguiente.getLine(), siguiente.getCharPositionInLine(), false);
			avance = false;
			/* Aquí tratamos de implentar que cambiara lo no imprimible por su valos ascii
			   siguiente.toCharArray();
			   
	                   
			   
			   for (int x = 0; x < 31; x++){
			   
			   int[] nums1 = new int [32];
			   nums1[x] == x;
			   }
			   
			   for (int y = 127; x < 255; x++){
			   
			   int[] nums2 = new int [129];
			   nums2[y] == y;
			   }
			   
	                   
			   
			   int ascii;
			   int probador;
			   
			   for (int i = 0 ; i < nums1.length; i++){
			   
	                   
			   
			   for (int j = 0 ; j < siguiente.length; j++){
			   cosaRara = siguiente[j];
			   ascii = (int) cosaRara;
	                   
			   
			   if (ascii == (cosaRara==nums1[i])){	
			   
			   probador = 0;
			   
			   }
			   }
			   
			   
			   for (int i = 0 ; i < nums2.length; i++){
			   
	                   
			   
			   for (int j = 0 ; j < siguiente.length; j++){
			   cosaRara = siguiente[j];
			   ascii = (int) cosaRara;
	                   
			   
			   if (ascii == (cosaRara==nums2[i])){	
			   
			   probador = 1;
			   
			   }
			   }
			   
			   if (probador== (0|1)){
			   
			   imprime(arreglaOrdenGramAntlr((siguiente.getType()-1)), Integer.toString(cosaRara), siguiente.getLine(), siguiente.getCharPositionInLine()+1, false);
			   }
			   
			   }
			*/
		    }
		    
		    /** SI NO, TODO ESTÁ BIEN E IMPRIME **/
		    else{
			imprime(arreglaOrdenGramAntlr((siguiente.getType()-1)), siguiente.getText(), siguiente.getLine(), siguiente.getCharPositionInLine(), false);
		    }
		}
	    }
	}catch (Exception e) {
	    System.out.println("Error"+e);
	} 
    }
    
    
    
    /**
    *** ESTE MÉTODO TOMA UN CARACTER QUE EN CASO DE SER 'v', PASA A EJCUTAR JFLEX
    **/
    public static void validoJflex (char v){

    	try{	
	    if (v == 'v'){
		cincoporfaJFlexLexer jflexLexer = new cincoporfaJFlexLexer(jflexS);
		int siguiente;
		int fin = jflexLexer.YYEOF;
		boolean avance = true;
		
            	while(avance){
		    siguiente = jflexLexer.getNextToken();
		    
		    /** -69 ES EL VALOR QUE HACE QUE RETORNARA EN EL ARCHIVO DE LA GRAMÁTICA .jflex **/
		    if(siguiente == -69){
			
			/** SI HAY ERROR IMPRIME **/
			imprime(1000,jflexLexer.yytext(),jflexLexer.getLine(),jflexLexer.getColumn()-1,true);
			return;        
		    }
		    
		    /**  SI ENCUENTRA eof IMPRIME **/
		    if(siguiente == fin){
			imprime(4, "<eof>", jflexLexer.getLine(), jflexLexer.getColumn()-1, false);
			avance = false;
		    }
		    
		    /** SI TODO ESTA BIEN, EJECUTA ESTO **/
		    else{
			imprime(siguiente, jflexLexer.yytext(),jflexLexer.getLine(),jflexLexer.getColumn()-1,false);
		    }
		}
	    }	
	}catch (Exception e) {
	    System.out.println("Error"+e);
	}    	
    }
    
    
    /**
    *** CON ESTE MÉTODO VERIFICAMOS SI SE HA PASADO EL PARAMETRO DE ERROR COMO VERDADERO O,
    *** NO Y SE PROCEDE A IMPRIMIR YA SEA LO CORRESPONDIENTE PARA ERROR, O PARA CORRECTO
    **/
    public static void imprime (int tipoToken, String valor, int fila, int columna, boolean error){
	
	/** tipo: LEXEMA valor: CADENA fila: INT col: INT EOL **/    	
    	if (error){
	    System.out.println("error: " + "\"" + valor + "\"" + " fila: " + fila + " col: " + columna);
    	}
    	else if(valor == "<eof>"){
    		System.out.println ("tipo: "+ tipoToken +" " + "valor: "+ valor +" " + "fila: "+ fila +" "+ "col: "+ columna);
    	}
	else{
	    System.out.println ("tipo: "+ tipoToken +" " + "valor: "+ "\"" + valor + "\"" +" " + "fila: "+ fila +" "+ "col: "+ columna);
	}
    }
    
    
    
    /**
    *** CON ESTE MÉTODO, ARREGLAMOS EL PROBLE DE ORDEN DE PRESEDENCIA DE ANTLR
    **/
    public static int arreglaOrdenGramAntlr(int tipoToken){
        switch(tipoToken){
	    
	case 0:
	    return 1;
	    
	case 1:    
	    return 5;
	    
	case 2:
		return 0; ///
	    
	case 3:
	    return 2;
	    
	case 4:
	    return 3;
	    
	case 5:
	    return 4;
	    
        }
        return 6;
    }
    
    
    
    
}
