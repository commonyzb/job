package com.job;

import org.apache.ibatis.session.SqlSession;


public class DaoTest {

	public static void main(String[] args) {
		// 定义SqlSession变量
		SqlSession sqlSession = null;
		try {
			// 创建SqlSession实例
			sqlSession = MySqlSessionFactory.getSqlSession();
			
			// 创建Mapper实例
		
			// 创建对象并设置属性
					
			// 插入数据
			
			// 查看插入数据生成的主键
			System.out.println("插入数据生成的主键id为：");
			
			// 提交事务
			sqlSession.commit();
		} catch (Exception e) {
			// 回滚事务
			sqlSession.rollback();
			e.printStackTrace();
		}finally {
			// 关闭SqlSession
			if(sqlSession != null) 
				sqlSession.close();
		}
	}

}

