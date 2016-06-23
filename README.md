# Android-ViewPager-Transition
## 简介
Android-ViewPager-Transition 是基于ViewPager的切换效果制作，目前只有Flip一种，会逐步追加其他效果。

p.s.我是github新手，开项目只是记录自己平时做的效果，代码写的并不好，如果我的代码能够被使用到非常荣幸，如果有问题可以提出我会尽力修改：）
## 效果预览
### Flip
![image](https://github.com/MidoriInu1/song.github.io/blob/master/res/demo_android_OglFlip.gif )  

+ 主要实现：com.song.transitionlib.FlipTransformer
+ 使用方式：`mViewPager.setPageTransformer(true, new FlipTransformer());`


## 使用
### AndroidStudio
+ 在`build.gradle`中添加

````
	compile 'com.song.transitionlib:Android-ViewPager-Transition:0.0.2'
````
### Eclipse
+ 下载zip后解压，导入`TransitionLib`使用


##License

Copyright 2016 Song

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.