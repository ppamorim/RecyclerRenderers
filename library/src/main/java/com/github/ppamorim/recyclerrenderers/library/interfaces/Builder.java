package com.github.ppamorim.recyclerrenderers.library.interfaces;

import com.github.ppamorim.recyclerrenderers.library.renderer.Renderer;

public interface Builder {
  Builder instantiate(int id);
  Renderer create();
}