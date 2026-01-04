package com.policyinsur.service;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.List;

import org.springframework.stereotype.Service;

import com.policyinsur.entity.Policy;
import com.policyinsur.repository.PolicyRepository;

@Service
public class AlertService {

    private final PolicyRepository policyRepository;
    private final EmailService emailService;

    public AlertService(PolicyRepository policyRepository,
                        EmailService emailService) {
        this.policyRepository = policyRepository;
        this.emailService = emailService;
    }

    // ✅ ONLY SEND EMAILS (NO RETURN)
    public void sendExpiryAlerts() {

        LocalDate today = LocalDate.now();
        List<Policy> policies = policyRepository.findAll();

        for (Policy policy : policies) {

            if (policy.getEndDate() == null || policy.getClient() == null) {
                continue;
            }

            long daysLeft =
                    ChronoUnit.DAYS.between(today, policy.getEndDate());

            if (daysLeft >= 0 && daysLeft <= 30) {

                emailService.sendAlert(
                        policy.getClient().getEmail(),
                        "Policy Expiry Alert",
                        "Dear " + policy.getClient().getFullName() +
                        ",\n\nYour policy (" + policy.getPolicyNumber() +
                        ") will expire on " + policy.getEndDate() +
                        ".\nPlease renew it before expiry.\n\nRegards,\nPolicyInsur Team"
                );
            }
        }
    }
}
