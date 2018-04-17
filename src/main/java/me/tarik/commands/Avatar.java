package me.tarik.commands;

import net.dv8tion.jda.core.*;
import net.dv8tion.jda.core.entities.MessageEmbed;
import me.tarik.embed.RandomColour;
import java.awt.*;

public class Avatar extends RandomColour {

    public static MessageEmbed avatar(String x) {

        Color colour = new Color(RandomColour.getRed(), RandomColour.getGreen(), RandomColour.getBlue());
        EmbedBuilder em = new EmbedBuilder();
        em.setColor(colour);
        em.setImage(x);

        return em.build();

    }

}
