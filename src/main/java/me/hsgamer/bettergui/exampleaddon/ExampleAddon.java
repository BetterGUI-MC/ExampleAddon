package me.hsgamer.bettergui.exampleaddon;

import me.hsgamer.bettergui.object.addon.Addon;

public final class ExampleAddon extends Addon {

  @Override
  public boolean onLoad() {
    return true;
  }

  @Override
  public void onEnable() {
    // Enable logic
  }
  
  @Override
  public void onPostEnable() {
    // Post Enable logic
  }

  @Override
  public void onDisable() {
    // Disable logic
  }
}
