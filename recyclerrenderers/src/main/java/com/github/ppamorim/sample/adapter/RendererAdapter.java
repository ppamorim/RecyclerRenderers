/*
* Copyright (C) 2014 Alejandro Rodriguez Salamanca.
*
* Licensed under the Apache License, Version 2.0 (the "License");
* you may not use this file except in compliance with the License.
* You may obtain a copy of the License at
*
* http://www.apache.org/licenses/LICENSE-2.0
*
* Unless required by applicable law or agreed to in writing, software
* distributed under the License is distributed on an "AS IS" BASIS,
* WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
* See the License for the specific language governing permissions and
* limitations under the License.
*/
package com.github.ppamorim.sample.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.ViewGroup;
import com.github.ppamorim.sample.builder.RendererBuilder;
import com.github.ppamorim.sample.interfaces.Builder;
import com.github.ppamorim.sample.interfaces.Renderable;
import com.github.ppamorim.sample.renderer.Renderer;
import com.github.ppamorim.sample.viewholder.RenderViewHolder;
import java.util.Collection;
import java.util.List;

public class RendererAdapter extends RecyclerView.Adapter<RenderViewHolder> {

  private List<Renderable> items;
  private Builder builder;

  public RendererAdapter(Collection<? extends Renderable> items, RendererBuilder builder) {
    this((List<? extends Renderable>)items, builder);
  }

  public RendererAdapter(List<? extends Renderable> items, RendererBuilder builder) {
    this.items = (List<Renderable>) items;
    if (items == null) {
      throw new IllegalArgumentException("Data must not be null");
    }
    this.builder = builder;
    if (builder == null) {
      throw new IllegalArgumentException("Builder must not be null");
    }
  }

  @Override public RenderViewHolder onCreateViewHolder(ViewGroup viewGroup, int viewType) {
    Renderer renderer = builder.instantiate(viewType).create();
    return renderer.onCreateViewHolder(viewGroup, viewType);
  }

  @Override public void onBindViewHolder(RenderViewHolder holder, int position) {
    holder.onBindView(items.get(position));
    holder.setItem(items.get(position));
  }

  @Override public long getItemId(int position) {
    return super.getItemId(position);
  }

  @Override public void onViewRecycled(RenderViewHolder holder) {
    super.onViewRecycled(holder);
    holder.onViewRecycled();
  }

  @Override public void onViewAttachedToWindow(RenderViewHolder holder) {
    super.onViewAttachedToWindow(holder);
    holder.onViewAttachedToWindow();
  }

  @Override public void onViewDetachedFromWindow(RenderViewHolder holder) {
    super.onViewDetachedFromWindow(holder);
    holder.onViewDetachedFromWindow();
  }

  @Override public int getItemCount() {
    return items.size();
  }

  @Override public int getItemViewType(int position) {
    return items.get(position).getRenderableResourceId();
  }

  public void add(Renderable item, int position) {
    items.add(position, item);
    notifyItemInserted(position);
  }

  public void clear() {
    items.clear();
    notifyDataSetChanged();
  }

}
