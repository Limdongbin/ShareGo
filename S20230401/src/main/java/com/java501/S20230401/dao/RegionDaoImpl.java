package com.java501.S20230401.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.java501.S20230401.model.Region;

import lombok.RequiredArgsConstructor;

@Repository
@RequiredArgsConstructor

public class RegionDaoImpl implements RegionDao {
	
	private final SqlSession session;
	
	@Override
	public List<Region> regionName() {
		List<Region> regionList = null;
		System.out.println("RegionDaoImpl regionName Start..");
		regionList = session.selectList("tkSelectRegion");
		System.out.println("RegionDaoImpl regionList.size()=> " + regionList.size());
		return regionList;
	}

}
