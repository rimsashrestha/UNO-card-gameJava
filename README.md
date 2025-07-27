# UNO Card Game (Java)

A fully functional console-based implementation of the classic **UNO** card game written in Java. This project supports multiple players and simulates the original gameplay mechanics including action cards (Reverse, Skip, Draw Two, Wild, and Wild Draw Four).

## 🎮 Features

- Full UNO deck with proper color, number, and action card handling
- Support for 2–10 players
- Turn-based gameplay with enforced rules
- Dynamic handling of:
  - Draw 2 / Draw 4 stacking
  - Wild and color-changing rules
  - Skip and Reverse turns
- Console-based user interaction
- Winner detection and end-of-game flow

## 🛠 Technologies Used

- Java (JDK 8+)
- Object-Oriented Programming (OOP)
- Custom data structures (ArrayList, Stack)
- No external libraries or frameworks

## 🚀 Getting Started

### Prerequisites

- Java 8 or higher
- Java IDE (e.g., IntelliJ, Eclipse) or terminal access

### Run the Game

1. Clone the repository:
   ```bash
   git clone https://github.com/rimsashrestha/UNO-card-gameJava.git
   cd UNO-card-gameJava
   ```
2.Compile and run:
   ```bash
   javac UnoGame.java
   java UnoGame
   ```
3. Follow the on-screen instructions to play!

### 📁 Project Structure

UnoGame.java – Main game loop and logic

Player.java – Player behavior and turn management

Card.java – Card class with color, value, and type

Deck.java – Handles card drawing, discarding, and shuffling

GameUtils.java – Utility methods and helper functions

🤔 Why This Project?
This project was built to deepen understanding of object-oriented programming, game logic, and console interaction in Java. It was also a fun challenge to simulate a real-life multiplayer card game!

📌 Future Enhancements
- GUI using JavaFX or Swing

- AI opponents for solo play

- Multiplayer over network

- Save/load game functionality

🙋‍♀️ Author
Rimsa Shrestha
