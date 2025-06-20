# NoteBlockAPI
[![](https://jitpack.io/v/koca2000/NoteBlockAPI.svg)](https://jitpack.io/#koca2000/NoteBlockAPI) [![Build Status](http://ci.haprosgames.com/buildStatus/icon?job=NoteBlockAPI)](http://ci.haprosgames.com/job/NoteBlockAPI)

For information about this Spigot/Bukkit API, go to https://www.spigotmc.org/resources/noteblockapi.19287/

Dev builds are available at [Jenkins](http://ci.haprosgames.com/job/NoteBlockAPI/ "Jenkins")

#### Maven Dependency
```xml
<repository>
    <repository>
        <id>jitpack.io</id>
        <url>https://jitpack.io</url>
    </repository>
</repository>
<dependencies>
    <dependency>
        <groupId>com.xxmicloxx</groupId>
        <artifactId>NoteBlockAPI</artifactId>
        <version>1.6.5-SNAPSHOT</version>
        <scope>provided</scope>
    </dependency>
</dependencies>
```
#### Gradle Dependency
```groovy
repositories {
    maven { 
        url 'https://jitpack.io/' 
    }
} 

dependencies {
    compileOnly "com.xxmicloxx:NoteBlockAPI:1.6.5-SNAPSHOT"
}
```

You can also shade the API into your existing plugin and initialize it using
```java
NoteBlockAPI.initializeAPI(this)
```
