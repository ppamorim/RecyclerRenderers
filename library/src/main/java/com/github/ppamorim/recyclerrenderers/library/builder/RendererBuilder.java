package com.github.ppamorim.recyclerrenderers.library.builder;

import com.github.ppamorim.recyclerrenderers.library.interfaces.Builder;
import com.github.ppamorim.recyclerrenderers.library.interfaces.RendererFactory;
import com.github.ppamorim.recyclerrenderers.library.renderer.Renderer;

public class RendererBuilder implements Builder {

  private int resourceId;
  private RendererFactory factory;

  public RendererBuilder(RendererFactory factory) {
    this.factory = factory;
  }

  @Override public Renderer create() {
    return factory.getRenderer(resourceId);
  }

  @Override public Builder instantiate(int resourceId) {
    this.resourceId = resourceId;
    return this;
  }

}