/**
 * 
 */
package com.travel.datapump.dao;

import org.springframework.batch.item.ItemWriter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.travel.datapump.entity.Hotel;
import com.travel.datapump.repository.HotelRepository;

import java.util.List;

/**
 * @author TA Admin
 *
 * 
 */
@Component
public class DBWriter implements ItemWriter<Hotel> {

	private HotelRepository hotelRepository;

	@Autowired
	public DBWriter(HotelRepository hotelRepository) {
		this.hotelRepository = hotelRepository;
	}

	@Override
	public void write(List<? extends Hotel> hotelEntity) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Data Saved ");
		hotelRepository.saveAll(hotelEntity);
	}

}
