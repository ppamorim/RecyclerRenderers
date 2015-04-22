package com.github.ppamorim.recyclerrenderers.ui.renderers.renderers;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.github.ppamorim.recyclerrenderers.renderer.Renderer;
import com.github.ppamorim.recyclerrenderers.viewholder.RenderViewHolder;
import com.github.ppamorim.recyclerrenderers.ui.renderers.viewholder.ViewHolderConsole;

public class ConsoleRenderer extends Renderer {

  LayoutInflater layoutInflater;

  public ConsoleRenderer(int id) {
    super(id);
  }

  @Override public RenderViewHolder onCreateViewHolder(ViewGroup viewGroup, int id) {
    if(layoutInflater == null) {
      layoutInflater = LayoutInflater.from(viewGroup.getContext());
    }
    return new ViewHolderConsole(layoutInflater.inflate(id, viewGroup, false));
  }

}