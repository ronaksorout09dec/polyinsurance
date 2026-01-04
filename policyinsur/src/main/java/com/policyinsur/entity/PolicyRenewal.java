//package com.policyinsur.entity;
//
//import jakarta.persistence.*;
//import java.time.LocalDate;
//
//@Entity
//@Table(name = "policy_renewals")
//public class PolicyRenewal {
//
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private Long id;
//
//    // Many renewals -> One policy
//    @ManyToOne
//    @JoinColumn(name = "policy_id", nullable = false)
//    private Policy policy;
//
//    @Column(nullable = false)
//    private LocalDate oldEndDate;
//
//    @Column(nullable = false)
//    private LocalDate newStartDate;
//
//    @Column(nullable = false)
//    private LocalDate newEndDate;
//
//    private Double renewalAmount;
//
//    private LocalDate renewedOn = LocalDate.now();
//
//    @Column(columnDefinition = "TEXT")
//    private String remarks;
//
//    // -------- Getters & Setters --------
//
//    public Long getId() {
//        return id;
//    }
//
//    public Policy getPolicy() {
//        return policy;
//    }
//
//    public void setPolicy(Policy policy) {
//        this.policy = policy;
//    }
//
//    public LocalDate getOldEndDate() {
//        return oldEndDate;
//    }
//
//    public void setOldEndDate(LocalDate oldEndDate) {
//        this.oldEndDate = oldEndDate;
//    }
//
//    public LocalDate getNewStartDate() {
//        return newStartDate;
//    }
//
//    public void setNewStartDate(LocalDate newStartDate) {
//        this.newStartDate = newStartDate;
//    }
//
//    public LocalDate getNewEndDate() {
//        return newEndDate;
//    }
//
//    public void setNewEndDate(LocalDate newEndDate) {
//        this.newEndDate = newEndDate;
//    }
//
//    public Double getRenewalAmount() {
//        return renewalAmount;
//    }
//
//    public void setRenewalAmount(Double renewalAmount) {
//        this.renewalAmount = renewalAmount;
//    }
//
//    public LocalDate getRenewedOn() {
//        return renewedOn;
//    }
//
//    public void setRenewedOn(LocalDate renewedOn) {
//        this.renewedOn = renewedOn;
//    }
//
//    public String getRemarks() {
//        return remarks;
//    }
//
//    public void setRemarks(String remarks) {
//        this.remarks = remarks;
//    }
//}
