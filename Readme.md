# Introduction

This project is meant as a tool to explore different programming concepts.  The overall goal is to implement the game of
Chess.  The project itself provides a very bare bones starting place.  Your task is to implement the following pieces
of functionality, in order.  Various Conductors will show up at different stages of the project to talk through your
work, pair program with you, and generally get to know your working style.  You are encouraged to ask questions
throughout this process; please don't be shy.

We assume you have at least passing knowledge of the game of chess, but no strategy will be necessary.  We won't ask you
to build an AI to play against.  But a few pieces of knowledge will be helpful:

  - Position on the board is typically given as Column/Row coordinates.  For instance, the white King starts at D1.
  - A move of a given as a pair of coordinates.  For instance, the King moving forward one space would be expressed
    as D1:D2.


# Stage One:  Chess Pieces
The initial state of the project provides very little; not much more than a basic structure for displaying an empty
chess board via a CLI.  Your first goal is to model all of the pieces of a chess set:

- The King
- The Queen
- The Bishop
- The Knight
- The Rook
- The Pawn

Here is some functionality we would like for you to implement:

- Modify the application to display a new game with pieces in place.  The positions of the pieces should be:
    - White Pieces:
        - A1  Rook
        - B1  Knight
        - C1  Bishop
        - D1  King
        - E1  Queen
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


- Give a list of all the possible moves on the board
Each piece can move in specific ways.  If you don't remember the pattern of each piece, Wikipedia is very helpful:
http://en.wikipedia.org/wiki/Chess





# Stage Two:  The Game

You should now have a visible, populated board.  So let's model the game itself.

1.  Build a CLI-based user interface for taking in piece moves.  Specifically:
  o White moves first
  o Invalid move requests should be reported and ignored
  o Valid moves should be accepted by showing the updated state of the game


2.  Build a system that can



# Stage Three:  Persistence



# Stage Four:  API



# Stage Five:  Web App
