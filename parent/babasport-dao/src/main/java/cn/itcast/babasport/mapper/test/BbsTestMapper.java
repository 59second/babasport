package cn.itcast.babasport.mapper.test;

import java.util.List;

import cn.itcast.babasport.pojo.BbsTest;

public interface BbsTestMapper {
	public void insertBbsTest(BbsTest bbsTest);
	public List<BbsTest> selectBbsTest();
}
