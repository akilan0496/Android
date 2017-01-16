# Supporting Different Screens


 * There are four generalized sizes: small, normal, large, xlarge.
 * And four generalized densities: low (ldpi), medium (mdpi), high (hdpi), extra high (xhdpi)
 
### Create Different Layouts:

To optimize your user experience on different screen sizes, you should create a unique layout XML file for each screen size you want to support. Each layout should be saved into the appropriate resources directory, named with a <b>-screen_size</b> suffix. For example, a unique layout for large screens should be saved under res/layout-large/.

For example, this project includes a default layout and an alternative layout for large

```
MyProject/
    res/
        layout/              						# default (portrait)
            activity_multiple_screen_layout.xml
        layout-land/         						# landscape
            activity_multiple_screen_layout.xml	
        layout-large/        						# large (portrait)
            activity_multiple_screen_layout.xml
        layout-large-land/  					 	# large landscape
            activity_multiple_screen_layout.xml
```

* The system loads the layout file from the appropriate layout directory based on screen size of the device on which your app is running.

### Create Different Bitmaps:

* To generate these images, you should start with your raw resource in vector format and generate the images for each density using the following size scale:

  <b>xhdpi: 2.0
  hdpi: 1.5
  mdpi: 1.0 (baseline)
  ldpi: 0.75</b>


* This means that if you generate a <b>200x200</b> image for xhdpi devices, you should generate the same resource in <b>150x150</b> for hdpi, <b>100x100</b> for mdpi, and <b>75x75</b> for ldpi devices.

```
MyProject/
    res/
        drawable-xhdpi/
            awesomeimage.png
        drawable-hdpi/
            awesomeimage.png
        drawable-mdpi/
            awesomeimage.png
        drawable-ldpi/
            awesomeimage.png
```
