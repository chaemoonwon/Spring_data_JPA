package study.data_jpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import study.data_jpa.entity.Team;

public interface TeamRepository extends JpaRepository<Team, Long> {
        //Spirng data jpa가 TeamRepository구현 클래스를 만들어서 Injection 해줌
}
