package com.mygdx.gamespace;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.Input.Keys;
public class Shuttle {
	
	Texture img;
	Vector2 position;
	
	

	float marioX;
	float marioY;
	
//создаем картинку и позицию 
    public Shuttle(){
        img = new Texture("shuttl.gif");
        position = new Vector2(250,20);
        
    }
  //ресуем 
    public void render(SpriteBatch batch){
        batch.draw(img,position.x,position.y);
    }
    
}
