<div align="center">
    <h1>PlayerInfoExpansion</h1>
</div>

<p align="center">
    <a href="/README.md">English</a> |
    简体中文
</p>

PlayerInfoExpansion 是一个 PlaceholderAPI 扩展，用于显示玩家的设备、平台和版本信息。

## 功能

该扩展提供以下功能：

- 显示玩家的设备信息：例如 Android、iOS、OSX 等。
- 显示玩家的平台信息：例如 Mobile、Computer、Console 等。
- 显示玩家的版本信息：使用 ViaVersion 提供的版本信息。

## 安装步骤

确保依赖插件：安装并启用以下插件：

- PlaceholderAPI
- ViaVersion
- Floodgate

将 playerinfo-expansion.jar 文件放置到服务器的 ./plugins/PlaceholderAPI/expansions 目录中。

## 使用

%player_info%：显示玩家的版本、平台和设备信息。
例如：

-  玩家信息: %player_info%

当玩家执行命令或触发事件时，该占位符将被替换为具体的玩家信息，例如 [1.16.5][Computer][Win32]。

## 示例

假设玩家使用的是 Windows 计算机，运行 Minecraft 1.16.5 版本，聊天框或配置文件中显示的信息可能如下：

- 玩家信息: [1.16.5][Computer][Win32]

此扩展使得服务器管理员和玩家能够方便地查看和显示玩家的详细信息。
