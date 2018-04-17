package me.tarik.commands;

import net.dv8tion.jda.core.EmbedBuilder;
import net.dv8tion.jda.core.entities.MessageEmbed;
import me.tarik.embed.RandomColour;
import java.awt.*;

public class ServerIcon {


    public static MessageEmbed getServerIcon(String x, String y) {

        Color colour = RandomColour.getColour();

        EmbedBuilder em = new EmbedBuilder();
        em.setColor(colour);
        em.setAuthor(x);
        em.setImage(y);

        return em.build();
    }
}
