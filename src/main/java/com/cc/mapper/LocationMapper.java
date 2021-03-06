package com.cc.mapper;
import java.util.*;
import com.cc.entity.Location;
/**
 * location
 */
public interface LocationMapper{
   
	
	/**
	 * 根据条件 查询全部listPageAccount
	 */
	 
	public List<Location> listPageLocation(Location location);
	
	/**
	 *  获取Location的数量
	 */
	public Integer getLocationCount();
	
	
	public void insert(Location location);
	/**
<<<<<<< HEAD
	 *插入
=======
	 *鏈夋潯浠剁殑鏇存柊
>>>>>>> origin/master
	 */
	
	public void insertSelective(Location location);
	/**
	 *鏍规嵁涓婚敭鏈夋潯浠剁殑鏇存柊
	 */
	
	public void updateByPrimaryKeySelective(Location location);
	
	/**
	 * 根据主键查询(唯一)
	 */
	public Location getLocationById(Integer id);
	
	/**
	 * 根据根据条件查询Location 
	 */
	public List<Location> listLocation(Location location);  
	 
	 /**
	 * 更新Location
	 */
	public void updateLocation(Location location);
	
	 /**
	 * 很据实体类删除
	 */
	
	public void  deleteLocation(Location location);
	
	 /**
	 * 根据主键删除
	 */
	public void  deleteLocationByIds (String[] id);
	
}