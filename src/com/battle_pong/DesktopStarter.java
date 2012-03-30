package com.battle_pong;

import com.badlogic.gdx.backends.jogl.JoglApplication;

public class DesktopStarter
{
	public static void main(String[] args)
	{
		new JoglApplication(new Battle_Pong(),
				"Battle Pong",
				480, 320,
				false);
	}
}
