# PoiziToast
Android customizable Toast


Usage
--
Each method always returns a `PoiziToast` object, so you can customize the Toast much more. **DON'T FORGET THE `show()` METHOD!**

To display an Normal Toast:
``` java
PoiziToast.with(this)
                .normal("Normal Toast", Toast.LENGTH_SHORT)
                .show();
```

Warning Toast:
``` java
PoiziToast.with(this)
                .warning("warning Toast", Toast.LENGTH_SHORT)
                .show();
```

Error Toast:
``` java
PoiziToast.with(this)
                .error("error Toast", Toast.LENGTH_SHORT)
                .show();
```

Info Toast:
``` java
PoiziToast.with(this)
                .info("info Toast", Toast.LENGTH_SHORT)
                .show();
```

Success Toast:
``` java
PoiziToast.with(this)
                .success("success", Toast.LENGTH_SHORT)
                .show();
```

Custom Toast:
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

### Attributes

|attribute name|attribute description|
|:-:|:-:|
|icon|The icon of Poizi Toast.|
|gravity|The gravity of Poizi Toast.|
|TextSize|The message's text size.|
|TextColor|The message's text color.|
|TextTypeFace|The message's text type face.|
|BackgroundColor|The background color of Poizi Toast.|


