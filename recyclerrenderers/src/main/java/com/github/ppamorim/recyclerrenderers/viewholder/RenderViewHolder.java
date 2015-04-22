package com.github.ppamorim.recyclerrenderers.viewholder;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import com.github.ppamorim.recyclerrenderers.interfaces.Renderable;

public abstract class RenderViewHolder<R extends Renderable> extends RecyclerView.ViewHolder {

  private final Context context;
  private R item;

  public RenderViewHolder(View itemView) {
    super(itemView);
    this.context = itemView.getContext();
  }

  public Context getContext() {
    return context;
  }

  public void setItem(R item) {
    this.item = item;
  }

  public R getItem() {
    return item;
  }

  public void onViewRecycled() {}

  public void onViewAttachedToWindow() {}

  public void onViewDetachedFromWindow() {}

  public abstract void onBindView(R item);

}
