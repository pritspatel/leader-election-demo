package com.prits.leaderelection.leader;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.integration.leader.Context;
import org.springframework.integration.leader.DefaultCandidate;
import org.springframework.messaging.Message;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Component;

/**
 * Created by priteshpatel on 3/2/19.
 */
@Component
public class LeaderCandidate extends DefaultCandidate {

    @Autowired
    @Qualifier("systemMsgChannel")
    private MessageChannel systemMessageChannel;

    @Override
    public void onGranted(Context context) {
        super.onGranted(context);
        System.out.println("*** Leadership granted ***");
        System.out.println("STARTING JDBC POLLER");
        Message<String> startMsg = MessageBuilder.withPayload("@jdbcPoller.start()").build();
        systemMessageChannel.send(startMsg);
        System.out.println("STARTUP MESSAGE SENT");

    }

    @Override
    public void onRevoked(Context context) {
        super.onRevoked(context);
        System.out.println("*** Leadership revoked ***");
        System.out.println("STOPPING JDBC POLLER");
        Message<String> stringMessage = MessageBuilder.withPayload("@jdbcPoller.stop()").build();
        systemMessageChannel.send(stringMessage);
        System.out.println("SHUTDOWN MESSAGE SENT");
    }
}
