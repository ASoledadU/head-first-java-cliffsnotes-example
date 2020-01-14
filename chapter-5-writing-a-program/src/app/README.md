## Java Battleship

There are 4 essential steps to playing this command line style battleship app:
1. User starts the game

- The game creates the three "ships".
- The game places the three ships onto the virtual grid.

2. Gameplay begins

- Ask the user for a guess.
- Check the user's guess against all the ships to look for a "hit", "miss", or "kill". Take the correct measures as in, delete a cell if a hit is activated or a kill is a delete.
"Repeat these steps until there are no more ships"

3. Game Finishes

- Give the user a rating based on the number of guesses.

Using the import `java.io.*` we use some of those tools to get user input to use in our main method.

We assign the ships to a location and if the user's guess is equal to the cell then it qualifies as a hit and the number of hits goes up. This loop keeps going until the boolean isAlive is equal to false. It also prints out the result of each guess.