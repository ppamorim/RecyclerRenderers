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
import android.view.LayoutInflater;
import android.widget.TextView;
import com.facebook.drawee.backends.pipeline.Fresco;
import com.facebook.drawee.interfaces.DraweeController;
import com.facebook.drawee.view.SimpleDraweeView;
import com.facebook.imagepipeline.request.ImageRequest;
import com.facebook.imagepipeline.request.ImageRequestBuilder;
import com.github.ppamorim.recyclerrenderers.adapter.MultiRendererAdapter;
import com.github.ppamorim.recyclerrenderers.adapter.RendererAdapter;
import com.github.ppamorim.recyclerrenderers.builder.RendererBuilder;
import com.github.ppamorim.recyclerrenderers.interfaces.Renderable;
import com.github.ppamorim.sample.domain.model.Console;
import com.github.ppamorim.sample.domain.model.Hardware;
import com.github.ppamorim.sample.ui.renderers.factory.Factory;
import java.util.ArrayList;

public class ViewUtil {

  public static void configMultiRecyclerView(final Context context, RecyclerView recyclerView) {
    recyclerView.setHasFixedSize(true);
    recyclerView.setItemAnimator(new DefaultItemAnimator());
    GridLayoutManager layoutManager = new GridLayoutManager(context, 2);
    layoutManager.setOrientation(LinearLayoutManager.VERTICAL);
    recyclerView.addItemDecoration(new MarginDecoration(context));
    recyclerView.setLayoutManager(layoutManager);
    recyclerView.setAdapter(new MultiRendererAdapter(generateObjects(),
        new RendererBuilder(new Factory()), LayoutInflater.from(context)));
  }

  public static void configRecyclerView(final Context context, RecyclerView recyclerView) {
    recyclerView.setHasFixedSize(true);
    recyclerView.setItemAnimator(new DefaultItemAnimator());
    GridLayoutManager layoutManager = new GridLayoutManager(context, 2);
    layoutManager.setOrientation(LinearLayoutManager.VERTICAL);
    recyclerView.addItemDecoration(new MarginDecoration(context));
    recyclerView.setLayoutManager(layoutManager);
    recyclerView.setAdapter(new RendererAdapter<Console>(generateConsoles(),
        new RendererBuilder(new Factory()), LayoutInflater.from(context)));
  }

  public static ArrayList<Console> generateConsoles() {
    ArrayList<Console> consoles = new ArrayList<>();
    consoles.add(new Console(
        "Xbox One", "http://s3.amazonaws.com/digitaltrends-uploads-prod/2013/11/"
        + "microsoft-xbox-one-review-system-v2.jpg"));
    consoles.add(new Console("PS4", "http://jogazera.com.br/wp-content/"
        + "uploads/2014/03/ps4-review.jpg"));
    consoles.add(new Console("Xbox 360", "http://criticalhits.com.br/"
        + "wp-content/uploads/2013/10/3rl.jpg"));
    consoles.add(new Console("PS3", "http://assets.vg247.com/"
        + "current//2012/09/12032PS3_HW2_copy.jpg"));
    consoles.add(new Console("Xbox", "http://diariodegoias.com.br/"
        + "images/stories/imagens/2014/DEZEMBRO/MS-Xbox-Console-Bare-600x361.jpg"));
    consoles.add(new Console("PS2", "http://www.hotgamez.com.br/"
        + "imagens/hotgamez.com.br/produtos/CONSOLES/PS2/PS2_2.jpg"));
    return consoles;
  }

  public static ArrayList<Renderable> generateObjects() {
    ArrayList<Renderable> renderables = new ArrayList<>();
    renderables.add(new Hardware(
        "http://www.legitreviews.com/wp-content/uploads/2014/03/intel-devils-canyon-cpu.jpg",
        "Intel", "4790K"));
    renderables.add(new Hardware(
        "http://static8.kabum.com.br/produtos/fotos/50118/50118_index_g.jpg", "AMD", "FX5950"));
    renderables.addAll(generateConsoles());
    return renderables;
  }

  public static void verifyStringAndSet(final TextView textView, String text) {
    if (textView != null && text != null && text.length() > 0) {
      textView.setText(text.trim());
    }
  }

  public static void bind(final SimpleDraweeView view, String uri) {
    ImageRequest imageRequest =
        ImageRequestBuilder.newBuilderWithSource(Uri.parse(uri))
            .build();
    DraweeController draweeController = Fresco.newDraweeControllerBuilder()
        .setImageRequest(imageRequest)
        .setOldController(view.getController())
        .setAutoPlayAnimations(true)
        .build();
    view.setController(draweeController);
  }

}
