# NekoBox for Android

[![API](https://img.shields.io/badge/API-21%2B-brightgreen.svg?style=flat)](https://android-arsenal.com/api?level=21)
[![Releases](https://img.shields.io/github/v/release/MatsuriDayo/NekoBoxForAndroid)](https://github.com/MatsuriDayo/NekoBoxForAndroid/releases)
[![License: GPL-3.0](https://img.shields.io/badge/license-GPL--3.0-orange.svg)](https://www.gnu.org/licenses/gpl-3.0)

sing-box / universal proxy toolchain for Android.

一款使用 sing-box 的 Android 通用代理软件.

## 关于本 Fork / About This Fork

这是 [MatsuriDayo/NekoBoxForAndroid](https://github.com/MatsuriDayo/NekoBoxForAndroid) 的一个 fork,主要改动:

- **内核升级**:使用 [Clare113/sing-box](https://github.com/Clare113/sing-box) 的 `1.12.25-neko-1`(官方 v1.12.25 基底 + Matsuri neko 补丁),取代原版的 1.12.19-neko。
- **新增 Tailscale GUI**:可在应用内直接创建 Tailscale 节点配置(auth key / control URL / hostname / ephemeral / accept routes / exit node / advertise routes),已真机验证主动访问 tailnet 设备与被控端反向访问(如 ADB over Tailscale)。
- **独立包名** `com.cheng31.nekobox`,可与官方 NekoBox 并存安装(不会互相覆盖)。

下载:[Releases](https://github.com/Clare113/NekoBoxForAndroid/releases)

This is a fork of [MatsuriDayo/NekoBoxForAndroid](https://github.com/MatsuriDayo/NekoBoxForAndroid). Main changes:

- **Kernel**: [Clare113/sing-box](https://github.com/Clare113/sing-box) `1.12.25-neko-1` (official v1.12.25 base + Matsuri neko patches), replacing the original 1.12.19-neko.
- **Tailscale GUI**: create a Tailscale endpoint profile in-app (auth key / control URL / hostname / ephemeral / accept routes / exit node / advertise routes); verified on-device for both outbound (reaching tailnet devices) and inbound (e.g. ADB over Tailscale).
- **App id** `com.cheng31.nekobox`, so it installs alongside the official NekoBox.

Downloads: [Releases](https://github.com/Clare113/NekoBoxForAndroid/releases)

---

## 下载 / Downloads

[![GitHub All Releases](https://img.shields.io/github/downloads/Matsuridayo/NekoBoxForAndroid/total?label=downloads-total&logo=github&style=flat-square)](https://github.com/Matsuridayo/NekoBoxForAndroid/releases)

[GitHub Releases 下载](https://github.com/Matsuridayo/NekoBoxForAndroid/releases)

**Google Play 版本自 2024 年 5 月起已被第三方控制，为非开源版本，请不要下载。**

**The Google Play version has been controlled by a third party since May 2024 and is a non-open
source version. Please do not download it.**

## 更新日志 & Telegram 发布频道 / Changelog & Telegram Channel

https://t.me/Matsuridayo

## 项目主页 & 文档 / Homepage & Documents

https://matsuridayo.github.io

## 支持的代理协议 / Supported Proxy Protocols

* SOCKS (4/4a/5)
* HTTP(S)
* SSH
* Shadowsocks
* VMess
* Trojan
* VLESS
* AnyTLS
* ShadowTLS
* TUIC
* Hysteria 1/2
* WireGuard
* Tailscale (endpoint)
* Trojan-Go (trojan-go-plugin)
* NaïveProxy (naive-plugin)
* Mieru (mieru-plugin)

请到[这里](https://matsuridayo.github.io/nb4a-plugin/)下载插件以获得完整的代理支持.

Please visit [here](https://matsuridayo.github.io/nb4a-plugin/) to download plugins for full proxy
supports.

## 支持的订阅格式 / Supported Subscription Format

* 一些广泛使用的格式 (如 Shadowsocks, ClashMeta 和 v2rayN)
* sing-box 出站

仅支持解析出站，即节点。分流规则等信息会被忽略。

* Some widely used formats (like Shadowsocks, ClashMeta and v2rayN)
* sing-box outbound

Only resolving outbound, i.e. nodes, is supported. Information such as diversion rules are ignored.

## 捐助 / Donate

<details>

如果这个项目对您有帮助, 可以通过捐赠的方式帮助我们维持这个项目.

捐赠满等额 50 USD 可以在「[捐赠榜](https://mtrdnt.pages.dev/donation_list)」显示头像, 如果您未被添加到这里,
欢迎联系我们补充.

Donations of 50 USD or more can display your avatar on
the [Donation List](https://mtrdnt.pages.dev/donation_list). If you are not added here, please
contact us to add it.

USDT TRC20

`TRhnA7SXE5Sap5gSG3ijxRmdYFiD4KRhPs`

XMR

`49bwESYQjoRL3xmvTcjZKHEKaiGywjLYVQJMUv79bXonGiyDCs8AzE3KiGW2ytTybBCpWJUvov8SjZZEGg66a4e59GXa6k5`

</details>

## Credits

Core:

- [SagerNet/sing-box](https://github.com/SagerNet/sing-box)

Android GUI:

- [shadowsocks/shadowsocks-android](https://github.com/shadowsocks/shadowsocks-android)
- [SagerNet/SagerNet](https://github.com/SagerNet/SagerNet)

Web Dashboard:

- [Yacd-meta](https://github.com/MetaCubeX/Yacd-meta)
