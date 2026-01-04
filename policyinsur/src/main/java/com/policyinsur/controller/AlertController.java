package com.policyinsur.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.policyinsur.service.AlertService;

@RestController
@RequestMapping("/api/alerts")
public class AlertController {

    private final AlertService alertService;

    public AlertController(AlertService alertService) {
        this.alertService = alertService;
    }

    // ✅ FIXED: no void return
    @GetMapping("/send-email")
    public String sendAlertEmails() {

        alertService.sendExpiryAlerts();
        return "Alert emails processed successfully";
    }
}
