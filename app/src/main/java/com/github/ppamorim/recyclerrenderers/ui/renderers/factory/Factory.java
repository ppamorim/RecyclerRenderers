package com.github.ppamorim.recyclerrenderers.ui.renderers.factory;

import com.github.ppamorim.recyclerrenderers.R;
import com.github.ppamorim.recyclerrenderers.interfaces.RendererFactory;
import com.github.ppamorim.recyclerrenderers.renderer.Renderer;
import com.github.ppamorim.recyclerrenderers.ui.renderers.renderers.ConsoleRenderer;

public class Factory implements RendererFactory {

  @Override public Renderer getRenderer(int id) {
    switch (id) {
      case R.layout.adapter_console:
        return new ConsoleRenderer(id);
      default:
        return null;
    }
  }

}
