package lt.vytautas.repo;

import lt.vytautas.domain.Beneficiary;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BeneficiaryRepo extends JpaRepository<Beneficiary, Long> {
}
