grammar Jump;

ESC             : [ \t\n\r]+ -> skip;
STRING          : ~[ (),=]+;
EQ              : '=';
OPENPAREN       : '(';
CLOSEPAREN      : ')';
ALNUMTEXT       : [a-zA-Z0-9]+;


input           : field_config (',' field_config)*                                  #FieldConfigList
                ;

field_config    : STRING EQ STRING OPENPAREN param_list CLOSEPAREN                  #FieldConfig
                ;

param_list      : STRING (',' STRING)*                                              #ParamList
                ;
