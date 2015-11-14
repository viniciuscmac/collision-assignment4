package com.gamefromscratch.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.gamefromscratch.Physics1;
import com.gamefromscratch.Physics2;
import com.gamefromscratch.Physics3;
import com.gamefromscratch.Physics4;

public class DesktopLauncher {
	public static void main (String[] arg) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
		new LwjglApplication(new Physics4(), config);
	}
}
