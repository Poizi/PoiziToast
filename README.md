# PoiziToast

Android customizable Toast


## Screenshots

![Normal](https://raw.githubusercontent.com/Poizi/PoiziToast/master/screenshots/normal.png)
![Error](https://raw.githubusercontent.com/Poizi/PoiziToast/master/screenshots/error.png)
![Info](https://raw.githubusercontent.com/Poizi/PoiziToast/master/screenshots/info.png)
![Warning](https://raw.githubusercontent.com/Poizi/PoiziToast/master/screenshots/warning.png)
![Success](https://raw.githubusercontent.com/Poizi/PoiziToast/master/screenshots/success.png)
![Custom](https://raw.githubusercontent.com/Poizi/PoiziToast/master/screenshots/custom.png)

## Dependency

## Usage

1. Add this in your root build.gradle file:


``` gradle
allprojects {
	repositories {
		...
		maven { url "https://jitpack.io" }
	}
}
```


2. Add this to your module's `build.gradle` file:

``` gradle
dependencies {
	...
	compile 'com.github.FarshidABZ:PoiziToast:v1.0'
}
```


3. How to use:

Each method always returns a `PoiziToast` object, so you can customize the Toast much more. **DON'T FORGET THE `show()` METHOD!**

- Normal Toast:
``` java
PoiziToast.with(this)
	.normal("Normal Toast", Toast.LENGTH_SHORT)
	.show();
```

- Warning Toast:
``` java
PoiziToast.with(this)
	.warning("warning Toast", Toast.LENGTH_SHORT)
	.show();
```

- Error Toast:
``` java
PoiziToast.with(this)
	.error("error Toast", Toast.LENGTH_SHORT)
	.show();
```

- Info Toast:
``` java
PoiziToast.with(this)
	.info("info Toast", Toast.LENGTH_SHORT)
	.show();
```

- Success Toast:
``` java
PoiziToast.with(this)
	.success("success", Toast.LENGTH_SHORT)
	.show();
```

- Custom Toast:
``` java
PoiziToast.with(this)
	.setBackgroundColor(getResources().getColor(R.color.colorAccent))
	.setIcon(R.drawable.battery_charging_full)
	.setGravity(Gravity.BOTTOM)
	.setTextColor(R.color.textColor)
	.setTextTypeFace(Typeface.createFromAsset(getAssets(), "fonts/font.ttf"))
	.setTextSize(14)
	.makeToast("custom text", Toast.LENGTH_SHORT)
	.show();
```

## Attributes


| attribute name  |        attribute description         |
| :-------------: | :----------------------------------: |
|      icon       |       The icon of Poizi Toast.       |
|     gravity     |     The gravity of Poizi Toast.      |
|    TextSize     |       The message's text size.       |
|    TextColor    |      The message's text color.       |
|  TextTypeFace   |    The message's text type face.     |
| BackgroundColor | The background color of Poizi Toast. |
