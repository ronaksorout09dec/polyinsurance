package com.policyinsur.dto;

import java.time.LocalDate;

public class AlertResponse {

    private String policyNumber;
    private String clientName;
    private LocalDate endDate;
    private int daysLeft;

    // ✅ REQUIRED CONSTRUCTOR (THIS FIXES THE ERROR)
    public AlertResponse(String policyNumber,
                         String clientName,
                         LocalDate endDate,
                         int daysLeft) {
        this.policyNumber = policyNumber;
        this.clientName = clientName;
        this.endDate = endDate;
        this.daysLeft = daysLeft;
    }

    public String getPolicyNumber() {
        return policyNumber;
    }

    public String getClientName() {
        return clientName;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public int getDaysLeft() {
        return daysLeft;
    }
}
