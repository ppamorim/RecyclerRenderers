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
package com.github.ppamorim.recyclerrenderers.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.github.ppamorim.recyclerrenderers.builder.RendererBuilder;
import com.github.ppamorim.recyclerrenderers.interfaces.Builder;
import com.github.ppamorim.recyclerrenderers.interfaces.Renderable;
import com.github.ppamorim.recyclerrenderers.viewholder.RenderViewHolder;
import java.util.ArrayList;

public class RendererAdapter<T> extends RecyclerView.Adapter<RenderViewHolder> {

  private LayoutInflater layoutInflater;
  private ArrayList<T> items;
  private Builder builder;

  public RendererAdapter(ArrayList<T> items, RendererBuilder builder,
      LayoutInflater layoutInflater) {

    if (items == null) {
      throw new IllegalArgumentException("Data must not be null");
    }
    if (items instanceof Renderable) {
      throw new IllegalArgumentException("Items need to be a extends of Renderable");
    }
    this.items = items;

    if (builder == null) {
      throw new IllegalArgumentException("Builder must not be null");
    }
    this.builder = builder;

    if (layoutInflater == null) {
      throw new IllegalArgumentException("LayoutInflater must not be null");
    }
    this.layoutInflater = layoutInflater;

  }

  @Override public RenderViewHolder onCreateViewHolder(ViewGroup viewGroup, int viewType) {
    return (builder.instantiate(viewType).create())
        .onCreateViewHolder(viewGroup, layoutInflater, viewType);
  }

  @Override public void onBindViewHolder(RenderViewHolder holder, int position) {
    holder.onBindView((Renderable) items.get(position));
    holder.setItem((Renderable) items.get(position));
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
    return ((Renderable) items.get(position)).getRenderableResourceId(position);
  }

  public void add(Renderable item, int position) {
    items.add(position, (T) item);
    notifyItemInserted(position);
  }

  public void clear() {
    items.clear();
    notifyDataSetChanged();
  }

}
