package com.github.ppamorim.recyclerrenderers.interfaces;

import com.github.ppamorim.recyclerrenderers.renderer.Renderer;

public interface Builder {
  Builder instantiate(int id);
  Renderer create();
}