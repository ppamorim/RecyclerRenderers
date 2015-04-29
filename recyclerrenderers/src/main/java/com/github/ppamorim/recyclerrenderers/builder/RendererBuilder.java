/*
* Copyright (C) 2014 Alejandro Rodriguez Salamanca.
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
package com.github.ppamorim.recyclerrenderers.builder;

import com.github.ppamorim.recyclerrenderers.interfaces.Builder;
import com.github.ppamorim.recyclerrenderers.interfaces.RendererFactory;
import com.github.ppamorim.recyclerrenderers.renderer.Renderer;

public class RendererBuilder implements Builder {

  private int resourceId;
  private RendererFactory factory;

  public RendererBuilder(RendererFactory factory) {
    this.factory = factory;
  }

  @Override public Renderer create() {
    return factory.getRenderer(resourceId);
  }

  @Override public Builder instantiate(int resourceId) {
    this.resourceId = resourceId;
    return this;
  }

}