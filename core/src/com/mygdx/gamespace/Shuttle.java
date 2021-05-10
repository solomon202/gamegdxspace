package com.mygdx.gamespace;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Vector2;

public class Shuttle {
	
	Texture img;
	Vector2 position;
	
//создаем картинку и позицию 
    public Shuttle(){
        img = new Texture("shuttl.jpg");
        position = new Vector2(100,380);
        
    }
  //ресуем 
    public void render(SpriteBatch batch){
        batch.draw(img,position.x,position.y);
    }
	

}
