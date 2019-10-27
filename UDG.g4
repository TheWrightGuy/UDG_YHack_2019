grammar UDG;
COMCODE : '\t@';
PARAM   : 'param';
NAME    : 'name';
AUTHOR  : 'author';
RET     : 'returns';
ID      : [a-zA-Z_][a-z0-9A-Z_]* ;               // match lower-case identifiers
WS      : [ \r\n]+ -> skip ;                 // skip spaces, tabs, newlines
NL      : '\n';

LCOMM   : '/*' ;
RCOMM   : '*/' ;
JUNK    :  . ;
INJUNK  : [ -~];
/*
program: comment;
//comment_list: comment_list comment | ;
comment : comment LCOMM tags_list RCOMM
        | comment '\n'junk_list
        | junk_list
        ;
tags_list : tags_list tag |;
tag : (param|author|ret|name);
id_list : id_list ID | ID;

ret     : RET id_list;
param   : PARAM id_list;           // match keyword hello followed by an identifier
name    : NAME id_list;
author  : AUTHOR id_list;

junk_list: junk_list JUNK | JUNK;
*/

program: comment_list;
comment_list: comment_list comment junk_lines 
            | junk_lines 
            ;
comment : LCOMM injunk_list comm_type RCOMM
        ;
comm_type   : comm_type COMCODE tags_list
            | comm_type NL
            | NL
            | COMCODE tags_list
            | junk_lines
            |
            ;
 


tags_list   :   tags_list tag | tag;
tag     : tag_prefix id_list;
id_list : id_list ID | ID ;
tag_prefix : RET
           | PARAM
           | NAME
           | AUTHOR
           ;

junk_lines  : junk_lines '\n' junk_list | junk_list;
junk_list   : junk_list junk_or_word | junk_or_word |;
junk_or_word: JUNK | ID;
injunk_list : injunk_list INJUNK 
            | injunk_list '\n' 
            | INJUNK
            |
            |;
injunk_lines: injunk_lines '\n' injunk_list | injunk_list;