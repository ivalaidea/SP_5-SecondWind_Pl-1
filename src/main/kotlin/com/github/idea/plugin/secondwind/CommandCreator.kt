package com.github.idea.plugin.secondwind

import com.github.idea.plugin.secondwind.Main.Companion.plugin
import com.github.syari.spigot.api.command.command
import com.github.syari.spigot.api.command.tab.CommandTabArgument.Companion.argument

object CommandCreator {
    fun register() {
        plugin.command("secondwind") {
            tab {
                argument {
                    tab { addAll("enable", "disable", "reload") }
                }
                execute {
                    when (args.lowerOrNull(0)) {
                        "enable" -> {
                            ConfigLoader.isEnable = true
                            ConfigLoader.save()
                            sender.send("&f自動蘇生有効化")
                        }
                        "disable" -> {
                            ConfigLoader.isEnable = false
                            ConfigLoader.save()
                            sender.send("&f自動蘇生無効化")
                        }
                        "reload" -> {
                            ConfigLoader.load(sender)
                            sender.send("&fコンフィグを再読み込みしました")
                        }
                        else -> {
                            sender.send("&c/$label [enable, disable, reload]")
                        }
                    }
                }
            }
        }
    }
}
