package me.tarik.utility;

import net.dv8tion.jda.core.EmbedBuilder;
import net.dv8tion.jda.core.entities.Channel;
import net.dv8tion.jda.core.entities.MessageEmbed;
import net.dv8tion.jda.core.entities.TextChannel;
import net.dv8tion.jda.core.events.guild.GuildJoinEvent;
import me.tarik.embed.RandomColour;
import net.dv8tion.jda.core.hooks.ListenerAdapter;

import java.awt.*;

public class ServerJoin extends ListenerAdapter {

    public void onGuildJoin(GuildJoinEvent event) {

        Channel channel = event.getGuild().getDefaultChannel();

        ((TextChannel) channel).sendMessage(onJoinMsg(channel));


    }

     MessageEmbed onJoinMsg(Channel ch) {

        EmbedBuilder embed = new EmbedBuilder();
        Color colour = new Color(RandomColour.getRed(), RandomColour.getGreen(), RandomColour.getBlue());

        String servername = ch.getGuild().getName();
        String msg = "Thank you for adding me to " + servername + "!\n\nI'm currently under development!";

        embed.setColor(colour);
        embed.setAuthor("Tarik Discord Bot");
        embed.addField("Hi,", msg, true);


        return embed.build();
    }
}
