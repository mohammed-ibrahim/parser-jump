java -jar ./lib/antlr-4.5.1-complete.jar ./src/main/antlr/Jump.g4 -visitor -package org.jump.parser.grammer -no-listener &&
rm ./src/main/java/org/jump/parser/grammer/* &&
mv ./src/main/antlr/*.tokens ./src/main/java/org/jump/parser/grammer/ &&
mv ./src/main/antlr/*.java ./src/main/java/org/jump/parser/grammer/
