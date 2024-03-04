# Number Guessing Game
## Korte Beschrijving
Voor de opdracht van software design hebben we gekozen om een gokspelletje te maken in Java. In dit spel moet de speler een nummer raden wat door de computer gegenereerd wordt. Vervolgens waagt de computer ook nog een gok. Er wordt vervolgens gekeken welke van de twee het dichtste bij het gekozen getal zit. In deze opdracht moesten we verschillende design patterns gebruiken. Die staan hieronder op een rijtje. Deze zorgen voor extra structuur en flexibiliteit.

## Gebruikte Design Patterns
### Creational patterns:
## 1. Singleton Pattern

### Bestanden:

- GameManager.java

### Uitleg:

Het Singleton pattern wordt gebruikt om ervoor te zorgen dat er slechts één instantie van GameManager is, waardoor het spel altijd toegankelijk is.

## 2. Builder Pattern

### Bestanden:

- GameConfig.java

- GameConfigBuilder.java

### Uitleg:

Het Builder pattern wordt gebruikt om GameConfig objecten te bouwen met bijbehorende parameters, waardoor configuratie flexibel en leesbaar blijft.

### Behavioral patterns:

## 3. Observer Pattern

### Bestanden:

- Observer.java

- Player.java

- NumberGenerator.java

### Uitleg:

Het Observer pattern zorgt ervoor dat Player objecten in staat zijn om wijzigingen in NumberGenerator te volgen en automatisch bijgewerkt te worden wanneer een nieuw getal wordt gegenereerd.

## 4. Strategy Pattern

### Bestanden:

- GuessingStrategy.java

- HumanGuessingStrategy.java

- RandomGuessingStrategy.java

### Uitleg:

Het Strategy pattern definieert verschillende gokstrategieën die dynamisch kunnen worden uitgewisseld, waardoor het spel flexibel en uitbreidbaar blijft.

### Structural patterns:

## 5. Decorator Pattern

### Bestanden:

- GameDecorator.java

- ScoreboardDecorator.java

### Uitleg:

Het Decorator pattern wordt gebruikt om extra functionaliteit zoals een scoreboard dynamisch toe te voegen aan het spel zonder de functionaliteit te wijzigen.

## 6. Proxy Pattern

### Bestanden:

- NumberGuessingGameProxy.java

### Uitleg:

Het Proxy pattern wordt gebruikt om extra gedrag toe te voegen (in dit geval, controle op gebruikersreferenties) voordat het echte spel wordt aangeroepen.

## Samenwerking

De samenwerking verliep vlot. We hadden vanaf het begin helder wat we wilden gaan maken. We zijn toen gaan kijken welke design patterns binnen dit idee pasten. Na een keuze gemaakt te hebben, hebben we deze patterns eerlijk verdeeld, waarbij Ricardo verantwoordelijk was voor de implementatie van de Builder, Strategy en Proxy patterns, terwijl Willem-Arie zich bezighield met de Singleton, Observer en Decorator patterns.

Gemaakt door: Ricardo Leite Lopes & Willem-Arie Goudzwaard Github: https://github.com/Willem-Arie/SoftwareDesign
