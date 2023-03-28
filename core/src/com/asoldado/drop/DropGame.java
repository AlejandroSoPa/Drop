package com.asoldado.drop;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.utils.ScreenUtils;
import com.badlogic.gdx.Gdx;

public class DropGame extends ApplicationAdapter {
	SpriteBatch batch;
	Texture img;
	float x=0;
	float y=0;
	float vx=10;
	float vy=10;
	
	@Override
	public void create () {
		batch = new SpriteBatch();
		img = new Texture("badlogic.jpg");
	}

	@Override
	public void render () {

		if (x >= Gdx.graphics.getWidth()) {
			vx = -10.00f;
		} else if (x<=0) {
			vx = +10.00f;
		}

		if (y >= Gdx.graphics.getHeight()) {
			vy = -10.00f;
		} else if (y<=0) {
			vy = +10.00f;
		}


		ScreenUtils.clear(1, 0, 0, 1);
		batch.begin();
		batch.draw(img, x, y);
		batch.end();

		x = x + vx;
		y = y + vy;
	}
	
	@Override
	public void dispose () {
		batch.dispose();
		img.dispose();
	}
}
