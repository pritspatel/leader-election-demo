package com.prits.leaderelection.leader;

import org.springframework.integration.leader.Candidate;
import org.springframework.integration.leader.Context;
import org.springframework.stereotype.Component;

/**
 * Created by priteshpatel on 3/2/19.
 */
public class LeaderCandidate implements Candidate {
    @Override
    public String getRole() {
        return null;
    }

    @Override
    public String getId() {
        return null;
    }

    @Override
    public void onGranted(Context context) throws InterruptedException {
        System.out.println("*** Leadership granted ***");
    }

    @Override
    public void onRevoked(Context context) {
        System.out.println("*** Leadership revoked ***");
    }
}
