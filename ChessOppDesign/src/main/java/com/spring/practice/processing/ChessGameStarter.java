package com.spring.practice.processing;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.spring.practice.User.Color;
import com.spring.practice.User.User;
import com.spring.practice.member.Member;

public class ChessGameStarter {
	// 유저가 입장하면 처음으로 색깔을 고를 수 있도록 한다.
	// 1. 보드가 생성이 되면 유저를 탐색한다.
	// 처음은 유저가 자동으로 생성이 되지만, 나중에 통신을 통해 유저 유무를 확인 할 수 있도록 대비한다.
	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("hello");
		EntityManager em = emf.createEntityManager();
		EntityTransaction tx = em.getTransaction();
		
		try {
			
			// 생성
			Member member = new Member();
			member.setId(1L);
			member.setName("HelloA");
			
			// 찾기
			//Member findMember = em.find(Member.class, 1L);
			
			
			// 삭제
			// em.remove();
			
			// 수정
			// findmeber.setName("HelloJPA");
			// jpa가 알아서 업데이트 쿼리를 날려준다.
			
			// 모든 결과를 조회하고 싶을 때
			//List<Member> result = em.createQuery("select m from Member as m", Member.Class).setFirstResult(1).getMaxResults(7).getResultList();
			
			//for(Member member : result){
			// 	 System.out.println("member.name = "+ member.getName());
			//}
			
			
			
			
			//영속, 비영속 
			Member memberA = new Member(2L,"A"); // 비영속 상태
			Member memberB = new Member(3L, "B");
			em.persist(memberA); // 영속 상태
			em.persist(memberB); 
			// => 커밋하기 전까지 쌓다가 커밋하는 순간 쿼리가 생성되어 DB에 저장된다. ( 버퍼링 하는 느낌이다. )
			
			
			em.flush(); // 커밋 전 쿼리가 즉시 나감 (DB에 반영) 1차캐시 내용은 지워지지 않음'
			// 플러시는 컨텍스트를 비우지 않음
			// 영속성 컨텍스트의 변경내용을 데이터베이스에 동기화
			// 트랜잭션이라는 작업 단위가 중요-> 커밋 직전에만 동기화 하면 됨
					
			// 변경 ( 변경 감지 ) 1차 캐시에 저장된 스냅샷과 Entity 값을 비교하여 값이 수정되는 경우 UPDATE 쿼리를 발생한다.
			Member memberfind = em.find(Member.class, "A"); // 비영속 상태
			memberfind.setName("ZZZZ");
			
			//준영속 상태로 만드는 법
			// em.detach(memberfind); -> 커밋할 때 DB에 반영되지 않는다.
			
			//em.clear() 영속성 완전 초기화
			
			//em.close() 영속성 컨텍스트를 완전히 닫아버린다.
			
			tx.commit(); // commit을 안하면 의미가 없다.
			
		}catch (Exception e) {
			// TODO: handle exception
			tx.rollback();
		} finally {
			em.close(); // 해줘야 한다.
		}
		
	}

}
