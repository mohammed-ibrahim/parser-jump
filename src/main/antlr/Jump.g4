grammar Jump;

ESC             : [ \t\n\r]+ -> skip;
STRING          : '"' (~[\\"] | '\\' [\\"])* '"';
WORD            : ~[ \t\r\n"*)(=,]+;
EQ              : '=';
OPENPAREN       : '(';
CLOSEPAREN      : ')';


input           : field_config (',' field_config)*                                  #FieldConfigList
                ;

field_config    : WORD EQ WORD OPENPAREN param_list CLOSEPAREN                      #FieldConfig
                ;

param_list      : item (',' item)*                                                  #ParamList
                ;

item            : (STRING | WORD)                                                   #ParamItem
                ;
