package com.mygdx.gamespace;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Vector2;

public class Background {
//изображение 
    class BGPicture{
//    	картинка
        private Texture tx;
//        расположение 
        private Vector2 pos;
//расположение картинки запуск конструктора первым инцилизируем через сылку 
        public BGPicture(Vector2 pos){
//        	вставляем картинку 
            tx = new Texture("fone.jpg");
            this.pos = pos;
        }

    }

    private int speed;
//    выделить память картинкам 
    private BGPicture[] backs;

    public Background(){
        speed = 4;
//       создать массив из 2 классов 
        backs = new BGPicture[2]; 
//        инцилизируем их низ 0 верх 600 вторая х0  y0
        backs[0] = new BGPicture(new Vector2(0,600));
        backs[1] = new BGPicture(new Vector2(0,0));
    }
//ресуем 
    public void render(SpriteBatch batch){
//    	пробигам по массиву 
        for (int i = 0; i < backs.length; i++) {
//        	выводим картинку сылка на картинку и её позицыю 
            batch.draw(backs[i].tx, backs[i].pos.x, backs[i].pos.y);
        }
    }
// двигаем обновляем то 600 до 0 отнимая 4 
    public void update(){
        for (int i = 0; i < backs.length; i++) {
//        	берем велечену и уменьшаем на скорость 
            backs[i].pos.y-= speed;
        }
//если позицыя ушла за ноль то 600 опять 0 номер 2 то 600 номер 1
        if(backs[0].pos.y < -0){
            backs[0].pos.y = 600;
            backs[1].pos.y = 0;
        }
    }
}
