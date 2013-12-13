# Introduction

This project is meant as a tool to explore different programming concepts.  The overall goal is to implement the game of
Chess.  The project itself provides a very bare bones starting place.  Your task is to implement the following pieces
of functionality, in order.  Various Conductors will show up at different stages of the project to talk through your
work, pair program with you, and generally get to know your working style.  You are encouraged to ask questions
throughout this process; please don't be shy.

We assume you have at least passing knowledge of the game of chess, but no strategy is necessary for this project.  If you have
little knowledge of chess, the Wikipedia article is an excellent reference:

http://en.wikipedia.org/wiki/Chess


# Getting Started
The initial state of the project provides very little; not much more than a basic structure for displaying an empty chess board via a CLI.  After you clone the directory, you can run the program via Maven:

```Shell
$ mvn compile exec:java
(( Maven cruft deleted for brevity }}
Welcome to Chess!
Type 'help' for a list of commands.
> help
Possible commands:
    'help'                       Show this menu
    'quit'                       Quit Chess
    'new'                        Create a new game
    'board'                      Show the chess board
    'list'                       List all possible moves
    'move <colrow> <colrow>'     Make a move
> new
It's currently White's Move
    A   B   C   D   E   F   G   H
  +---+---+---+---+---+---+---+---+
  |   |   |   |   |   |   |   |   |
8 |   |   |   |   |   |   |   |   |
  |   |   |   |   |   |   |   |   |
  +---+---+---+---+---+---+---+---+
  |   |   |   |   |   |   |   |   |
7 |   |   |   |   |   |   |   |   |
  |   |   |   |   |   |   |   |   |
  +---+---+---+---+---+---+---+---+
  |   |   |   |   |   |   |   |   |
6 |   |   |   |   |   |   |   |   |
  |   |   |   |   |   |   |   |   |
  +---+---+---+---+---+---+---+---+
  |   |   |   |   |   |   |   |   |
5 |   |   |   |   |   |   |   |   |
  |   |   |   |   |   |   |   |   |
  +---+---+---+---+---+---+---+---+
  |   |   |   |   |   |   |   |   |
4 |   |   |   |   |   |   |   |   |
  |   |   |   |   |   |   |   |   |
  +---+---+---+---+---+---+---+---+
  |   |   |   |   |   |   |   |   |
3 |   |   |   |   |   |   |   |   |
  |   |   |   |   |   |   |   |   |
  +---+---+---+---+---+---+---+---+
  |   |   |   |   |   |   |   |   |
2 |   |   |   |   |   |   |   |   |
  |   |   |   |   |   |   |   |   |
  +---+---+---+---+---+---+---+---+
  |   |   |   |   |   |   |   |   |
1 |   |   |   |   |   |   |   |   |
  |   |   |   |   |   |   |   |   |
  +---+---+---+---+---+---+---+---+
    A   B   C   D   E   F   G   H

White's Move
> quit
Goodbye!
```

# Your Goals
The overall goal here is to build the game of chess so that you can play it from the CLI.  Specific goals are listed below, but please _please_ ask any questions that come to mind.
The sequence of the goals described here is intentional -- we've found it will be easier to accomplish them all if you stick to the plan.

## Goal #1: Modify the application to display a new game with pieces in place.
Your first goal is place the pieces of a chess set on the board.  The types of pieces on a chess board are:

- The King
- The Queen
- The Bishop
- The Knight
- The Rook
- The Pawn


The initial version of the application just shows you an empty board.  Modify it so that it shows all the chess pieces in their correct starting positions.  The positions of the pieces should be:

    - White Pieces:
        - A1  Rook
        - B1  Knight
        - C1  Bishop
        - D1  Queen
        - E1  King
        - F1  Bishop
        - G1  Knight
        - H1  Rook
        - A2, B2, C2, D2, E2, F2, G2, H2
        All Pawns

    - Black Pieces
        - A8  Rook
        - B8  Knight
        - C8  Bishop
        - D8  Queen
        - E8  King
        - F8  Bishop
        - G8  Knight
        - H8  Rook
        - A7, B7, C7, D7, E7, F7, G7, H7
        All Pawns

After you are done, you should be able to see the pieces on the board when you use the 'new' command in the CLI.

## Goal #2:  Give a list of all the possible moves on the board
Each piece can move in specific ways.  In the CLI, you may have noticed a command, 'list', which is not currently implemented.  Your goal in this step is to implement that command, showing all the moves that the current player can make.

For the purposes of this exercise, you can specifically *ignore* these more complex movements:
- Castling the King
- En passant


## Goal #3:  Implement the ability for White and Black to make moves via the CLI
When a new game is launched, the CLI prompts the White player to enter their first move.  However, the 'move' command is not currently implemented.  Your goal in this step is to implement the 'move' command.

Note that, traditionally, chess has a variety of ways to indicate moves.  For simplicity of implementation, we recommend you implement a system that represents a move as "move {from} {to}".  So, in the CLI ...

```Shell
White's Move
> move d2 d4
```

... would move the Queen's pawn forward by two.

## Goal #4:  Detect when the game is over via checkmate or draw
The game should be able to detect when the game is over, either from a Checkmate or a Draw.  You can ignore the possibility of a game ending by repetitive moves, or by there not being enough pieces left on either side to complete the game.



# Congrats!
If you've met the four goals above, congratulations!  This exercise has several follow-on modules that you may be asked
to explore, including:

    - Persistence Module:  How can you record the state of a game in a persistent data store?
    - Strategy Module:  How can you build a basic computer player?
    - API Module: How can you build a REST-ful API on top of this game to expose it to external clients?
    - Web App Module:  How can you build a web client to this game?
