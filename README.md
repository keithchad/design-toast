# Design-Toast

[![Plartform: Android](https://img.shields.io/badge/Plartform-Android-yellow)](https://www.android.com/)
[![License: MIT](https://img.shields.io/badge/License-MIT-yellow.svg)](https://opensource.org/licenses/MIT)
[![API](https://img.shields.io/badge/API-21%2B-orange)](https://android-arsenal.com/api?level=21) 
[![toast_version](https://img.shields.io/badge/toast__version-0.4.0-blue) ](https://jitpack.io/#keithchad/Design-Toast)

Design Toast is a custom Toast Library in Android using Java. 

## Preview - Success Toast 
![success](https://user-images.githubusercontent.com/63049827/103617182-da104c80-4f3e-11eb-927a-cc1669dbf367.png)

## Preview - Error Toast
![error](https://user-images.githubusercontent.com/63049827/103617124-bb11ba80-4f3e-11eb-92a4-2fcea5f49270.png)

## Preview - Warning Toast
![warning](https://user-images.githubusercontent.com/63049827/103617218-ee544980-4f3e-11eb-98bb-5a525b654646.png)

## Preview - Info Toast
![info](https://user-images.githubusercontent.com/63049827/103617278-0a57eb00-4f3f-11eb-944a-99cd7dbd15cc.png)

## Dependency Project Level

Step 1. Add the JitPack repository to your build file

Add it in your root build.gradle at the end of repositories:



``` groovy
	allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}

```

## Dependency App Level

Add dependency in your app module

``` groovy
	dependencies {
	        implementation 'com.github.keithchad:Design-Toast:0.4.0'
	}

```

## Five Toast Types 🖐🏼
```
        1. TOAST_SUCCESS
        2. TOAST_ERROR
        3. TOAST_WARNING
        4. TOAST_INFO
```

## Toast Duration ⌛️ 
``` java
        1. LONG_DURATION // 4 Seconds
        2. SHORT_DURATION // 2 Seconds
```

## Usage 

# Sample Code for - Design Toast 🌟 

### Success Toast
``` java
 DesignToast.makeText(this, "This is a SUCCESS Toast", DesignToast.LENGTH_SHORT, DesignToast.TYPE_SUCCESS).show();
                
```

### Warning Toast
``` java
 DesignToast.makeText(this, "This is a WARNING Toast", DesignToast.LENGTH_SHORT, DesignToast.TYPE_WARNING).show();
```
### Warning Toast
``` java
 DesignToast.makeText(this, "This is an ERROR Toast", DesignToast.LENGTH_SHORT, DesignToast.TYPE_ERROR).show();

```

### Info Toast
``` java
  DesignToast designToast = DesignToast.makeText(this, "This is an INFO Toast");
  designToast.show();
```

# Donation
If this project help you reduce time to develop, you can give me something little :) 

[![P](https://www.paypalobjects.com/en_US/i/btn/btn_donateCC_LG.gif)](https://www.patreon.com/chaddev)

## License

``` LICENSE
MIT License

Copyright (c) 2021 Keith Chad

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all
copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
SOFTWARE.

```
