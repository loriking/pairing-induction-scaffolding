# Pairing Induction Exercise

## Quick Start

Tests can be executed in the terminal, from the root folder of the project:

```bash
sbt test
```

You can also run the tests automatically every time there are changes in the filesystem:

1. Go into an sbt terminal

```bash
sbt
```

2. Inside the sbt terminal

```bash
~test
```

Or you can use your IDE to run the tests


## Requirements

- Java JDK 8+

With SDKMAN (Recommended - see below how to install SDKMAN):

```bash
sdk install java
```

Or with Homebrew:

```bash
brew tap caskroom/versions
brew cask install java8
```

- SBT (Scala Build Tool)

With SDKMAN (Recommended):

```bash
sdk install sbt
```

Or with Homebrew:

```bash
brew install sbt@1
```


### Optional

- SDKMAN

This is a tool that helps managing the installation and management of different versions of the binaries for different languages, build tools, etc. around the JVM.

The installation instructions can be found at https://sdkman.io/install

With this tool, you can install `java`, `scala` and `sbt`, also with multiple versions at the same time, and activate different versions easily. For example:

Java Examples:

```bash
sdk list java
sdk install java
sdk install java 8.0.201-zulu
sdk install java 11.0.2-zulu
sdk use java 8.0.201-zulu
sdk use java 11.0.2-zulu
```

Scala Examples:

```bash
sdk list scala
sdk install scala
sdk install scala 2.12.8
sdk install scala 2.11.10
sdk use scala 2.12.8
sdk use scala 2.11.10
```

For a full list of all the tools that can be managed with SDKMAN:

```bash
sdk list
```

- Scala

SBT already manages Scala libraries for you, but in case you want to install in your computer the libraries anyways, which allows you to invoke a REPL to fool around with scala, you can install it:

With SDKMAN:

```bash
sdk install scala
```

Or with Homebrew:

```bash
brew install scala
```

- IntelliJ Scala plugin

If you are using IntelliJ as IDE, there is a Scala plugin available which provides Scala and SBT integration within the IDE and it is strongly recommended to install to work with Scala based projects.

Open the Preferences (`Cmd + ,`), go to the Plugins pane, search for `Scala`, install it and restart the IDE.
