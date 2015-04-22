package com.github.ppamorim.recyclerrenderers.domain.model;

import com.github.ppamorim.recyclerrenderers.R;
import com.github.ppamorim.recyclerrenderers.library.interfaces.Renderable;

public class Console implements Renderable {

  private String name;
  private String imageUrl;

  public Console(String name, String imageUrl) {
    this.name = name;
    this.imageUrl = imageUrl;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getImageUrl() {
    return imageUrl;
  }

  public void setImageUrl(String imageUrl) {
    this.imageUrl = imageUrl;
  }

  @Override public int getRenderableResourceId() {
    return R.layout.adapter_console;
  }

}
