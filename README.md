<div align="center">
    <h1>PlayerInfoExpansion</h1>
</div>

<p align="center">
    English | 
    <a href="/README-CHINESE.md">简体中文</a>
</p>

PlayerInfoExpansion is a PlaceholderAPI expansion that displays a player's device, platform, and version information.

## Features

This expansion provides the following features:

- Displays the player's device information: such as Android, iOS, OSX, etc.
- Displays the player's platform information: such as Mobile, Computer, Console, etc.
- Displays the player's version information: using the version information provided by ViaVersion.

## Installation Steps

Ensure dependent plugins are installed and enabled:

- PlaceholderAPI
- ViaVersion
- Floodgate

Place the playerinfo-expansion.jar file into the server's ./plugins/PlaceholderAPI/expansions directory.

## Usage

%playerinfo%: Displays the player's version, platform, and device information.
For example:

- Player info: %playerinfo%
- Player version: %playerinfo_version%
- Player platform: %playerinfo_platform%
- PLayer device: %playerinfo_device%

When the player executes a command or triggers an event, this placeholder will be replaced with the specific player information, such as [1.16.5][Computer][Win32].

## Example

If the player is using a Windows computer and running Minecraft version 1.16.5, the information displayed in the chat or configuration file might look like this:

- Player info: [1.16.5][Computer][Win32]

This expansion allows server administrators and players to easily view and display detailed player information.
