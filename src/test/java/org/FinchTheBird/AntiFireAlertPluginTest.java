package org.FinchTheBird;

import net.runelite.client.RuneLite;
import net.runelite.client.externalplugins.ExternalPluginManager;

public class AntiFireAlertPluginTest
{
	public static void main(String[] args) throws Exception
	{
		ExternalPluginManager.loadBuiltin(AntiFireAlertPlugin.class);
		RuneLite.main(args);
	}
}