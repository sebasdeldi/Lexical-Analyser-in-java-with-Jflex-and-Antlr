/**
 * @author Sebastian Delgado
 * @author Cristian Franco
 */

lexer grammar cincoporfaAntlrLexer;

@lexer::header{
package co.edu.eafit.dis.st0270.p2015cincoporfa.lexer;
}

@lexer::rulecatch {
   catch (RecognitionException e) {
      throw e;
   }
}



KEYWORDS
: 'fn'
| 'fun'
| 'if'
| 'then'
| 'else'
| 'let'
| 'in'
;

BOOLEANO
: 'True'
| 'False'
;


ID  :   ('a'..'z'|'A'..'Z')('a'..'z'|'A'..'Z'|'0'..'9'|'_')*
    ;



				
INT
: '0'..'9'+
| '0' '1'..'7' '0'..'7'+
| ('0x'|'0X') ('0'..'7'|'a'..'f'|'A'..'F')+
;

OPERADOR
: '<'
| '>'
| '=='
| '!='
| '<='
| '>='
| '='
| '+'
| '-'
| '*'
| '/'
| '%'
| '|'
| '||'
| '&'
| '&&'
| '^'
;

SEPARADOR
: '('
| ')'
| '=>'
| '<eof>'
;

REAL
: '0'..'9'+ '.' '0'..'9'+
;

WS  :   ( ' '
        | '\t'
        | '\r'
        | '\n'
        | '\f'
        ) -> skip
    ;

ERROR 
:.
;
