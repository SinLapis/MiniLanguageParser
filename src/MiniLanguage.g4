grammar MiniLanguage;
//Detail
stmt_sequence
    :   stmt_sequence statement
    |   statement
    ;
statement
    :   if_stmt
    |   repeat_stmt
    |   assign_stmt
    |   read_stmt
    |   write_stmt
    ;

if_stmt
    :   If exp Then stmt_sequence (Else stmt_sequence)? EOF?
    ;

repeat_stmt
    :   Repeat stmt_sequence Until exp
    ;

assign_stmt
    :   Identifier Assign exp Semi
    ;

read_stmt
    :   Read Identifier Semi
    ;

write_stmt
    :   Write exp Semi
    ;

exp
    :   simple_exp Equal simple_exp
    |   simple_exp Less simple_exp
    |   simple_exp
    ;

simple_exp
    :   simple_exp Plus term
    |   simple_exp Minus term
    |   term
    ;

term
    :   term Multi factor
    |   term Div factor
    |   factor
    ;

factor
    :   LeftParen exp RightParen
    |   DecimalConstant
    |   Identifier
    ;

//Main
progarm
    :   stmt_sequence? EOF
    ;

//Keyword
If : 'if';
Then : 'then';
End : ' end';
Else : 'else';
Read : 'read';
Write : 'write';
Until : 'until';
Repeat : 'repeat';
//Special Symbol
Semi : ';';
Equal : '=';
Assign : ':=';
Less : '<';
Plus : '+';
Minus : '-';
Multi : '*';
Div : '/';
LeftParen : '(';
RightParen : ')';

//Token
Identifier
    :   Nondigit
        (   Nondigit
        |   Digit
        )*
    ;

DecimalConstant
    :   NonzeroDigit Digit+
    |   Digit
    ;

fragment
Digit
    :   [0-9]
    ;

fragment
NonzeroDigit
    :   [1-9]
    ;

fragment
Nondigit
    :   [a-zA-Z_]
    ;


//Skip part
Whitespace
    :   [ \t]+
        -> skip
    ;

Newline
    :   (   '\r' '\n'?
        |   '\n'
        )
        -> skip
    ;

BlockComment
    :   '/*' .*? '*/'
        -> skip
    ;

LineComment
    :   '//' ~[\r\n]*
        -> skip
    ;



