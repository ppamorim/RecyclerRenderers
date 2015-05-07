/*
* Copyright (C) 2015 Pedro Paulo de Amorim.
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
package com.github.ppamorim.sample.util;

import android.content.Context;
import android.net.Uri;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.TextView;
import com.facebook.drawee.backends.pipeline.Fresco;
import com.facebook.drawee.interfaces.DraweeController;
import com.facebook.imagepipeline.request.ImageRequest;
import com.facebook.imagepipeline.request.ImageRequestBuilder;
import com.github.ppamorim.recyclerrenderers.adapter.RendererAdapter;
import com.github.ppamorim.recyclerrenderers.builder.RendererBuilder;
import com.github.ppamorim.recyclerrenderers.interfaces.Renderable;
import com.github.ppamorim.sample.core.fresco.InstrumentedDraweeView;
import com.github.ppamorim.sample.domain.model.Console;
import com.github.ppamorim.sample.domain.model.Hardware;
import com.github.ppamorim.sample.ui.renderers.factory.Factory;
import java.util.ArrayList;

public class ViewUtil {

  public static void configRecyclerView(final Context context, RecyclerView recyclerView) {
    recyclerView.setHasFixedSize(true);
    recyclerView.setItemAnimator(new DefaultItemAnimator());
    GridLayoutManager layoutManager = new GridLayoutManager(context, 2);
    layoutManager.setOrientation(LinearLayoutManager.VERTICAL);
    recyclerView.addItemDecoration(new MarginDecoration(context));
    recyclerView.setLayoutManager(layoutManager);
    recyclerView.setAdapter(new RendererAdapter(generateObjects(), new RendererBuilder(new Factory())));
  }

  public static ArrayList<Renderable> generateObjects() {
    ArrayList<Renderable> renderables = new ArrayList<>();

    renderables.add(new Hardware("http://www.kitguru.net/wp-content/uploads/2014/05/intel_core_pentium_devil_s_canyon_lga1150_haswell1.jpg", "Intel", "4790K"));
    renderables.add(new Hardware("http://static8.kabum.com.br/produtos/fotos/50118/50118_index_g.jpg", "AMD", "FX5950"));

    renderables.add(new Console("Xbox One","http://s3.amazonaws.com/digitaltrends-uploads-prod/2013/11/microsoft-xbox-one-review-system-v2.jpg"));
    renderables.add(new Console("PS4","http://jogazera.com.br/wp-content/uploads/2014/03/ps4-review.jpg"));
    renderables.add(new Console("Xbox 360","http://criticalhits.com.br/wp-content/uploads/2013/10/3rl.jpg"));
    renderables.add(new Console("PS3","http://assets.vg247.com/current//2012/09/12032PS3_HW2_copy.jpg"));
    renderables.add(new Console("Xbox","http://diariodegoias.com.br/images/stories/imagens/2014/DEZEMBRO/MS-Xbox-Console-Bare-600x361.jpg"));
    renderables.add(new Console("PS2","http://www.hotgamez.com.br/imagens/hotgamez.com.br/produtos/CONSOLES/PS2/PS2_2.jpg"));
    renderables.add(new Console("PS1","http://tec-cia.com.br/wp-content/uploads/2014/10/s8cx4ywjeyjybqubbcy6.jpg"));

    return renderables;
  }

  public static void verifyStringAndSet(final TextView textView, String text) {
    if(textView != null && text != null && text.length() > 0) {
      textView.setText(text.trim());
    }
  }

  public static void bind(final InstrumentedDraweeView view, String uri) {
    ImageRequest imageRequest =
        ImageRequestBuilder.newBuilderWithSource(Uri.parse(uri))
            .build();
    DraweeController draweeController = Fresco.newDraweeControllerBuilder()
        .setImageRequest(imageRequest)
        .setOldController(view.getController())
        .setControllerListener(view.getListener())
        .setAutoPlayAnimations(true)
        .build();
    view.setController(draweeController);
  }

}
