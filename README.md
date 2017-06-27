# Calligraphy
使用第三方字体快速定义整个app的文字显示样式

在Android开发当中可能会有这样的需求，就是使用第三方字体来定义app的字体样式，而Calligraphy就能做到这个。

效果图：
![](https://github.com/zhongzhihuashanghai/Calligraphy/blob/master/FontTTF/images/a1.png)

1，在build.gradle里面引入

  dependencies {
      compile 'uk.co.chrisjenx:calligraphy:2.3.0'
  }
  
2，下载一个.ttf的字体（http://font.chinaz.com/）
![](https://github.com/zhongzhihuashanghai/Calligraphy/blob/master/FontTTF/images/a2.png)

3，初始化Calligraphy（ps：记得要在AndroidManifest.xml里面要使用这个MyApp类）
![](https://github.com/zhongzhihuashanghai/Calligraphy/blob/master/FontTTF/images/a3.png)

4，新建assets/fonts/文件夹，将下载的字体放到里面

![](https://github.com/zhongzhihuashanghai/Calligraphy/blob/master/FontTTF/images/a4.png)

5，在res/values/目录下新建attrs资源文件，定义名称
![](https://github.com/zhongzhihuashanghai/Calligraphy/blob/master/FontTTF/images/a5.png)

6，在res/values/style里面定义和引用字体，并关联到appTheme
![](https://github.com/zhongzhihuashanghai/Calligraphy/blob/master/FontTTF/images/a6.png)

7，最后在Activity的attachBaseContext（）方法中引用进来。
![](https://github.com/zhongzhihuashanghai/Calligraphy/blob/master/FontTTF/images/a7.png)

