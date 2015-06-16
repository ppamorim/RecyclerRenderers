package com.github.ppamorim.sample.ui.activity;

import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.widget.TextView;
import android.widget.Toast;
import butterknife.InjectView;
import com.github.ppamorim.sample.R;
import com.github.ppamorim.sample.util.ViewUtil;

public class ConsolesActivity extends AbstractActivity {

  @InjectView(R.id.toolbar_title) TextView toolbarTitle;
  @InjectView(R.id.recycler_view) RecyclerView recyclerView;

  @Override protected int getContentViewId() {
    return R.layout.activity_list;
  }

  @Override protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    toolbarTitle.setText(getResources().getString(R.string.renderer));
    ViewUtil.configRecyclerView(this, recyclerView);
  }

  public void showPositionAndData(int position, String data) {
    Toast.makeText(this, "position: " + position + " data: " + data, Toast.LENGTH_LONG).show();
  }

}
