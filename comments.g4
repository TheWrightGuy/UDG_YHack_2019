grammar comments;

program: param name author;
param  : '\t@param' ID ;           // match keyword hello followed by an identifier
ID : [a-z]+[a-z0-9 ]* ;          // match lower-case identifiers
WS : [ \r\n]+ -> skip ;        // skip spaces, tabs, newlines

name   : '\t@name' ID ;
author : '\t@author' NC NC;

NC : [a-zA-Z]+;
