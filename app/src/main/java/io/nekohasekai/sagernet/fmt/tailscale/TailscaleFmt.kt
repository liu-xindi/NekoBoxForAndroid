package io.nekohasekai.sagernet.fmt.tailscale

import moe.matsuri.nb4a.SingBoxOptions
import moe.matsuri.nb4a.utils.listByLineOrComma

fun buildSingBoxEndpointTailscaleBean(bean: TailscaleBean): SingBoxOptions.Endpoint_TailscaleOptions {
    return SingBoxOptions.Endpoint_TailscaleOptions().apply {
        type = "tailscale"
        if (bean.authKey.isNotBlank()) auth_key = bean.authKey
        if (bean.controlURL.isNotBlank()) control_url = bean.controlURL
        if (bean.ephemeral) ephemeral = true
        if (bean.hostname.isNotBlank()) hostname = bean.hostname
        if (bean.acceptRoutes) accept_routes = true
        if (bean.exitNode.isNotBlank()) exit_node = bean.exitNode
        if (bean.exitNodeAllowLANAccess) exit_node_allow_lan_access = true
        if (bean.advertiseRoutes.isNotBlank()) advertise_routes = bean.advertiseRoutes.listByLineOrComma()
        if (bean.advertiseExitNode) advertise_exit_node = true
    }
}
