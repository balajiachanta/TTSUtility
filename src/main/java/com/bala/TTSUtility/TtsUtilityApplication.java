package com.bala.TTSUtility;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import software.amazon.awssdk.auth.credentials.AwsCredentialsProvider;
import software.amazon.awssdk.auth.credentials.DefaultCredentialsProvider;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import javax.annotation.PostConstruct;

@SpringBootApplication
@EnableSwagger2
@Slf4j
public class TtsUtilityApplication {
	public static void main(String[] args) {
		SpringApplication.run(TtsUtilityApplication.class, args);
	}

	@PostConstruct
	public void init() {
		System.setProperty("java.version","155");
		AwsCredentialsProvider awsCredentialsProvider = DefaultCredentialsProvider.builder().build();
	}
}