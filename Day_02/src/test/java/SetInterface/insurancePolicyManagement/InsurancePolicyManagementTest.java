package SetInterface.insurancePolicyManagement;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.*;
import static org.junit.jupiter.api.Assertions.*;

class InsurancePolicyManagementTest {
    private InsurancePolicyManagement system;

    @BeforeEach
    public void setUp() {
        system = new InsurancePolicyManagement();
        system.addPolicy(new InsurancePolicy("P1001", "John Doe", new Date(125, 5, 15), "Health", 500.0));
        system.addPolicy(new InsurancePolicy("P1002", "Jane Smith", new Date(124, 2, 10), "Auto", 750.0));
        system.addPolicy(new InsurancePolicy("P1003", "John Doe", new Date(124, 2, 20), "Home", 1000.0));
    }

    @Test
    public void testAddPolicy() {
        int initialSize = system.getAllPolicies().size();
        system.addPolicy(new InsurancePolicy("P1004", "Alice Brown", new Date(126, 8, 12), "Life", 1200.0));
        assertEquals(initialSize + 1, system.getAllPolicies().size());
    }

    @Test
    public void testGetAllPolicies() {
        Set<InsurancePolicy> policies = system.getAllPolicies();
        assertNotNull(policies);
        assertEquals(3, policies.size());
    }

    @Test
    public void testGetExpiringSoon() {
        Set<InsurancePolicy> expiring = system.getExpiringSoon(new Date(124, 1, 20));
        assertTrue(expiring.size() > 0);
        for (InsurancePolicy policy : expiring) {
            assertTrue(policy.getExpiryDate().compareTo(new Date(124, 2, 20)) <= 0);
        }
    }

    @Test
    public void testGetByCoverageType() {
        Set<InsurancePolicy> healthPolicies = system.getByCoverageType("Health");
        assertEquals(1, healthPolicies.size());
        assertTrue(healthPolicies.stream().allMatch(p -> p.getCoverageType().equalsIgnoreCase("Health")));
    }



}