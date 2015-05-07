package com.github.ppamorim.sample.ui.renderers.renderers;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.github.ppamorim.recyclerrenderers.renderer.Renderer;
import com.github.ppamorim.recyclerrenderers.viewholder.RenderViewHolder;
import com.github.ppamorim.sample.ui.renderers.viewholder.ViewHolderHardware;

public class HardwareRenderer extends Renderer {

  LayoutInflater layoutInflater;

  public HardwareRenderer(int id) {
    super(id);
  }

  @Override public RenderViewHolder onCreateViewHolder(ViewGroup viewGroup, int id) {
    if(layoutInflater == null) {
      layoutInflater = LayoutInflater.from(viewGroup.getContext());
    }
    return new ViewHolderHardware(layoutInflater.inflate(id, viewGroup, false));
  }

}
