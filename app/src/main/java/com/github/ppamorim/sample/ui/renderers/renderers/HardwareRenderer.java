package com.github.ppamorim.sample.ui.renderers.renderers;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.github.ppamorim.recyclerrenderers.renderer.Renderer;
import com.github.ppamorim.recyclerrenderers.viewholder.RenderViewHolder;
import com.github.ppamorim.sample.ui.renderers.viewholder.ViewHolderHardware;

public class HardwareRenderer extends Renderer {

  @Override public RenderViewHolder onCreateViewHolder(ViewGroup viewGroup,
      LayoutInflater layoutInflater, int resourceId) {
    return new ViewHolderHardware(layoutInflater.inflate(resourceId, viewGroup, false));
  }

}
