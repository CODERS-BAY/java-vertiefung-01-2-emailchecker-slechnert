Ziel dieser Übung ist es einen EmailChecker zu implementieren.

Einige Regeln die eine gültige mail addresse haben muss (tobt euch ruhig aus und fügt weitere hinzu): 
* muss ein @ besitzen 
* muss mindestens eine domain haben (.com, .at, .gov, ...)
* darf keine Sonderzeichen beinhalten
* muss mindestens X zeichen vor dem @ haben

Einige Testfälle die auf jeden Fall abgedeckt werden sollten: 
* Übergabe von null
* Übergabe von einem leeren String 
* min. 10 weitere

Versuche Test-driven zu Entwickeln: 
1. Schreib zu erste die Signatur einer Methode
2. Überleg dir einen Testfall für deine Methode
3. Implementiere den Testfall, führe in aus (er sollte jetzt rot sein) 
4. Implmentiere die Logik bis alle Tests grün sind 
5. Zurück zu Schritt 1 bzw 2 