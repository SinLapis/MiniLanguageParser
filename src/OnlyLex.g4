grammar OnlyLex;
program
    :   symbol+
    ;
symbol
    :   If              # if
    |   Else            # else
    |   Read            # read
    |   Write           # write
    |   Until           # until
    |   Repeat          # repeat
    |   Semi            # semi
    |   Equal           # equal
    |   Assign          # assign
    |   Less            # less
    |   Plus            # plus
    |   Minus           # minus
    |   Multi           # multi
    |   Div             # div
    |   LeftParen       # leftParen
    |   RightParen      # rightParen
    |   Identifier      # identifier
    |   DecimalConstant # decimalConstant
    ;
//Keyword
If : 'if';
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
