/*
 * 
 */
package com.travel.datapump.config;

import org.springframework.batch.core.Job;
import org.springframework.batch.core.Step;
import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.batch.core.configuration.annotation.JobBuilderFactory;
import org.springframework.batch.core.configuration.annotation.StepBuilderFactory;
import org.springframework.batch.core.launch.support.RunIdIncrementer;
import org.springframework.batch.item.ItemProcessor;
import org.springframework.batch.item.ItemReader;
import org.springframework.batch.item.ItemWriter;
import org.springframework.batch.item.json.JacksonJsonObjectReader;
import org.springframework.batch.item.json.JsonItemReader;
import org.springframework.batch.item.json.builder.JsonItemReaderBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;
import org.springframework.scheduling.annotation.EnableScheduling;

import com.travel.datapump.entity.Hotel;

@Configuration
@EnableBatchProcessing
@EnableScheduling
public class DatapumpBatchConfig {

	@Bean
	public Job job(JobBuilderFactory jobBuilderFactory, StepBuilderFactory stepBuilderFactory,
			ItemReader<Hotel> itemReader, ItemProcessor<Hotel, Hotel> itemProcessor, ItemWriter<Hotel> itemWriter) {

		Step step = stepBuilderFactory.get("My-First-Step")
				.<Hotel, Hotel>chunk(100)
				.reader(itemReader)
				.processor(itemProcessor)
				.writer(itemWriter)
				.faultTolerant()
				.skip(Throwable.class)
				.skipLimit(Integer.MAX_VALUE)
				.build();
		return jobBuilderFactory.get("ETL-Load")
				.incrementer(new RunIdIncrementer())
				.start(step)
				.build();
	}

	 @Bean
	public JsonItemReader<Hotel> itemReader() {
		return new JsonItemReaderBuilder<Hotel>().name("hotelJsonItemReader")
				.jsonObjectReader(new JacksonJsonObjectReader<>(Hotel.class))
				.resource(new ClassPathResource("region.json")).build();
	}

	}
