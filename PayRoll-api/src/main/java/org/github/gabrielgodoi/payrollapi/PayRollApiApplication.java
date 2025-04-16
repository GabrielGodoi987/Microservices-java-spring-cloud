package org.github.gabrielgodoi.payrollapi;

import com.netflix.discovery.EurekaNamespace;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
@EnableDiscoveryClient
public class PayRollApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(PayRollApiApplication.class, args);
	}

}
