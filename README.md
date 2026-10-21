# NekoBox for Android (liu-xindi fork)

[![API](https://img.shields.io/badge/API-21%2B-brightgreen.svg?style=flat)](https://android-arsenal.com/api?level=21)
[![Releases](https://img.shields.io/github/v/release/liu-xindi/NekoBoxForAndroid)](https://github.com/liu-xindi/NekoBoxForAndroid/releases)
[![License: GPL-3.0](https://img.shields.io/badge/license-GPL--3.0-orange.svg)](https://www.gnu.org/licenses/gpl-3.0)

基于 [MatsuriDayo/NekoBoxForAndroid](https://github.com/MatsuriDayo/NekoBoxForAndroid) 的 fork,加入了应用内的 Tailscale 配置界面.

- 内核: [liu-xindi/sing-box](https://github.com/liu-xindi/sing-box) `1.12.25-neko-1`,即官方 v1.12.25 加上 MatsuriDayo neko 补丁 (上游为 1.12.19-neko).
- Tailscale: 可在应用内新建 Tailscale endpoint 配置,字段包括 auth key、control URL、hostname、ephemeral、accept routes、exit node、advertise routes. Tailscale 库版本为 1.92.4 (`sagernet/tailscale v1.92.4-sing-box-1.13-mod.10`),支持用 `sha256-raw` 固定证书的自建 DERP.
- 包名为 `com.cheng31.nekobox`,可与官方 NekoBox 同时安装.

要访问 tailnet 内的地址,需要添加一条路由规则 (例如匹配 IP 段 `100.64.0.0/10`,不支持 MagicDNS),出站选择 Tailscale 配置.

下载: [Releases](https://github.com/liu-xindi/NekoBoxForAndroid/releases)\
问题反馈: [本仓库的 Issues](https://github.com/liu-xindi/NekoBoxForAndroid/issues)

---

A fork of [MatsuriDayo/NekoBoxForAndroid](https://github.com/MatsuriDayo/NekoBoxForAndroid) with an in-app Tailscale profile editor.

- Kernel: [liu-xindi/sing-box](https://github.com/liu-xindi/sing-box) `1.12.25-neko-1`, i.e. official v1.12.25 plus the MatsuriDayo neko patches (upstream ships 1.12.19-neko).
- Tailscale: create a Tailscale endpoint profile in the app, with auth key, control URL, hostname, ephemeral, accept routes, exit node and advertise routes. The Tailscale library is 1.92.4 (`sagernet/tailscale v1.92.4-sing-box-1.13-mod.10`), which supports self-hosted DERP relays pinned with `sha256-raw`.
- Package name is `com.cheng31.nekobox`, so it installs alongside the official NekoBox.

To reach tailnet addresses, add a route rule (e.g. matching the IP range `100.64.0.0/10`; MagicDNS is not supported) whose outbound is the Tailscale profile.

Downloads: [Releases](https://github.com/liu-xindi/NekoBoxForAndroid/releases)\
Issues: [this repository's Issues](https://github.com/liu-xindi/NekoBoxForAndroid/issues)

## Credits

- [MatsuriDayo/NekoBoxForAndroid](https://github.com/MatsuriDayo/NekoBoxForAndroid)
- [SagerNet/sing-box](https://github.com/SagerNet/sing-box)
- [tailscale/tailscale](https://github.com/tailscale/tailscale)

---

> 以下为上游 README 原文.
>
> The following is the upstream README.

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
