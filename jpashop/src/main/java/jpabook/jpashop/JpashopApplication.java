package jpabook.jpashop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JpashopApplication {

	public static void main(String[] args) {

		//lombok 적용 확인
//		Hello hello = new Hello();
//		hello.setData("Hello");
//		String data = hello.getData();
//		System.out.println("data: " + data);

		SpringApplication.run(JpashopApplication.class, args);
	}

}
