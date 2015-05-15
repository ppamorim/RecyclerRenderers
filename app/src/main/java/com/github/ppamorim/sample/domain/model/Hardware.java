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
