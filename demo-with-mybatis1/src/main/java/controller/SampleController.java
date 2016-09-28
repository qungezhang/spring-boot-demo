package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.ImportResource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import service.MasterOrderService;

@Controller
@EnableAutoConfiguration
@ComponentScan(basePackages = { "service" })
@ImportResource("mybatis.xml")
public class SampleController {
	@Autowired
	private MasterOrderService masterOrderService;

	@RequestMapping("/order")
	@ResponseBody
	String home(@RequestParam("orderId") String orderId,
			@RequestParam("newOrderStatus") int newOrderStatus) {
		return String.valueOf(masterOrderService
				.update(orderId, newOrderStatus));
	}

	public static void main(String[] args) throws Exception {
		SpringApplication.run(SampleController.class, args);
	}
}
