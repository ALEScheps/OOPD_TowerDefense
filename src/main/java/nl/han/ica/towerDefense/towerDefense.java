package nl.han.ica.towerDefense;

import nl.han.ica.OOPDProcessingEngineHAN.Engine.GameEngine;
import nl.han.ica.OOPDProcessingEngineHAN.Objects.TextObject;
import processing.core.PApplet;
import nl.han.ica.OOPDProcessingEngineHAN.Dashboard.Dashboard;
import nl.han.ica.OOPDProcessingEngineHAN.Sound.Sound;
import nl.han.ica.OOPDProcessingEngineHAN.Tile.TileMap;
import nl.han.ica.OOPDProcessingEngineHAN.Tile.TileType;
import nl.han.ica.waterworld.tiles.BoardsTile;
import nl.han.ica.OOPDProcessingEngineHAN.View.View;

/**
 * @author Arthur
 */

@SuppressWarnings("serial")
public class towerDefense extends GameEngine {

	private Sound backgroundSound, enemySlain;
	private TextObject dashboardText;
	private EnemySpawner enemySpawner;
	private int enemiesSlain, enemiesLeft, wavesCompleted;
	
	public static void main(String[] args) {
		PApplet.main(new String[]{"nl.han.ica.towerDefense.towerDefense"});
		
	}

	@Override
	public void setupGame() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update() {
		// TODO Auto-generated method stub
		
	}
	
}
