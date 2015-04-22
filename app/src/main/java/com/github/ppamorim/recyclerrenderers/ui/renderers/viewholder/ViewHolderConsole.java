package com.github.ppamorim.recyclerrenderers.ui.renderers.viewholder;

import android.view.View;
import android.widget.TextView;
import butterknife.ButterKnife;
import butterknife.InjectView;
import com.github.ppamorim.recyclerrenderers.R;
import com.github.ppamorim.recyclerrenderers.core.fresco.InstrumentedDraweeView;
import com.github.ppamorim.recyclerrenderers.domain.model.Console;
import com.github.ppamorim.recyclerrenderers.library.viewholder.RenderViewHolder;
import com.github.ppamorim.recyclerrenderers.util.ViewUtil;

public class ViewHolderConsole extends RenderViewHolder<Console> {

  @InjectView(R.id.console_image) InstrumentedDraweeView consoleImage;
  @InjectView(R.id.console_name) TextView consoleName;

  public ViewHolderConsole(View view) {
    super(view);
    ButterKnife.inject(this, view);
  }

  @Override public void onBindView(Console console) {
    ViewUtil.verifyStringAndSet(consoleName, console.getName());
    ViewUtil.bind(consoleImage, console.getImageUrl());
  }

}
