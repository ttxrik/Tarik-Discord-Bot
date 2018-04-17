package me.tarik.commands;

import me.tarik.embed.RandomColour;
import net.dv8tion.jda.core.EmbedBuilder;
import net.dv8tion.jda.core.Region;
import net.dv8tion.jda.core.entities.*;

import java.awt.*;

public class Invite {

    public static MessageEmbed invite() {

        // https://discordapp.com/oauth2/authorize?client_id=435233278560305155&scope=bot&permissions=2146958591

        String invite = "https://discordapp.com/oauth2/authorize?client_id=435233278560305155&scope=bot&permissions=2146958591";

        Color colour = RandomColour.getColour();

        EmbedBuilder em = new EmbedBuilder();

        em.setColor(colour);
        em.setAuthor("Click here for an invite", "https://discordapp.com/oauth2/authorize?client_id=435233278560305155&scope=bot&permissions=2146958591");

        return em.build();

    }


}
