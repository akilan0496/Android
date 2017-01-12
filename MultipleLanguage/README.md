# Create Locale Directories and String Files

```
MyProject/
    res/
       values/
           strings.xml
       values-es/
           strings.xml
       values-fr/
           strings.xml
```

Add the string values for each locale into the appropriate file.

At runtime, the Android system uses the appropriate set of string resources based on the locale currently set for the user's device.

For example, the following are some different string resource files for different languages.

<b>English (default locale)</b>, /values/strings.xml:

# Use the String Resources in Code

In your source code, you can refer to a string resource with the syntax <b>R.string.string_name.</b>

For example:
```
// Get a string resource from your app's Resources
String hello = getResources().getString(R.string.hello_world);

// Or supply a string resource to a method that requires a string
TextView textView = new TextView(this);
textView.setText(R.string.hello_world);
```