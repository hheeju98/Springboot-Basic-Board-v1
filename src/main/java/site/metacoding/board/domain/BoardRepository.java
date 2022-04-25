package site.metacoding.board.domain;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import lombok.RequiredArgsConstructor;

// interface로 안만들고 클래스로!!
@RequiredArgsConstructor
@Repository
public class BoardRepository {
    // 아래 클래스로 직접 쿼리를 작성할 수 있다.
    private final EntityManager em;

    // 이렇게 직접 쿼리를 써서 작성한뒤 실행 할 수 있다.
    @Transactional
    public void insertOne() {
        // 트랜잭션 시작
        // em.getTransaction().begin();

        // 1. 쿼리 작성
        StringBuffer sb = new StringBuffer();
        sb.append("INSERT INTO board(title, content, nickname) VALUES(?,?,?)");

        // 2. 쿼리 준비
        Query query = em.createNativeQuery(sb.toString())
                .setParameter(1, "블로그1강 - 환경세팅")
                .setParameter(2, "환경세팅하는 방법은 무엇무엇입니다.")
                .setParameter(3, "메타코딩");

        // 3. 쿼리 실행
        query.executeUpdate();

        // 트랜잭션 종료 (@Transactional과 동일한 일을 함)
        // em.getTransaction().commit();

    }

    public void selectAll() {

    }

    public void selectOne() {

    }

    public void updateOne() {

    }

    public void deleteOne() {

    }
}
