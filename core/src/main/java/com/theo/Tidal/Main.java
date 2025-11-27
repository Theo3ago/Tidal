package com.theo.Tidal;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.utils.ScreenUtils;
import com.badlogic.gdx.Input.Keys;

/** {@link com.badlogic.gdx.ApplicationListener} implementation shared by all platforms. */
public class Main extends ApplicationAdapter {
    private SpriteBatch batch;
    private Texture image;
    public static int xval = 140;
    public static int yval = 210;

    @Override
    public void create() {
        batch = new SpriteBatch();
        image = new Texture("libgdx.png");
    }
    public static void detectkeys() {
        // Code to be executed when myMethod is called
        if (Gdx.input.isKeyPressed(Keys.A)){
            xval -= 1;

        }
        if (Gdx.input.isKeyPressed(Keys.D)){
            xval += 1;

        }
        if (Gdx.input.isKeyPressed(Keys.S)){
            yval -= 1;

        }
        if (Gdx.input.isKeyPressed(Keys.W)){
            yval += 1;

        }
    }
    @Override
    public void render() {
        ScreenUtils.clear(0.15f, 0.15f, 0.2f, 1f);
        batch.begin();
        batch.draw(image,xval, yval);
        batch.end();
//        if (Gdx.input.isKeyPressed(Keys.A)){
//            xval -= 5;
//
//        }
        detectkeys();

    }

    @Override
    public void dispose() {
        batch.dispose();
        image.dispose();
    }
}
