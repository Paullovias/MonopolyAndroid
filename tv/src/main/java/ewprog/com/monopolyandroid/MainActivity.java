/*
 * Copyright (C) 2014 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */

package ewprog.com.monopolyandroid;

import android.app.Activity;
import android.os.Bundle;

import static ewprog.com.monopolyandroid.MainActivity.createBoard;

/*
 * MainActivity class that loads {@link MainFragment}.
 */
public class MainActivity extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public static void main(String[] args) {
        // TODO: create initial method. This sets up the game.
        init();
        // TODO: create start game method. This begins actual game play.
        startGame();
    }

    public init() {
        /*
        TODO: create game board.
        The game board will be setup as a single array of 'Spaces'
         */
        createBoard();
        // TODO: create players
        createPlayers();
        // TODO: create play order.
        // Simulate initiative role of d20
    }

    public Monopoly createBoard() {
        Monopoly gameBoard = new Space[42];
        // TODO: create text reader to import names.
        for(int i = 0, i < gameBoard.size(), i++){
            // Read current line into variable name.
            String name = curLine;
            // Advance line
            curLine = nextLine;
        }
    }

    public Monopoly createPlayers() {
        // Get number of players (int)
        /*
        for each player get
            playerName (String)
            playerToken (boardPiece)
            playerMoney (should be a field for default start cash)
            playerLocation (initializes to gameBoard[0])
         */
    }
}
