package org.FinchTheBird;

import net.runelite.client.config.Config;
import net.runelite.client.config.ConfigGroup;
import net.runelite.client.config.ConfigItem;

@ConfigGroup("example")
public interface AntiFireAlertConfig extends Config
{
	@ConfigItem(
		keyName = "Potion Timer Threshold",
		name = "Welcome Greeting",
		description = "Alerts user when they are in need of a new potion"
	)
	default String greeting()
	{
		return "Hello";
	}
}
