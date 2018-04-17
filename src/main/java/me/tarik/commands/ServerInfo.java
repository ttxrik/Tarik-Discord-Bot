package me.tarik.commands;

import me.tarik.embed.RandomColour;
import net.dv8tion.jda.core.EmbedBuilder;
import net.dv8tion.jda.core.Region;
import net.dv8tion.jda.core.entities.*;

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

        Color colour = RandomColour.getColour();



        EmbedBuilder embed = new EmbedBuilder();


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