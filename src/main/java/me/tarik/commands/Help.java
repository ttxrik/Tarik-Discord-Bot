package me.tarik.commands;

import net.dv8tion.jda.core.EmbedBuilder;
import net.dv8tion.jda.core.entities.*;
import java.awt.*;

public class Help {



    public static MessageEmbed helpCommand() {



        String help = ".help - returns this command\n\n" +
                ".ping - returns pong!\n\n" +
                ".invite - returns an invite link.";

        EmbedBuilder em = new EmbedBuilder();

        em.setColor(Color.red);
        em.setAuthor("Tarik Bot v2", "https://discordapp.com", "https://pbs.twimg.com/profile_images/833767319973212161/Ft904pMk_400x400.jpg");
        em.setTitle("Help");
        em.setDescription(help);

        return em.build();



    }


}

