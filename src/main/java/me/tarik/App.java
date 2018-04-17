package me.tarik;

import java.util.*;

import com.sun.security.ntlm.Server;
import com.sun.xml.internal.bind.v2.model.core.ID;
import me.tarik.commands.*;


import me.tarik.utility.ServerJoin;
import net.dv8tion.jda.client.entities.Application;
import net.dv8tion.jda.core.*;
import net.dv8tion.jda.core.entities.*;
import net.dv8tion.jda.core.events.message.MessageReceivedEvent;
import net.dv8tion.jda.core.hooks.ListenerAdapter;
import net.dv8tion.jda.core.requests.RestAction;

import javax.security.auth.login.LoginException;

/**
 * Invite: https://discordapp.com/oauth2/authorize?client_id=435233278560305155&scope=bot&permissions=2146958591
 * Token: NDM1MjMzMjc4NTYwMzA1MTU1.DbWEVA.6HhLn14v75qnQ_u7DIm7drpDR6s
 *
 */
public class App extends ListenerAdapter {

    public static void main( String[] args ) throws Exception {

            try {
                JDA jda = new JDABuilder(AccountType.BOT).setToken(Reference.token).buildBlocking();
                jda.getPresence().setGame(Game.streaming(Reference.game, "https://www.twitch.tv/ttxftw"));
                jda.addEventListener(new App());
            } catch (LoginException e) {
                //e.printStackTrace();
                System.out.println("Try again..");
            } catch (InterruptedException e) {
                //e.printStackTrace();
                System.out.println("Try again..");
            }
    }

    @Override
    public void onMessageReceived(MessageReceivedEvent event) {

        User author = event.getAuthor();
        MessageChannel channel = event.getChannel();
        Message msg = event.getMessage();
        Guild server = event.getGuild();


        if (msg.getContentDisplay().equalsIgnoreCase(com("ping"))) {

            channel.sendMessage(author.getAsMention() + " Pong!").queue();
        }
        else if (msg.getContentDisplay().equalsIgnoreCase(com("invite"))) {
            channel.sendMessage(" " + Reference.invite).queue();
        }
        else if (msg.getContentDisplay().equalsIgnoreCase(com("help"))) {
            channel.sendMessage(Help.helpCommand()).queue();
        }
        else if (msg.getContentDisplay().startsWith(com("avatar"))) {

            List<User> mentionedUser = msg.getMentionedUsers();

            if (msg.getMentionedUsers().isEmpty()) {
                channel.sendMessage(Avatar.avatar(author.getAvatarUrl())).queue();
            }
            else {
                channel.sendMessage(Avatar.avatar(mentionedUser.get(0).getAvatarUrl())).queue();
            }

        }
        else if (msg.getContentDisplay().equalsIgnoreCase(com("servericon"))) {

            channel.sendMessage(ServerIcon.getServerIcon(server.getName(), server.getIconUrl())).queue();
        }
        else if (msg.getContentDisplay().equalsIgnoreCase(com("serverinfo"))) {

            channel.sendMessage(ServerInfo.serverinfo(author, channel, msg, server)).queue();
        }

    }

    private static String com(String x) {

        return Reference.prefix + x;

    }

}
