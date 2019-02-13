# Pairing Induction Exercise

## Quick Start

Tests can be executed in the terminal, from the root folder of the project:

```bash
mix test
```

Or you can use your IDE to run the tests


## Requirements

- Elixir 1.7+

With Homebrew:

```bash
brew install elixir
```


### Optional

- IntelliJ Elixir plugin

If you are using IntelliJ as IDE, there is a Elixir plugin available which provides Scala and SBT integration within the IDE and it is strongly recommended to install to work with Scala based projects.

Open the Preferences (`Cmd + ,`), go to the Plugins pane, search for `Elixir`, install it and restart the IDE.

You'll need to setup the SDK in IntelliJ, this can be done in 2 steps:

First add the Erlang SDK, when installing elixir with Homebrew the default directory for the Erlang binaries are located at `/usr/local/Cellar/erlang/<erlang-version>/lib/erlang`

Then add the Elixir SDK, when installing elixir with Homebrew the default directory for the Elixir binaries are located at `/usr/local/Cellar/elixir/<elixir-version>`


- ASDF

asdf is a version manager for many different languages and frameworks, including Erlang and Elixir, this allows you to work with different projects that are based on different versions of Elixir with minimal fuss.

For more information: https://github.com/asdf-vm/asdf
