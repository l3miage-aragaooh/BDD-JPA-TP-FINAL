package fr.uga.l3miage.tp4.repositorys;

import fr.uga.l3miage.tp4.models.EcosSessionProgrammationEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EcosSessionProgrammationRepository extends JpaRepository<EcosSessionProgrammationEntity, Long> {
}
