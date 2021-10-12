package com.spring.practice.processing;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.spring.practice.User.Color;
import com.spring.practice.User.User;
import com.spring.practice.member.Member;

public class ChessGameStarter {
	// ������ �����ϸ� ó������ ������ �� �� �ֵ��� �Ѵ�.
	// 1. ���尡 ������ �Ǹ� ������ Ž���Ѵ�.
	// ó���� ������ �ڵ����� ������ ������, ���߿� ����� ���� ���� ������ Ȯ�� �� �� �ֵ��� ����Ѵ�.
	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("hello");
		EntityManager em = emf.createEntityManager();
		EntityTransaction tx = em.getTransaction();
		
		try {
			
			// ����
			Member member = new Member();
			member.setId(1L);
			member.setName("HelloA");
			
			// ã��
			//Member findMember = em.find(Member.class, 1L);
			
			
			// ����
			// em.remove();
			
			// ����
			// findmeber.setName("HelloJPA");
			// jpa�� �˾Ƽ� ������Ʈ ������ �����ش�.
			
			// ��� ����� ��ȸ�ϰ� ���� ��
			//List<Member> result = em.createQuery("select m from Member as m", Member.Class).setFirstResult(1).getMaxResults(7).getResultList();
			
			//for(Member member : result){
			// 	 System.out.println("member.name = "+ member.getName());
			//}
			
			
			
			
			//����, �񿵼� 
			Member memberA = new Member(2L,"A"); // �񿵼� ����
			Member memberB = new Member(3L, "B");
			em.persist(memberA); // ���� ����
			em.persist(memberB); 
			// => Ŀ���ϱ� ������ �״ٰ� Ŀ���ϴ� ���� ������ �����Ǿ� DB�� ����ȴ�. ( ���۸� �ϴ� �����̴�. )
			
			
			em.flush(); // Ŀ�� �� ������ ��� ���� (DB�� �ݿ�) 1��ĳ�� ������ �������� ����'
			// �÷��ô� ���ؽ�Ʈ�� ����� ����
			// ���Ӽ� ���ؽ�Ʈ�� ���泻���� �����ͺ��̽��� ����ȭ
			// Ʈ������̶�� �۾� ������ �߿�-> Ŀ�� �������� ����ȭ �ϸ� ��
					
			// ���� ( ���� ���� ) 1�� ĳ�ÿ� ����� �������� Entity ���� ���Ͽ� ���� �����Ǵ� ��� UPDATE ������ �߻��Ѵ�.
			Member memberfind = em.find(Member.class, "A"); // �񿵼� ����
			memberfind.setName("ZZZZ");
			
			//�ؿ��� ���·� ����� ��
			// em.detach(memberfind); -> Ŀ���� �� DB�� �ݿ����� �ʴ´�.
			
			//em.clear() ���Ӽ� ���� �ʱ�ȭ
			
			//em.close() ���Ӽ� ���ؽ�Ʈ�� ������ �ݾƹ�����.
			
			tx.commit(); // commit�� ���ϸ� �ǹ̰� ����.
			
		}catch (Exception e) {
			// TODO: handle exception
			tx.rollback();
		} finally {
			em.close(); // ����� �Ѵ�.
		}
		
	}

}
