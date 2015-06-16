package com.github.ppamorim.sample.ui.activity;

import android.content.Intent;
import butterknife.OnClick;
import com.github.ppamorim.sample.R;

public class BaseActivity extends AbstractActivity {

  @OnClick(R.id.single) void onSingleClick() {
    startActivity(new Intent(this, ConsolesActivity.class));
  }

  @OnClick(R.id.multi) void onMultiClick() {
    startActivity(new Intent(this, MultiActivity.class));
  }

  @Override protected int getContentViewId() {
    return R.layout.activity_base;
  }

}
