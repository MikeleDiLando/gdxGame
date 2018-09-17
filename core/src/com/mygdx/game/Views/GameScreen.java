package com.mygdx.game.Views;

import com.badlogic.gdx.Screen;
import com.mygdx.game.Main;

public class GameScreen implements Screen {
    private Main parent;
//    private B2dModel model;
//    private Box2DDebugRenderer debugRenderer;
//    private OrthographicCamera cam;
//    private KeyboardController controller;
//    private AtlasRegion playerTex;
//    private SpriteBatch sb;
//    private TextureAtlas atlas;


    public GameScreen(Main main) {
        parent = main;
//        cam = new OrthographicCamera(32,24);
//        controller = new KeyboardController();
//        model = new B2dModel(controller,cam,parent.assMan);
//        debugRenderer = new Box2DDebugRenderer(true,true,true,true,true,true);
//
//        sb = new SpriteBatch();
//        sb.setProjectionMatrix(cam.combined);
//
//        atlas = parent.assMan.manager.get("images/game.atlas");
//        playerTex = atlas.findRegion("player");
    }

    @Override
    public void show() {
//        Gdx.input.setInputProcessor(controller);
    }

    @Override
    public void render(float delta) {
//        model.logicStep(delta);
//        Gdx.gl.glClearColor(0f, 0f, 0f, 1);
//        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
//
//        sb.begin();
//        sb.draw(playerTex,model.player.getPosition().x -1,model.player.getPosition().y -1,2,2);
//        sb.end();
//
//
//        debugRenderer.render(model.world, cam.combined);

    }

    @Override
    public void resize(int width, int height) {
        // TODO Auto-generated method stub

    }

    @Override
    public void pause() {
        // TODO Auto-generated method stub

    }

    @Override
    public void resume() {
        // TODO Auto-generated method stub

    }

    @Override
    public void hide() {
        // TODO Auto-generated method stub

    }

    @Override
    public void dispose() {
        // TODO Auto-generated method stub

    }
}