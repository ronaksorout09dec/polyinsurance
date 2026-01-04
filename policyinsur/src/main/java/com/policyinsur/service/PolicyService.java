package com.policyinsur.service;

import com.policyinsur.entity.Client;
import com.policyinsur.entity.Policy;
import com.policyinsur.repository.ClientRepository;
import com.policyinsur.repository.PolicyRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PolicyService {

    private final PolicyRepository policyRepository;
    private final ClientRepository clientRepository;

    public PolicyService(PolicyRepository policyRepository,
                         ClientRepository clientRepository) {
        this.policyRepository = policyRepository;
        this.clientRepository = clientRepository;
    }

    public Policy addPolicy(Long clientId, Policy policy) {
        Client client = clientRepository.findById(clientId)
                .orElseThrow(() -> new RuntimeException("Client not found"));

        policy.setClient(client);
        policy.setActive(true);

        return policyRepository.save(policy);
    }

    public List<Policy> getAllPolicies() {
        return policyRepository.findAll();
    }

    public Policy getPolicyById(Long id) {
        return policyRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Policy not found"));
    }
}
