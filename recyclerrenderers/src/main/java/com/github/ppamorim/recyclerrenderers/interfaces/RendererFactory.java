package com.github.ppamorim.recyclerrenderers.interfaces;

import com.github.ppamorim.recyclerrenderers.renderer.Renderer;

public interface RendererFactory {
  Renderer getRenderer(int id);
}
