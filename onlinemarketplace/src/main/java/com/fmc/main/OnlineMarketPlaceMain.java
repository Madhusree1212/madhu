package com.fmc.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.fmc.config.OnlineMarketplaceConfig;
import com.fmc.service.OnlineMarketplaceService;

public class OnlineMarketPlaceMain {
	public static void main(String[] args) {
		ApplicationContext context=new AnnotationConfigApplicationContext(OnlineMarketplaceConfig.class);
		OnlineMarketplaceService o=context.getBean(OnlineMarketplaceService.class);
		o.add();
		o.remove();
		o.caluclate(10);
	}
}
