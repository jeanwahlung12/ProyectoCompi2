package Compilador;

import java_cup.runtime.*;

%%
%unicode
%class compi
%line
%column
%int
%standalone
%cupsym simbolo
%cup
%state ComentarioLargo
%state ComentarioCorto
%state Cadena

while = "while" 
for = "for"
if =  "if"
else = "else"

letra = [a-zA-Z_]
numero = [0-9]
numeros = {numero}+
salto = [\n]
espacio = [ \n\r\t]+

comentarioI = "/*"
comentarioF = "*/"
comentarioLinea = "//"
puntoycoma = ";"
dospuntos = ":"
abrirParentesis = "("
cerrarParentesis =")"
abrirLlaves = "{"
cerrarLlaves = "}"
coma = ","
comillaSimple = "\'"
comillaDoble = "\""
conststr = "\\""\""

int = "int"
char = "char"
asterisco = "*"

id  = {letra}+({numero}|{letra})*
cualquiercosa = [\s]|[\S]
caracter = {comillaSimple}{cualquiercosa}{comillaSimple}

mayor = ">"
menor = "<"
igual = "="
igualigual = "=="
diferente = "!"
mas = "+"
masmas = "++"
menos = "-"
menosmenos = "--"
division = "/"

porcentaje = "%"
porcentajedoble = "%%"
porcentajed = "%d"
porcentajec = "%c"

printf = "printf"
scanf = "scanf"
void = "void"
return = "return"

amp = "&"
and = "&&"
or = "||"
pregunta = "?"

%{
    String cadena = "";
%}

%% 
<YYINITIAL> {
  {comentarioI}	      {yybegin(ComentarioLargo);}
  {comentarioF}       {System.out.println("ERROR! {" + yytext() + "} \nLinea: " + yyline + " / Columna: " + yycolumn);}
  {comentarioLinea}   {yybegin(ComentarioCorto);}
  {comillaDoble}      {cadena = "";yybegin(Cadena); return new Symbol(simbolo.COMILLADOBLE, yycolumn, yyline, yytext());}
  {numeros}           {return new Symbol(simbolo.NUMEROS, yycolumn, yyline, yytext());}
  
  {if}                { return new Symbol(simbolo.IF, yycolumn, yyline, yytext());}
  {while}             {return new Symbol(simbolo.WHILE, yycolumn, yyline, yytext());}
  {for}               {return new Symbol(simbolo.FOR, yycolumn, yyline, yytext());}
  {else}              {return new Symbol(simbolo.ELSE, yycolumn, yyline, yytext());}

  {int}               {return new Symbol(simbolo.INTEGER, yycolumn, yyline, yytext());}
  {char}              {return new Symbol(simbolo.CHAR, yycolumn, yyline, yytext());}
  
  {asterisco}         {return new Symbol(simbolo.ASTERISCO, yycolumn, yyline, yytext());}
  {puntoycoma}        {return new Symbol(simbolo.PUNTOYCOMA, yycolumn, yyline, yytext());}
  {dospuntos}         {return new Symbol(simbolo.DOSPUNTOS, yycolumn, yyline, yytext());}
  {coma}              {return new Symbol(simbolo.COMA, yycolumn, yyline, yytext());}
  {abrirParentesis}   {return new Symbol(simbolo.PARIZQ, yycolumn, yyline, yytext());}
  {cerrarParentesis}  {return new Symbol(simbolo.PARDER, yycolumn, yyline, yytext());}
  {abrirLlaves}       {return new Symbol(simbolo.LLAVEIZQ, yycolumn, yyline, yytext());}
  {cerrarLlaves}      {return new Symbol(simbolo.LLAVEDER, yycolumn, yyline, yytext());}
  {mayor}             {return new Symbol(simbolo.MAYOR, yycolumn, yyline, yytext());}
  {menor}             {return new Symbol(simbolo.MENOR, yycolumn, yyline, yytext());}
  {igual}             {return new Symbol(simbolo.IGUAL, yycolumn, yyline, yytext());}
  {igualigual}        {return new Symbol(simbolo.IGUALIGUAL, yycolumn, yyline, yytext());}
  {masmas}            {return new Symbol(simbolo.MASMAS, yycolumn, yyline, yytext());}
  {menosmenos}        {return new Symbol(simbolo.MENOSMENOS, yycolumn, yyline, yytext());}
  {mas}               {return new Symbol(simbolo.MAS, yycolumn, yyline, yytext());}
  {menos}             {return new Symbol(simbolo.MENOS, yycolumn, yyline, yytext());}
  {division}          {return new Symbol(simbolo.DIVISION, yycolumn, yyline, yytext());}
  {diferente}         {return new Symbol(simbolo.DIFERENTE, yycolumn, yyline, yytext());}
  {amp}               {return new Symbol(simbolo.AMP, yycolumn, yyline, yytext());}
  {pregunta}          { return new Symbol(simbolo.PREGUNTA, yycolumn, yyline, yytext());}

  {printf}            {return new Symbol(simbolo.PRINTF, yycolumn, yyline, yytext());}
  {scanf}             {return new Symbol(simbolo.SCANF, yycolumn, yyline, yytext());}
  {void}              {return new Symbol(simbolo.VOID, yycolumn, yyline, yytext());}
  {and}               {return new Symbol(simbolo.AND, yycolumn, yyline, yytext());}
  {or}                {return new Symbol(simbolo.OR, yycolumn, yyline, yytext());}
  {return}            {return new Symbol(simbolo.RETURN, yycolumn, yyline, yytext());}

  {id}                {return new Symbol(simbolo.ID, yycolumn, yyline, yytext());}
  {caracter}          {return new Symbol(simbolo.CARACTER, yycolumn, yyline, yytext());}
  
  {espacio}   	      {}
  .            	      {} 
}

<ComentarioLargo> {
  {comentarioF}   {yybegin(1);}
  {espacio}       {}
   .              {}
}

<ComentarioCorto> {
  {salto}	  {yybegin(1);}
  .               {}
}

<Cadena> {
  {conststr}            {cadena += yytext();}
  {porcentajedoble}   	{cadena += yytext().charAt(0);}
  {porcentajed}   	{cadena += yytext();}
  {porcentajec}   	{cadena += yytext();}
  {porcentaje}   	{}  
  {comillaDoble}	{yybegin(1); return new Symbol(simbolo.CADENA, yycolumn, yyline, cadena);}
  .               	{cadena += yytext();}
}