package com.prits.leaderelection.leader;

import org.springframework.integration.leader.Context;
import org.springframework.integration.leader.DefaultCandidate;
import org.springframework.stereotype.Component;

/**
 * Created by priteshpatel on 3/2/19.
 */
@Component
public class LeaderCandidate extends DefaultCandidate {

    @Override
    public void onGranted(Context context) {
        super.onGranted(context);
        System.out.println("*** Leadership granted ***");
    }

    @Override
    public void onRevoked(Context context) {
        super.onRevoked(context);
        System.out.println("*** Leadership revoked ***");
    }
}
