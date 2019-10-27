GRUN=java org.antlr.v4.gui.TestRig
ANTLR4=java -jar /usr/local/lib/antlr-4.7.2-complete.jar

gui:
	make compile
	$(GRUN) UDG program -gui < yhacktester.cpp &

trace: 
	make compile
	$(GRUN) UDG program -trace < yhacktester.cpp &

compile:
	$(ANTLR4) UDG.g4
	javac UDG*.java

UDG.g4:
	touch $@

.PHONY:
	clean

clean:
	rm UDG.interp
	rm UDG.tokens
	rm UDGB*
	rm UDGL*
	rm UDGP*