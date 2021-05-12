package com.mygdx.gamespace;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class MyGdxGame extends ApplicationAdapter {
//	 класс где происходит отрисовка 
	SpriteBatch batch;
//	фон что именно ресуем 
	Background bg;
	Shuttle shut;

    float stateTime;
//	сформировать в памяти 
	@Override
	public void create () {
		batch = new SpriteBatch();
		bg = new Background();
		shut = new Shuttle();
		
	}
//отображать 
	@Override
	public void render () {
//		запуск метода данного класса 
		update();
		Gdx.gl.glClearColor( 1.0f, 1.0f, 1.0f, 1.0f);  
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT); 
//		методы  обьектов связаных с главным классом 
		batch.begin();
		bg.render(batch);
		shut.render(batch);
		batch.end();
		 
		
	}
//обновление изменения
	public void update(){
//		запуск метода связаного класса 
      bg.update();
      
      
      
	}
//	освободить ресурсы 
	@Override
	public void dispose () {
//		очистка класса где происходит отрисовка 
		batch.dispose();
	}
}
