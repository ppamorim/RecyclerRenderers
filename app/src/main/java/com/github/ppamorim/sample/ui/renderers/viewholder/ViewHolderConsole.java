/*
* Copyright (C) 2015 Pedro Paulo de Amorim
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
package com.github.ppamorim.sample.ui.renderers.viewholder;

import android.view.View;
import android.widget.TextView;
import butterknife.ButterKnife;
import butterknife.InjectView;
import com.github.ppamorim.sample.R;
import com.github.ppamorim.sample.core.fresco.InstrumentedDraweeView;
import com.github.ppamorim.sample.domain.model.Console;
import com.github.ppamorim.sample.viewholder.RenderViewHolder;
import com.github.ppamorim.sample.util.ViewUtil;

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
