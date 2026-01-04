package com.policyinsur.controller;

import com.policyinsur.entity.Policy;
import com.policyinsur.service.PolicyService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/policies")
public class PolicyController {

    private final PolicyService policyService;

    public PolicyController(PolicyService policyService) {
        this.policyService = policyService;
    }

    @PostMapping("/{clientId}")
    public Policy addPolicy(@PathVariable Long clientId,
                            @RequestBody Policy policy) {
        return policyService.addPolicy(clientId, policy);
    }

    @GetMapping
    public List<Policy> getAll() {
        return policyService.getAllPolicies();
    }

    @GetMapping("/{id}")
    public Policy getById(@PathVariable Long id) {
        return policyService.getPolicyById(id);
    }
}
