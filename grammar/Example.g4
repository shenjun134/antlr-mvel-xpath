grammar Example;

options {
  superClass=MultiChannelBaseParser;
}

@lexer::members {
    public static final int HIDDEN = 1;
}

template
  :  '{' templateBody  '}'
  ;

templateBody
  : templateChunk*
  ;

templateChunk
  : code # codeChunk // dsl code, ignore whitespace
  | text # textChunk // any text
  ;
 

code
  :  '@' function
  ;

function
  : {disable(ExampleLexer.HIDDEN);} Identifier '(' argument ')'{enable(ExampleLexer.HIDDEN);}
  ;

argument
  : function
  | template
  ;

text
  : texttoken+
  ;
  
texttoken
  : Identifier
  | Whitespace+
  | ~('}' |'@')+
  ;

Identifier
  : LETTER (LETTER|DIGIT)*
  ;

Whitespace
  : [ \t\n\r] -> channel(HIDDEN)
  ;

fragment LETTER
    : [a-zA-Z]
    ;

fragment DIGIT
    : [0-9]
    ;