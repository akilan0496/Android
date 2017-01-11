# Creating an Hellow World Android App


 * In Android Studio, create a new project:
 	* If you don't have a project opened, click <b> Start menu > Android Studio</b>.
    * If you have a project opened, select <b> File > New Project</b>.
 * In the New Project screen, enter the following values:
 	* Application Name: <b>Hellow World</b>.
 	* Company Domain: <b>example.com</b>
 	
    	*Android Studio fills in the package name and project location for you, but you can edit these if you'd like.
 * Click <b>Next</b>.
 * In the <b>Target Android Devices</b> screen, keep the default values and click <b>Next</b>.
 * In the <b>Add an Activity to Mobile</b> screen, select Empty Activity and click <b>Next</b>.
 * In the <b>Customize the Activity</b> screen, keep the default values and click <b>Finish</b>.


After some processing, Android Studio opens and displays a <b>"Hello World"</b> app with default files. You will add functionality to some of these files in the following.

Now take a moment to review the most important files. First, be sure that the <b>Project</b> window is open (select <b>View > Tool Windows > Project</b>) and the <b>Android</b> view is selected from the drop-down list at the top. You can then see the following files:

<b>app > java > com.example.helloworld > HelloWorld.java</b>

This file appears in Android Studio after the New Project wizard finishes. It contains the class definition for the activity you created earlier. When you build and run the app, the Activity starts and loads the layout file that says "Hello World!"

<b>app > res > layout > activity_hellow_world.xml</b>

This XML file defines the layout of the activity. It contains a TextView element with the text "Hello world!".

<b>app > manifests > AndroidManifest.xml</b>

The manifest file describes the fundamental characteristics of the app and defines each of its components. You'll revisit this file as you follow these lessons and add more components to your app.

<b>Gradle Scripts > build.gradle</b>

Android Studio uses Gradle to compile and build your app. There is a build.gradle file for each module of your project, as well as a build.gradle file for the entire project. Usually, you're only interested in the build.gradle file for the module. in this case the app or application module. For more information about this file, see Building Your Project with Gradle.

# Running Your App

Run on an Emulator

* Launch the Android Virtual Device Manager by selecting <b>Tools > Android > AVD Manager</b>.
* In the Your <b>Virtual Devices</b> screen, click <b>Create Virtual Device</b>.
* In the <b>Select Hardware</b> screen, select a phone device, such as Nexus 6, and then click <b>Next</b>.
* In the <b>System Image</b> screen, choose the desired system image for the AVD and click <b>Next</b>.
* If you don't have a particular system image installed, you can get it by clicking the <b>download</b> link.
* Verify the configuration settings (for your first AVD, leave all the settings as they are), and then click <b>Finish</b>.

For more information about using AVDs, see Create and Manage Virtual Devices.

Run the app from Android Studio as follows:

* In <b>Android Studio</b>, select your project and click Run from the toolbar.
* In the <b>Select Deployment Target</b> window, select your emulator and click <b>OK</b>.

It can take a few minutes for the emulator to start. You may have to unlock the screen. When you do, <b>Hello World App</b> appears on the emulator screen.