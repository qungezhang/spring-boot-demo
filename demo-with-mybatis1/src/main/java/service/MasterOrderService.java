package service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jesse.dao.MasterOrderDao;

@Service
public class MasterOrderService {

	@Autowired
	private MasterOrderDao masterOrderDao;

	public int update(String orderId, int newOrderStatus) {

		return masterOrderDao.updateOrderStatus(orderId, newOrderStatus);

	}

}
