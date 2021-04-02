package com.github.idea.plugin.secondwind

import com.github.syari.spigot.api.event.EventRegister
import com.github.syari.spigot.api.event.Events
import org.bukkit.event.entity.EntityResurrectEvent

object EventListener : EventRegister {
    override fun Events.register() { //(ignoreCancelled = true)
        event<EntityResurrectEvent> {
            val entity = it.entity.isOp
            if (entity && ConfigLoader.isEnable) {
                it.isCancelled = false
            }
        }
    }
}