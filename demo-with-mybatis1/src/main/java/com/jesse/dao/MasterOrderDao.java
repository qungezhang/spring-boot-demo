package com.jesse.dao;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Update;

import com.jesse.bean.MasterOrder;

/**
 * 将Dao文件和mapper.xml文件放在一起，可自动扫描
 * 
 * @author xujianxing
 *
 */

public interface MasterOrderDao {

	@Update("update   master_order   set  order_status=#{newOrderStatus}   where  order_id=#{orderId}")
	public int updateOrderStatus(@Param("orderId") String orderId,
			@Param("newOrderStatus") int newOrderStatus);

	@Insert(value = { "insert into master_order(order_id,customer_user_id,order_status,order_type,create_time,shot_date,city_id,deadline_time,is_addsheet,is_show,service_user_id)   "
			+ "values(#{orderId},#{customerUserId},#{orderStatus},#{orderType},#{createTime},#{shotDate},#{cityId},#{deadlineTime},#{isAddsheet},#{isShow},#{serviceUserId})" })
	@Options(useGeneratedKeys = true, keyProperty = "id", keyColumn = "id")
	public int insert(MasterOrder masterOrder);

}
