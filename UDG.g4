/* 
	@desc Parser file to create universal documation. Currently only parses c-family code
	@author Team Cursed
	@date Today
	@ref ANTLR parser and lexer
*/

grammar UDG;
// Lexer Rules
COMCODE : '\t@';

PARAM   : 'param';
NAME    : 'name';
AUTHOR  : 'author';
RET     : 'returns';
DATE    : 'date';
FUNC    : 'function';
CLASS   : 'class';
NB      : 'note';
DESC    : 'desc';
REF     : 'ref';

ID      : [a-zA-Z_][a-z0-9A-Z_]* ;              
WS      : [ \r\n]+ -> skip ;                 
NL      : '\n';

LCOMM   : '/*' ;
RCOMM   : '*/' ;
JUNK    :  . ;
INJUNK  : [ -~];


// Parser Rules
program     : comment_list {             // Commonly the Entry Point
    System.out.println("End of Documental Analysis.");
}           ;

comment_list: comment_list comment junk_lines 
            | junk_lines 
            ;

comment     : LCOMM injunk_list comm_type RCOMM
            ;

comm_type   : comm_type COMCODE tags_list
            | comm_type NL
            | NL
            | COMCODE tags_list
            | junk_lines
            |
            ;
 


tags_list   : tags_list tag | tag;
tag         : tag_prefix id_list;

tag_prefix  : RET       {System.out.println("Return Tag Found");}
            | PARAM     {System.out.println("Parameter Tag Found");}
            | NAME      {System.out.println("Name Tag Found");}
            | AUTHOR    {System.out.println("Author Tag Found");}
            | DATE      {System.out.println("Date Tag Found");}
            | FUNC      {System.out.println("Function Tag Found");}
            | CLASS     {System.out.println("Class Tag Found");}
            | NB        {System.out.println("Nota Bene Tag Found");}
            | DESC      {System.out.println("Description Tag Found");}
            | REF       {System.out.println("Referece Tag Found");}
            ;

id_list     : id_list ID | ID ;

junk_lines  : junk_lines '\n' junk_list | junk_list;
junk_list   : junk_list junk_or_word | junk_or_word |;
junk_or_word: JUNK | ID;
injunk_lines: injunk_lines '\n' injunk_list | injunk_list;
injunk_list : injunk_list INJUNK 
            | injunk_list '\n' 
            | INJUNK
            |
            |;
