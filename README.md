# Calligraphy
使用第三方字体快速定义整个app的文字显示样式

在Android开发当中可能会有这样的需求，就是使用第三方字体来定义app的字体样式，而Calligraphy就能做到这个。

效果图：
![](C:\Users\admin\Desktop\a0.jpg)

1，在build.gradle里面引入

  dependencies {
      compile 'uk.co.chrisjenx:calligraphy:2.3.0'
  }
  
2，下载一个.ttf的字体（http://font.chinaz.com/）
![](C:\Users\admin\Desktop\font677.jpg)

3，初始化Calligraphy（ps：记得要在AndroidManifest.xml里面要使用这个MyApp类）
![](C:\Users\admin\Desktop\a1.png)

4，新建assets/fonts/文件夹，将下载的字体放到里面
![](C:\Users\admin\Desktop\a2.png)

5，在res/values/目录下新建attrs资源文件，定义名称
![](C:\Users\admin\Desktop\a3.png)

6，在res/values/style里面定义和引用字体，并关联到appTheme
![](C:\Users\admin\Desktop\a4.png)

7，最后在Activity的attachBaseContext（）方法中引用进来。
![](C:\Users\admin\Desktop\a5.jpg)

