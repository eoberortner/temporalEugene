grammar MiniEugene;

@lexer::header {
/*
Copyright (c) 2012 Boston University.
All rights reserved.
Permission is hereby granted, without written agreement and without
license or royalty fees, to use, copy, modify, and distribute this
software and its documentation for any purpose, provided that the above
copyright notice and the following two paragraphs appear in all copies
of this software.

IN NO EVENT SHALL BOSTON UNIVERSITY BE LIABLE TO ANY PARTY
FOR DIRECT, INDIRECT, SPECIAL, INCIDENTAL, OR CONSEQUENTIAL DAMAGES
ARISING OUT OF THE USE OF THIS SOFTWARE AND ITS DOCUMENTATION, EVEN IF
BOSTON UNIVERSITY HAS BEEN ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.

BOSTON UNIVERSITY SPECIFICALLY DISCLAIMS ANY WARRANTIES,
INCLUDING, BUT NOT LIMITED TO, THE IMPLIED WARRANTIES OF
MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE. THE SOFTWARE
PROVIDED HEREUNDER IS ON AN "AS IS" BASIS, AND BOSTON UNIVERSITY HAS
NO OBLIGATION TO PROVIDE MAINTENANCE, SUPPORT, UPDATES,
ENHANCEMENTS, OR MODIFICATIONS.
*/

package org.cidarlab.minieugene.parser;
}

@header {
/*
Copyright (c) 2012 Boston University.
All rights reserved.
Permission is hereby granted, without written agreement and without
license or royalty fees, to use, copy, modify, and distribute this
software and its documentation for any purpose, provided that the above
copyright notice and the following two paragraphs appear in all copies
of this software.

IN NO EVENT SHALL BOSTON UNIVERSITY BE LIABLE TO ANY PARTY
FOR DIRECT, INDIRECT, SPECIAL, INCIDENTAL, OR CONSEQUENTIAL DAMAGES
ARISING OUT OF THE USE OF THIS SOFTWARE AND ITS DOCUMENTATION, EVEN IF
BOSTON UNIVERSITY HAS BEEN ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.

BOSTON UNIVERSITY SPECIFICALLY DISCLAIMS ANY WARRANTIES,
INCLUDING, BUT NOT LIMITED TO, THE IMPLIED WARRANTIES OF
MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE. THE SOFTWARE
PROVIDED HEREUNDER IS ON AN "AS IS" BASIS, AND BOSTON UNIVERSITY HAS
NO OBLIGATION TO PROVIDE MAINTENANCE, SUPPORT, UPDATES,
ENHANCEMENTS, OR MODIFICATIONS.
*/

package org.cidarlab.minieugene.parser;

import org.cidarlab.minieugene.interpreter.*;
import org.cidarlab.minieugene.symbol.*;
}

@parser::members {
private MiniEugeneInterpreter interp;
public void init(SymbolTables symbols) {
    this.interp = new MiniEugeneInterpreter(symbols);
}
}

 	
miniEugene 
	:	(size)? (constraint '.' |composite_constraint)+
	;

size 	:	 'N' '=' INT '.'
	;

composite_constraint
	:	ID ( '(' list_of_parameters ')' )? ':=' composite_constraint_block '.'
	;

composite_constraint_block
	:	constraint (',' composite_constraint_block)?
	;	
	
constraint
	:	('NOT')? (operand)? operator (operand)? 
	;

operator:
	|	'CONTAINS'
	|	'NOTCONTAINS'
	|	'EXACTLY'
	|	'NOTEXACTLY'
	|	'MORETHAN'
	|	'NOTMORETHAN'
	|	'WITH'
	|	'NOTWITH'
	|	'THEN'
	|	'NOTTHEN'		
	|	'STARTSWITH'
	|	'ENDSWITH'
	|	'BEFORE'
	|	'ALL_BEFORE'
	|	'SOME_BEFORE'
	|	'AFTER'
	|	'ALL_AFTER'
	|	'SOME_AFTER'
	|	'NEXTTO'
	|	'ALL_NEXTTO'
	|	'SOME_NEXTTO'
	|	'EQUALS'
	|	'NOTEQUALS'
	|	'MATCHES'
	|	'NOTMATCHES'
	|	'FORWARD'
	|	'ALL_FORWARD'
	|	'SOME_FORWARD'
	|	'REVERSE'
	|	'ALL_REVERSE'
	|	'SOME_REVERSE'
	|	'SAME_ORIENTATION'
	|	'REPRESSES'
	|	'INDUCES'
	|	'DRIVES'
	;	
		
operand	:	ID 
	|	INT
	|	'[' INT ']'
	;

list_of_parameters
	:	operand (',' list_of_parameters)?
	;	

	
					
ID  :	('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'0'..'9'|'_'|'-')*
    ;

INT :	'0'..'9'+
    ;

				
COMMENT
    :   '//' ~('\n'|'\r')* '\r'? '\n' {$channel=HIDDEN;}
    |   '/*' ( options {greedy=false;} : . )* '*/' {$channel=HIDDEN;}
    ;

WS  :   ( ' '
        | '\t'
        | '\r'
        | '\n'
        ) {$channel=HIDDEN;}
    ;

STRING
    :  '"' ( ESC_SEQ | ~('\\'|'"') )* '"'
    ;

CHAR:  '\'' ( ESC_SEQ | ~('\''|'\\') ) '\''
    ;

fragment
EXPONENT : ('e'|'E') ('+'|'-')? ('0'..'9')+ ;

fragment
HEX_DIGIT : ('0'..'9'|'a'..'f'|'A'..'F') ;

fragment
ESC_SEQ
    :   '\\' ('b'|'t'|'n'|'f'|'r'|'\"'|'\''|'\\')
    |   UNICODE_ESC
    |   OCTAL_ESC
    ;

fragment
OCTAL_ESC
    :   '\\' ('0'..'3') ('0'..'7') ('0'..'7')
    |   '\\' ('0'..'7') ('0'..'7')
    |   '\\' ('0'..'7')
    ;

fragment
UNICODE_ESC
    :   '\\' 'u' HEX_DIGIT HEX_DIGIT HEX_DIGIT HEX_DIGIT
    ;
