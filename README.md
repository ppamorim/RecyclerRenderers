![Logo 1][1]

[![Build Status Master](https://travis-ci.org/ppamorim/RecyclerRenderers.svg?branch=master)](https://travis-ci.org/ppamorim/RecyclerRenderers)
[![Build Status Develop](https://travis-ci.org/ppamorim/RecyclerRenderers.svg?branch=develop)](https://travis-ci.org/ppamorim/RecyclerRenderers)
[![Android Arsenal](https://img.shields.io/badge/Android%20Arsenal-RecyclerRenderers-brightgreen.svg?style=flat)](http://android-arsenal.com/details/1/1727)
[![JitPack](https://img.shields.io/github/release/ppamorim/recyclerrenderers.svg?label=JitPack%20Maven)](https://jitpack.io/#ppamorim/recyclerrenderers/v1.2)

The easiest way to create adapters! You can add a lot of different layouts and models. This library avoid all the boilerplates needed to create a list for your application.

![Screen][14]

Highly inspired on [Renderers][10] and [RecyclerViewRenderers][11], thanks for [Alexrs95][12].

Support
-------

This library works on API 10, but not yet tested.

How to use
----------

You can use [this sample ][2] to understand this library. I will document soon.

Import dependency
--------------------------------

This library uses appcompat-v7:22.1.0.

But why not add in MavenCentral?
Because it is so much bureaucratic.

JitPack is there and is the future!

Into your build.gradle:

```groovy

repositories {
  maven {
    url "https://jitpack.io"
  }
}

dependencies {
  compile 'com.github.ppamorim:recyclerrenderers:1.2.4'
}
```

Contributors
------------

* [Pedro Paulo de Amorim][3]

Developed By
------------

* Pedro Paulo de Amorim - <pp.amorim@hotmail.com>

<a href="https://www.linkedin.com/profile/view?id=185411359">
  <img alt="Add me to Linkedin" src="http://imageshack.us/a/img41/7877/smallld.png" />
</a>

Libraries used on the sample project
------------------------------------

* [Butterknife][5]
* [Fresco][13]

License
-------

    Copyright 2015 Pedro Paulo de Amorim

    Licensed under the Apache License, Version 2.0 (the "License");
    you may not use this file except in compliance with the License.
    You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

    Unless required by applicable law or agreed to in writing, software
    distributed under the License is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
    limitations under the License.

[1]: ./art/logo.png
[2]: https://github.com/ppamorim/RecyclerRenderers/tree/master/app/src/main/java/com/github/ppamorim/sample/ui/renderers
[3]: https://github.com/ppamorim/
[5]: https://github.com/JakeWharton/butterknife
[10]: https://github.com/pedrovgs/Renderers
[11]: https://github.com/Alexrs95/RecyclerViewRenderers
[12]: https://github.com/Alexrs95
[13]: https://github.com/facebook/fresco
[14]: ./art/screen.png
