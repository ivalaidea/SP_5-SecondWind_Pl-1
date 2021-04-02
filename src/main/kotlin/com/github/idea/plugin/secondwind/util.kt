package com.github.idea.plugin.secondwind

import com.github.syari.spigot.api.string.toColor
import org.bukkit.command.CommandSender

fun CommandSender.send(message: String) {
    sendMessage("&b[SecondWind] &r$message".toColor())
}