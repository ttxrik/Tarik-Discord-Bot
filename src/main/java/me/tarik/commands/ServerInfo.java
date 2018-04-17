package me.tarik.commands;

import com.sun.jna.IntegerType;
import me.tarik.embed.RandomColour;
import net.dv8tion.jda.core.EmbedBuilder;
import net.dv8tion.jda.core.JDA;
import net.dv8tion.jda.core.OnlineStatus;
import net.dv8tion.jda.core.Region;
import net.dv8tion.jda.core.entities.*;
import net.dv8tion.jda.core.events.message.MessageReceivedEvent;
import net.dv8tion.jda.core.hooks.ListenerAdapter;

import java.awt.*;

public class ServerInfo {

    public static MessageEmbed serverinfo(User au, MessageChannel ch, Message me, Guild gu) {

        User author = au;
        MessageChannel channel = ch;
        Message msg = me;
        Guild server = gu;

        // String serverCreated = server.getCreationTime(); For later
        //Add bots
        /// Add online members
        // Add server owner id
        String servername = server.getName();
        String serverID = server.getId();
        Region servregion = server.getRegion();
        Guild.VerificationLevel verificationlvl = server.getVerificationLevel();
        int roles = server.getRoles().size();
        String serverowner = server.getOwner().getEffectiveName();
        //OnlineStatus ownerstatus = serverowner.getOnlineStatus(); (Not really needed)
        int totalusrs = server.getMembers().size();

        String totalusers = Integer.toString(totalusrs);
        String serverroles = Integer.toString(roles);
        String verificationlevel = verificationlvl.toString();
        String serverregion = servregion.toString();



        EmbedBuilder embed = new EmbedBuilder();
        Color colour = new Color(RandomColour.getRed(), RandomColour.getGreen(), RandomColour.getBlue());


        embed.setColor(colour);
        embed.setAuthor(server.getName(), null, server.getIconUrl());
        embed.setImage(server.getIconUrl());
        embed.addField("Server Name", servername, true);
        embed.addField("Server ID", serverID, true);
        embed.addField("Server Region", serverregion, true);
        embed.addField("Verification Level", verificationlevel, true);
        embed.addField("Total Roles", serverroles, true);
        embed.addField("Server Owner", serverowner, true);
        embed.addField("Total Users", totalusers, true);

        return embed.build();

    }

}