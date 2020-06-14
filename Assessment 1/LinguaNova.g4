grammar LinguaNova;

@header {
	package linguanova;
}

prog: (static_assignments NEWLINE*)* main_body (func_body NEWLINE*)*;

string:
	'"'(LETTER|WORD|INTEGER|DECIMAL|SYMBOL|WS)*'"';
value:
	DECIMAL|string|array_length|func_call|math_op|lbl|'true'|'false';
	
array_length:
	'length' '(' lbl ')';
	
lbl:
	(LETTER|WORD) array_container? ;
	
math_op:
	OPERATOR '(' (lbl|func_call|DECIMAL|math_op) ',' (lbl|func_call|DECIMAL|math_op) ')';

incdec_op:
	('inc'|'dec') '(' lbl ')';

rtn:
	'return' (value | condition);

static_assignments:
	('$'|'%') DTYPE lbl assignment? SEMI;
	
main_body:
	'$Main init():'
	NEWBLOCK
		(statement NEWBLOCK*)+
	NEWLINE*;

func_body:
	('$'|'#') 'Func' lbl '(' (DTYPE array_container? (value | condition) COMMA?)* '):'
	NEWBLOCK
		(statement NEWBLOCK*)+
		rtn?
	BLOCKCLS;

func_call:
	'call' lbl '('((value | condition) COMMA?)*')';

var_dec:
	('$'|'#') DTYPE (lbl assignment? COMMA?)*;

var_assign:
	lbl assignment? COMMA?;

assignment:
	'<-' (value | condition | array_items);
	
negate_op:
	'negate' '(' condition ')';

equals_op:
	'equals' '(' (value | condition) ',' (value | condition) ')';

comparison_op:
	COMPARATOR '(' value ',' value ')';

logic_op:
	('and'|'or') '(' condition ',' condition ')';
		
condition:
	func_call | negate_op | logic_op | comparison_op | equals_op | 'true' | 'false';

output:
	'output(' (value COMMA?)* ')';
	
input:
	'input(' lbl ')';

do_while:
	'initiate:'
	NEWBLOCK
		(statement NEWBLOCK*)+
	NEWLINE* 'interval(' condition ')' BLOCKCLS;

switchCase:
	'trigger(' (lbl | func_call) '):'
	NEWBLOCK
		(sCase NEWBLOCK)*
		sDefault
		NEWBLOCK
	BLOCKCLS;
	
sCase:
	'choice' (DECIMAL | string) ':'
	NEWBLOCK
		(statement NEWBLOCK*)+
	NEWBLOCK
	BLOCKCLS;
	
sDefault:
	'standard:'
	NEWBLOCK
		(statement NEWBLOCK*)*
	NEWBLOCK
	BLOCKCLS;
	
while_loop:
	'interval(' condition '):'
	NEWBLOCK
		(statement NEWBLOCK*)+
	BLOCKCLS;

for_loop:
	'step(#Decimal' lbl '<-' DECIMAL '/' comparison_op '/' incdec_op '):'
	NEWBLOCK
		(statement NEWBLOCK*)+
	BLOCKCLS;
	
foreach_loop:
	'stepthru(#' DTYPE lbl ' in ' lbl '):'
	NEWBLOCK
		(statement NEWBLOCK*)+
	BLOCKCLS;

if_stmt:
	'verify(' condition '):'
	NEWBLOCK
		(statement NEWBLOCK*)+
	BLOCKCLS;

else_stmt:
	'divert:'
	NEWBLOCK
		(statement NEWBLOCK*)+
	BLOCKCLS;

array_container:
	'<'(lbl | DECIMAL (TILDE DECIMAL)?)? '>';

array_items:
	'<' (value COMMA?)+ '>';

single_cmt
 : '//' (LETTER|WORD|INTEGER|DECIMAL|SYMBOL|WS)* ;

multi_cmt
 : '/*' (LETTER|WORD|INTEGER|DECIMAL|SYMBOL|WS|NEWLINE)* '*/' ;

statement:
	(func_call
	|func_body
	|var_dec
	|var_assign
	|output
	|input
	|do_while
	|switchCase
	|sCase
	|sDefault
	|while_loop
	|for_loop
	|foreach_loop
	|if_stmt
	|else_stmt
	|math_op
	|incdec_op
	|single_cmt
	|multi_cmt
	|rtn);

fragment LCASE : [a-z];
fragment UCASE : [A-Z];
fragment DIGIT : [0-9];

POINT: '.';
COMMA: ',';
SEMI: ';';
TILDE: '~';

SYMBOL: '!'|'.'|':'|'@';

COMPARATOR: 'less'|'less_equal'|'greater_equal'|'greater';
OPERATOR: 'add'|'subtract'|'divide'|'multiply'|'power'|'modulo';

DTYPE : 'Decimal'|'String'|'Boolean';
LETTER: LCASE|UCASE;
WORD: LETTER+;
INTEGER: DIGIT+;
DECIMAL: DIGIT+ POINT DIGIT+;

NEWBLOCK: '\n  ';
BLOCKCLS: '[end]';
NEWLINE: '\n';
WS: [ \t\r] -> skip;
