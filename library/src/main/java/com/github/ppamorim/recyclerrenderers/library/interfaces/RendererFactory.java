package com.github.ppamorim.recyclerrenderers.library.interfaces;

import com.github.ppamorim.recyclerrenderers.library.renderer.Renderer;

public interface RendererFactory {
  Renderer getRenderer(int id);
}
