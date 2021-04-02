package com.github.idea.plugin.secondwind

import com.github.syari.spigot.api.event.EventRegister.Companion.registerEvents
import org.bukkit.plugin.java.JavaPlugin

class Main : JavaPlugin() {
    companion object {
        internal lateinit var plugin: JavaPlugin
    }
    init {
        plugin = this
    }

    override fun onEnable() {
        registerEvents(EventListener)
        CommandCreator.register()
        ConfigLoader.load(server.consoleSender)
    }
}