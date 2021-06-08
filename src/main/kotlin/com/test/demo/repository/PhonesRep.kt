import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository
import javax.transaction.Transactional
import com.test.demo.model.Phones

@Repository
@Transactional(Transactional.TxType.MANDATORY)
interface PhonesRep: JpaRepository<Phones, Long>