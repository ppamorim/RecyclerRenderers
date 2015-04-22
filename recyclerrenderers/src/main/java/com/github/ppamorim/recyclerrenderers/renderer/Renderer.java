package com.github.ppamorim.recyclerrenderers.renderer;

import android.view.ViewGroup;
import com.github.ppamorim.recyclerrenderers.viewholder.RenderViewHolder;

public abstract class Renderer {

  public final int resourceId;

  public Renderer(int resourceId) {
    this.resourceId = resourceId;
  }

  public abstract RenderViewHolder onCreateViewHolder(ViewGroup viewGroup, int resourceId);

  public int getResourceId() {
    return resourceId;
  }

}