# Pairing Induction Exercise

## Quick Start

* Initialize environment

_NOTE_: You need to do this only once when cloning the project, and maybe again when dependencies are added or removed from the project:

```bash
pipenv install
```

You can also activate the virtual environment in the current shell by executing:

```bash
pipenv shell
```

* Tests can be executed in the terminal, from the root folder of the project:

```bash
python -m unittest
```

or

Using the IDE

## Requirements

- Python 3.7

MacOS comes with python 2.7 installed, but to install Python 3, you can do it with Homebrew: 

```bash
brew install python
```

_NOTE_: The end result will be that you will have now 2 binaries in your system, `python` for Python 2 and `python3` for Python 3. But when executing `pipenv shell` you will activate the virtual environment and `python` will point to the active python version on the current project, which in this case is `3.7`


- Pipenv

Pipenv is a virtual environment and dependency manager 2-in-1, and can be installed with Homebrew: 

```bash
brew install pipenv
```

### Optional

- PyEnv

This is a Python version manager, which helps managing different versions installed in your system in Python, and makes it easy to switch between them for different projects

```bash
brew install pyenv
```

You can list all the installed versions, show the configured version for the current path, and switch to different versions when needed:

```bash
pyenv versions
pyenv version
pyenv local 3.6.5
pyenv global 3.7.2
```

For additional information you can visit https://github.com/pyenv/pyenv
