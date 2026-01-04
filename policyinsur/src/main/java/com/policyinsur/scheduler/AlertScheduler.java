package com.policyinsur.scheduler;

import com.policyinsur.service.AlertService;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class AlertScheduler {

    private final AlertService alertService;

    public AlertScheduler(AlertService alertService) {
        this.alertService = alertService;
    }

    @Scheduled(cron = "0 0 9 * * ?")
    public void runDailyAlerts() {
        alertService.sendExpiryAlerts();
    }
}
