package co.edu.eafit.dis.st0270.p2015cincoporfa.lexer;

import co.edu.eafit.dis.st0270.p2015cincoporfa.tokens.EnumToken;

%%
%class cincoporfaJFlexLexer
%unicode
%line
%column
%function getNextToken
%int
%public

%{
public int getLine() {
   return yyline + 1;
}

public int getColumn() {
   return yycolumn + 1;
}
%}

LineTerminator = \r|\n|\r\n
InputCharacter = [^\r\n]
WhiteSpace     = {LineTerminator} | [ \t\n\f]
Comment              = {TraditionalComment} | {EndOfLineComment} | {DocumentationComment}
TraditionalComment   = "/*" [^*] ~"*/" | "/*" "*"+ "/"
EndOfLineComment     = "//" {InputCharacter}* {LineTerminator}
DocumentationComment = "/**" {CommentContent} "*"+ "/"
CommentContent       = ( [^*] | \*+ [^/*] )*

Identifier = [:jletter:]([:jletterdigit:]| "_")*

Integer = [0-9]+ | 0 [1-7] [0-7]+ | 0["x"|"X"] [0-7|a-f|A-F]+

Real = [0-9]+ "." [0-9]+

Bool       = "True" | "False"

Keyword           = "fn" | "fun" | "if" | "then" | "else" | "let" | "in"

Operator = "<" | ">" | "==" | "!=" | "<=" | ">=" | "=" | "+" | "-" | "*" | "/" | "%" | "|" | "||" | "&" | "&&" | "^"

Separator = "(" | ")" | "=>"

%%


<YYINITIAL> {
   {Keyword}                     { return EnumToken.Keyword.ordinal(); }
   {Bool}                        { return EnumToken.Bool.ordinal(); }
   {Identifier}                  { return EnumToken.Identifier.ordinal(); }
   {Integer}                     { return EnumToken.Integer.ordinal(); }
   {Real}                        { return EnumToken.Real.ordinal(); }
   {Separator}                   { return EnumToken.Separator.ordinal(); }
   {Operator}                    { return EnumToken.Operator.ordinal(); }
   {WhiteSpace}                  { /* Ignore */ }
   {Comment}                     { /* Ignore */ }
}

[^]                             { return -69; }
