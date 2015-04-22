package com.github.ppamorim.recyclerrenderers.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.ViewGroup;
import com.github.ppamorim.recyclerrenderers.builder.RendererBuilder;
import com.github.ppamorim.recyclerrenderers.interfaces.Builder;
import com.github.ppamorim.recyclerrenderers.interfaces.Renderable;
import com.github.ppamorim.recyclerrenderers.renderer.Renderer;
import com.github.ppamorim.recyclerrenderers.viewholder.RenderViewHolder;
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
