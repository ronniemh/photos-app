package dev.ronniemoncayo.photoapp.api.users.PhotosAppApiUsers;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class PhotosAppApiUsersApplication {

	public static void main(String[] args) {
		SpringApplication.run(PhotosAppApiUsersApplication.class, args);
	}

}
