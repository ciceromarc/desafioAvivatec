# testng-appium-app-browserstack

This repository demonstrates how to run Appium tests in [TestNG](http://testng.org) on BrowserStack App Automate using BrowserStack SDK.

![BrowserStack Logo](https://d98b8t1nnulk5.cloudfront.net/production/images/layout/logo-header.png?1469004780)

## Setup

### Requirements

1. **Java 8+**

   - If Java is not installed, follow these instructions:
      - For Windows, download the latest Java version from [here](https://java.com/en/download/) and run the installer executable.
      - For Mac and Linux, run `java -version` to see what Java version is pre-installed. If you want a different version, download from [here](https://java.com/en/download/).

   - Java Development Kit (JDK)
      - Verify if the JDK is installed by typing `java -version` in the command prompt (cmd).

   - If not installed, download and install the latest JDK from Oracle or OpenJDK.

   - Configure the `JAVA_HOME` environment variable to point to the JDK installation directory.

   - Example:
      - `JAVA_HOME=C:\Program Files\Java\jdk-11.0.12`

   - Add `%JAVA_HOME%\bin` to the system `PATH`.

2. **Maven**
   - If Maven is not downloaded, download it from [here](https://maven.apache.org/download.cgi).
   - For installation, follow the instructions [here](https://maven.apache.org/install.html).

   - Verify if Maven is installed by typing `mvn -version` in the command prompt.

   - If not installed, download Maven and extract it to a directory of your choice.

   - Configure the `M2_HOME` environment variable to point to the Maven installation directory.

   - Example:
      - `M2_HOME=C:\Program Files\Apache\apache-maven-3.8.5`

   - Add `%M2_HOME%\bin` to the system `PATH`.

3. **Android Studio**

   To run Appium tests on Android devices, you need to install Android Studio.

   - **Download Android Studio**:
      - Download the latest version from [Android Studio download page](https://developer.android.com/studio).

   - **Installation**:
      - Follow the installation instructions for your operating system (Windows, Mac, or Linux).

   - **Setup Android SDK**:
      - Open Android Studio and follow the setup wizard to install the required Android SDK packages.

   - **Install ADB**:
      - ADB (Android Debug Bridge) is a command-line tool that allows you to interact with Android devices.
      - ADB is included with the Android SDK, so once the SDK is installed, ADB will be available.

4. **Set Android Environment Variables (For Windows)**

   After installing Android Studio and the SDK, you need to configure environment variables for ADB and Android tools.

   - **For Windows**:
      - Add the following to your system environment variables:
         - **ANDROID_HOME**: This points to the Android SDK directory.
            - Example: `C:\Users\<YourUsername>\AppData\Local\Android\Sdk`
         - **Path**: Add the following paths to your `PATH` variable:
            - `C:\Users\<YourUsername>\AppData\Local\Android\Sdk\platform-tools`
            - `C:\Users\<YourUsername>\AppData\Local\Android\Sdk\tools`
            - `C:\Users\<YourUsername>\AppData\Local\Android\Sdk\tools\bin`

      - **To set environment variables**:
         1. Right-click on "This PC" or "My Computer" and choose "Properties."
         2. Click "Advanced system settings" and then "Environment Variables."
         3. Under "System variables," click "New" to create `ANDROID_HOME`, and enter the SDK path (`C:\Users\<YourUsername>\AppData\Local\Android\Sdk`).
         4. Find the `Path` variable under "System variables," click "Edit," and add the paths for `platform-tools`, `tools`, and `tools\bin` (as shown above).

   - **Verify ADB installation**:
      - Open a command prompt and type `adb version` to confirm that ADB is properly installed.

   - **Verify Device Connection**:
      - Run the following command to ensure that your Android device is connected:
        ```bash
        adb devices
        ```

---

## Getting Started

Getting Started with Appium tests in TestNg on BrowserStack couldn't be easier!

### **Run Sample test:**

- Switch to one of the following directories: [Android examples](android/testng-examples) or [iOS examples](ios/testng-examples)
- Run the following Maven command:
  ```bash
  mvn test