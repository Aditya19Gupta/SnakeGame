<h2>Snake Game</h2>
<p>The Snake Game is a classic arcade game where the player controls a snake to consume fruits that appear randomly on the screen. As the snake eats the fruits, it grows longer, and the game becomes progressively more challenging. The game ends if the snake collides with the walls or itself. This project is implemented using Java and JavaFX to provide a simple yet engaging gaming experience.</p>

<h2>Features</h2>
<ul>
    <li><strong>Grid-based Movement</strong>: The snake moves within a defined grid layout.</li>
    <li><strong>Fruit Consumption</strong>: A randomly placed fruit appears on the grid, and the snake grows longer as it consumes the fruit.</li>
    <li><strong>Collision Detection</strong>: The game detects collisions with the grid boundaries and the snake's own body.</li>
    <li><strong>Score Tracking</strong>: The player's score increases as the snake consumes fruits.</li>
    <li><strong>Speed Variation</strong>: The snake's speed increases as the score reaches multiples of five, adding to the challenge.</li>
    <li><strong>Game Over Screen</strong>: Displays a "GAME OVER" message when the game ends.</li>
    <li><strong>Keyboard Controls</strong>: Use the <code>W</code>, <code>A</code>, <code>S</code>, <code>D</code> keys to control the snake's direction.</li>
</ul>

<h2>How to Play</h2>
<ol>
    <li><strong>Start the Game</strong>:
        <p>Run the <code>Main.java</code> file in your IDE or from the command line. A game window will open, displaying the game grid with a green snake and a red fruit.</p>
    </li>
    <li><strong>Control the Snake</strong>:
        <p>Use the following keys to control the snake:</p>
        <ul>
            <li><code>W</code>: Move up</li>
            <li><code>A</code>: Move left</li>
            <li><code>S</code>: Move down</li>
            <li><code>D</code>: Move right</li>
        </ul>
    </li>
    <li><strong>Objective</strong>:
        <p>Navigate the snake to consume the red fruit. Avoid collisions with the grid boundaries and the snake's own body. Increase your score by eating more fruits. The game becomes more challenging as the snake's speed increases every five points.</p>
    </li>
    <li><strong>Game Over</strong>:
        <p>The game ends if the snake collides with the grid boundaries or itself. "GAME OVER" will be displayed on the screen. To play again, restart the application.</p>
    </li>
</ol>

<h2>Project Structure</h2>
<ul>
    <li><code>Main.java</code>: The main class that initializes the game, handles the game loop, and manages user input and rendering.</li>
    <li><code>Point.java</code>: A utility class representing the coordinates of points on the grid, used for the snake's body segments and the fruit's position.</li>
</ul>

<h2>Installation and Setup</h2>
<ol>
    <li><strong>Requirements</strong>:
        <ul>
            <li>Java Development Kit (JDK) 8 or later</li>
            <li>JavaFX SDK (included in JDK 11 or later)</li>
            <li>An IDE like IntelliJ IDEA, Eclipse, or NetBeans, or a text editor like Visual Studio Code with Java support</li>
        </ul>
    </li>
    <li><strong>Setup</strong>:
        <ul>
            <li>Clone the repository or download the source code.</li>
            <li>Open the project in your preferred IDE.</li>
            <li>Ensure that JavaFX is properly set up in your project.</li>
            <li>Run <code>Main.java</code> to start the game.</li>
        </ul>
    </li>
</ol>

<h2>Gameplay Logic</h2>
<ol>
    <li><strong>Initialization</strong>:
        <p>The game starts with a snake of length one, positioned at the center of the grid. A fruit is placed randomly on the grid.</p>
    </li>
    <li><strong>Game Loop</strong>:
        <p>The game continuously runs a loop where it:</p>
        <ul>
            <li>Clears the canvas and redraws the grid, snake, and fruit.</li>
            <li>Updates the snake's position based on the user's input.</li>
            <li>Checks for collisions with the boundaries and the snake's body.</li>
            <li>Checks if the snake has consumed the fruit and updates the score and snake's length accordingly.</li>
        </ul>
    </li>
    <li><strong>Collision Handling</strong>:
        <p>If the snake's head moves outside the grid or collides with any part of its body, the game sets the <code>gameOver</code> flag to true and displays the "GAME OVER" message.</p>
    </li>
    <li><strong>Scoring and Levels</strong>:
        <p>The score increases by one for each fruit consumed. The snake's speed increases every five points, adding difficulty.</p>
    </li>
</ol>

<h2>Future Enhancements</h2>
<ul>
    <li><strong>Pause/Resume Functionality</strong>: Add the ability to pause and resume the game.</li>
    <li><strong>High Score Tracking</strong>: Implement a feature to track and display the highest score.</li>
    <li><strong>Multiple Levels</strong>: Introduce distinct levels with different grid sizes and obstacles.</li>
    <li><strong>Mobile Compatibility</strong>: Adapt the game for mobile devices with touch controls.</li>
</ul>

<h2>Conclusion</h2>
<p>This Snake Game project provides a foundational understanding of game development using Java and JavaFX. It offers a fun and nostalgic gaming experience while demonstrating essential programming concepts such as user input handling, game loops, collision detection, and dynamic rendering.</p>

<h2>Author</h2>
<p>Developed by Aditya Gupta(adityacse207@gmail.com).</p>