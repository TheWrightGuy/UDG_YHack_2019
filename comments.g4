grammar comments;
ID      : [a-z]A-Z+[a-z0-9A-Z ]* ;           // match lower-case identifiers
WS      : [ \r\n]+ -> skip ;                 // skip spaces, tabs, newlines
//NC      : [a-zA-Z]+;
PARAM   : '\t@param';
NAME    : '\t@name';
AUTHOR  : '\t@author';
RET     : '\t@beturns';

program: feature_list;
feature_list : feature || feature_list feature;
feature : (param||author||ret||name);

ret     : RET ID;
param   : PARAM ID;           // match keyword hello followed by an identifier
name    : NAME ID;
//author  : AUTHOR NC NC;
author  :   AUTHOR ID



