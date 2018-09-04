# Pairing Induction Exercise

## Requirements

In order to be able to run the exercise, you need to install `java` (version 8
or higher in your machine). To use Java 8, use the following commands:

```bash
brew tap caskroom/versions
brew cask install java8
```

Optionally, to easily get the scaffolding in your laptop, you can install `GIT`
and be able to clone the repository with:

 ```bash
 brew install git
 ```

_NOTE_: we are using `gradle` as our building and dependency management tool,
but since we are using the wrapper, we don't need to have it installed.


## Quick Start

Tests can be executed in the terminal, from the root folder of the project:

```bash
./gradlew test
```

Or using the IDE
