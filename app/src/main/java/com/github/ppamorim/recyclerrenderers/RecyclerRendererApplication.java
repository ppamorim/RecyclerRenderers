package com.github.ppamorim.recyclerrenderers;

import android.app.Application;
import com.facebook.drawee.backends.pipeline.Fresco;

public class RecyclerRendererApplication extends Application {

  @Override public void onCreate() {
    super.onCreate();
    Fresco.initialize(getApplicationContext());
  }

  @Override public void onTerminate() {
    super.onTerminate();
    Fresco.shutDown();
  }

}
