# Fluttershy themed Greeting

A small Paper plugin that swaps the default join/leave messages for something quieter.

Instead of "Steve joined the game," it prints a little bordered message with a random
gentle phrase and a small face. No sounds, no spam — just a soft nod that someone showed
up or wandered off.

## What it looks like in chat

```
~*~*~*~ ✿ ~*~*~*~
 Steve drifted in on a gentle breeze
      (◕‿◕)
~*~*~*~ ✿ ~*~*~*~
```

Leave messages use the same layout, just a different face and a different pool of phrases.

## Requirements

- Java 17+
- Paper 1.20.x

## Building

```
mvn package
```

The finished jar lands in `target/`.

## Installing

1. Build it (or grab the jar from Releases if you've made one)
2. Drop it into your server's `plugins` folder
3. Restart the server

## Customizing

The border, the face, and both phrase lists all live in `config.yml` — nothing is
hardcoded in the Java. Add lines, remove lines, or reword the whole thing into a
different theme entirely. Restart the server (or run `/reload confirm`) after editing.

## Why Fluttershy

No deep reason beyond "shy woodland creature" being a nice contrast to the usual loud
join spam. Reskin it into whatever fits — this was mostly an excuse to practice events,
config files, and a bit of randomized text in one small plugin.
