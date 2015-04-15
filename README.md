# Java
If you plan to develop your entry in Java you need to download and install the latest [Java 8 Development Kit](http://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html).

The sample bot also uses Maven for building and dependency management - detailed instructions for installing it are provided below.

## Maven Installation
Installation is fairly simple:
* Maven is free software that can be downloaded [here](http://maven.apache.org/download.cgi) (local mirrors are available).
* Install as per the included README.txt:
	* Ensure the JAVA_HOME environment variable is set to the root of your JDK installation (eg. on Windows: C:\\Program Files\\Java\\jdk8).
	* Extract the .zip / .tar.gz archive.
	* Add the bin folder from the extracted directory to your path.
	* Verify that the installation is working by starting a new command line and running `mvn --version` it should output something similar to:
```powershell
Apache Maven 3.3.1 (cab6659f9874fa96462afef40fcf6bc033d58c1c; 2015-03-13T22:10:27+02:00)
Maven home: c:\DevTools\Java\maven-3.3.1
Java version: 1.8.0_40, vendor: Oracle Corporation
Java home: c:\DevTools\Java\jdk8u40\jre
Default locale: en_GB, platform encoding: Cp1252
OS name: "windows 7", version: "6.1", arch: "amd64", family: "dos"
```

If you need to use any libraries in your bot simply include the dependencies in your project's pom.xml.

## Get The Code
Download the [zip file](https://github.com/EntelectChallenge/2015-SpaceInvaders-Bot-Java/archive/master.zip) from Github or use Git to clone the repository:
* Start Git Bash
* Change to the directory where you want to checkout the sample bot
* Run: `git clone https://github.com/EntelectChallenge/2015-SpaceInvaders-Bot-Java.git`

## Compile
The easiest way to compile is to open a Command Prompt, change to your bot folder and run `compile.bat`. This will use Maven to fetch your dependencies and build your bot.

## Run
Once you have compiled you can do a basic test of the bot by simply launching a Command Prompt, changing to the bot directory and running `run.bat output`. This will use the example state and map files in the output folder.