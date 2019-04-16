package com.outlook.tehbrian.tfcplugin.commands;

import co.aikar.commands.BaseCommand;
import co.aikar.commands.annotation.*;
import com.outlook.tehbrian.tfcplugin.Utils;
import com.outlook.tehbrian.tfcplugin.Main;
import com.outlook.tehbrian.tfcplugin.Misc;
import org.bukkit.Bukkit;
import org.bukkit.command.CommandSender;

@CommandAlias("emote|emotes")
@Description("Various fun chat emotes.")
public class EmoteCommand extends BaseCommand {

    private final Main main;

    public EmoteCommand(Main main) {
        this.main = main;
    }

    @CommandAlias("shrug")
    @CommandPermission("tfcplugin.shrug")
    @Description("You don't know. They don't know.")
    public void onShrug(CommandSender sender) {
        Bukkit.broadcastMessage(Utils.emote(sender, Utils.format(Utils.PrefixType.NONE,"msg_shrug")));
    }

    @CommandAlias("doubt")
    @CommandPermission("tfcplugin.doubt")
    @Description("Press X to doubt.")
    public void onDoubt(CommandSender sender) {
        Bukkit.broadcastMessage(Utils.emote(sender, Utils.format(Utils.PrefixType.NONE, "msg_doubt")));
    }

    @CommandAlias("blame")
    @CommandPermission("tfcplugin.blame")
    @Description("They did something wrong. Blame them!")
    public void onBlame(CommandSender sender, String text) {
        Bukkit.broadcastMessage(Utils.emote(sender, Utils.format(Utils.PrefixType.NONE, "msg_blame", text)));
    }

    @CommandAlias("sue")
    @CommandPermission("tfcplugin.sue")
    @Description("Sue them! It fixes everything.")
    public void onSue(CommandSender sender, String text) {
        Bukkit.broadcastMessage(Utils.emote(sender, Utils.format(Utils.PrefixType.NONE, "msg_sue", text)));
    }

    @HelpCommand
    public void onHelp(CommandSender sender) {
        sender.sendMessage(Utils.format("msg_emote_help"));
    }
}
