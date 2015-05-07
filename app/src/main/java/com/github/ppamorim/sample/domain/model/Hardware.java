package com.github.ppamorim.sample.domain.model;

import com.github.ppamorim.recyclerrenderers.interfaces.Renderable;
import com.github.ppamorim.sample.R;

public class Hardware implements Renderable {

  private String picture;
  private String manufacturer;
  private String model;

  public Hardware(String picture, String manufacturer, String model) {
    this.picture = picture;
    this.manufacturer = manufacturer;
    this.model = model;
  }

  public String getPicture() {
    return picture;
  }

  public void setPicture(String picture) {
    this.picture = picture;
  }

  public String getManufacturer() {
    return manufacturer;
  }

  public void setManufacturer(String manufacturer) {
    this.manufacturer = manufacturer;
  }

  public String getModel() {
    return model;
  }

  public void setModel(String model) {
    this.model = model;
  }

  @Override public int getRenderableResourceId(int position) {
    return R.layout.adapter_hardware;
  }

}
