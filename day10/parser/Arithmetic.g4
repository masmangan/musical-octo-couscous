grammar Arithmetic;

// Parser rules
expr: term ( ('+' | '-') term)*;
term: factor ( ('*' | '/') factor)*;
factor: ID | INT_CONSTANT | '(' expr ')';

// Lexer rules
INT_CONSTANT: [0-9]+;
ID: [A-Z]+;

// Original grammar
//<expr> = <term> {(+ | -) <term>} <term> → <factor> {(* | /) <factor>} <factor> → id |
// int_constant | ( <expr> )