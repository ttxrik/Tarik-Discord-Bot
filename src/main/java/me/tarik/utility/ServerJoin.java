package me.tarik.utility;

import net.dv8tion.jda.*;
import net.dv8tion.jda.core.EmbedBuilder;
import net.dv8tion.jda.core.entities.Channel;
import net.dv8tion.jda.core.entities.MessageEmbed;
import net.dv8tion.jda.core.entities.TextChannel;
import net.dv8tion.jda.core.events.guild.GuildJoinEvent;
import me.tarik.embed.RandomColour;

import java.awt.*;

public class ServerJoin {

    @Override
    public void onGuildJoin(GuildJoinEvent event) {

        Channel channel = event.getGuild().getDefaultChannel();

        EmbedBuilder embed = new EmbedBuilder();
        Color colour = new Color(RandomColour.getRed(), RandomColour.getGreen(), RandomColour.getBlue());
        embed.setColor(colour);

    }

    private MessageEmbed onJoinMsg(Channel ch) {

        EmbedBuilder embed = new EmbedBuilder();
        Color colour = new Color(RandomColour.getRed(), RandomColour.getGreen(), RandomColour.getBlue());

        embed.setColor(colour);
        embed.setAuthor("Thank you for inviting Tarik Bot to " + ch.getGuild().)


        return embed.build();
    }
}
