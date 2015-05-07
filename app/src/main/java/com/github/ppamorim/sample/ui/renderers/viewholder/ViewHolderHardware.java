package com.github.ppamorim.sample.ui.renderers.viewholder;

import android.view.View;
import android.widget.TextView;
import butterknife.ButterKnife;
import butterknife.InjectView;
import com.github.ppamorim.recyclerrenderers.viewholder.RenderViewHolder;
import com.github.ppamorim.sample.R;
import com.github.ppamorim.sample.core.fresco.InstrumentedDraweeView;
import com.github.ppamorim.sample.domain.model.Hardware;
import com.github.ppamorim.sample.util.ViewUtil;

public class ViewHolderHardware extends RenderViewHolder<Hardware> {

  @InjectView(R.id.hardware_image) InstrumentedDraweeView hardwareImage;
  @InjectView(R.id.hardware_manufacturer) TextView hardwareManufacturer;
  @InjectView(R.id.hardware_model) TextView hardwareModel;

  public ViewHolderHardware(View view) {
    super(view);
    ButterKnife.inject(this, view);
  }

  @Override public void onBindView(Hardware hardware) {
    ViewUtil.verifyStringAndSet(hardwareManufacturer, hardware.getManufacturer());
    ViewUtil.verifyStringAndSet(hardwareModel, hardware.getModel());
    ViewUtil.bind(hardwareImage, hardware.getPicture());
  }

}
