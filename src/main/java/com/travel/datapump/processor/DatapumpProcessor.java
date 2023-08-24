package com.travel.datapump.processor;

import org.springframework.batch.item.ItemProcessor;
import org.springframework.stereotype.Component;

import com.travel.datapump.entity.Center;
import com.travel.datapump.entity.CountryName;
import com.travel.datapump.entity.Hotel;
import com.travel.datapump.entity.Name;

@Component
public class DatapumpProcessor implements ItemProcessor<Hotel, Hotel> {

	@Override
	public Hotel process(Hotel item) throws Exception {
		
		  CountryName countryName = new CountryName();
		  countryName.setAr(item.getCountryname().getAr());
		  countryName.setBg(item.getCountryname().getBg());
		  countryName.setDe(item.getCountryname().getDe());
		  countryName.setEl(item.getCountryname().getEl());
		  countryName.setEn(item.getCountryname().getEn());
		  countryName.setEs(item.getCountryname().getEs());
		  countryName.setFr(item.getCountryname().getFr());
		  countryName.setHu(item.getCountryname().getHu());
		  countryName.setIt(item.getCountryname().getIt());
		  countryName.setPl(item.getCountryname().getPl());
		  countryName.setPt(item.getCountryname().getPt());
		  countryName.setRo(item.getCountryname().getRo());
		  countryName.setRu(item.getCountryname().getRu());
		  countryName.setSq(item.getCountryname().getSq());
		  countryName.setSr(item.getCountryname().getSr());
		  countryName.setTr(item.getCountryname().getTr());
		  
		  Center center = new Center();
		  center.setLongitude(item.getCenter().getLongitude());
		  center.setLatitude(item.getCenter().getLatitude());
		  
		  Hotel hotelEntity = new Hotel(); 
		  hotelEntity.setCountryname(countryName);
		  hotelEntity.setId(item.getId());
		  hotelEntity.setCountrycode(item.getCountrycode());
		  hotelEntity.setCenter(center); hotelEntity.setHotels(item.getHotels());
		  hotelEntity.setIata(item.getIata()); hotelEntity.setType(item.getType());
		  
		  Name name = new Name();
		  
		  name.setAr(item.getName().getAr()); name.setBg(item.getName().getBg());
		  name.setDe(item.getName().getDe()); name.setEl(item.getName().getEl());
		  name.setEn(item.getName().getEn()); name.setEs(item.getName().getEs());
		  name.setFr(item.getName().getFr()); name.setHu(item.getName().getHu());
		  name.setIt(item.getName().getIt()); name.setPl(item.getName().getPl());
		  name.setPt(item.getName().getPt()); name.setRo(item.getName().getRo());
		  name.setRu(item.getName().getRu()); name.setSq(item.getName().getSq());
		  name.setSr(item.getName().getSr()); name.setTr(item.getName().getTr());
		  
		  hotelEntity.setName(name);
		 

		return hotelEntity;
	}
}


		/*	@Override
			public Hotel process(Map<String, Object> item) throws Exception {
				Hotel hotel= new Hotel();
				hotel.setCountryName((Map<String, String>) item.get("countryName"));
				hotel.setCountrycode((String) item.get("countrycode"));
				 Map<String, Double>center = new HashMap<>();
				 center.put("longitude", (Double) item.get("longitude"));
			        center.put("latitude", (Double) item.get("latitude"));
			        hotel.setCenter(center);
			        hotel.setHotels((List<String>) item.get("hotels"));
			        hotel.setIata((String) item.get("iata"));
			        hotel.setId((Integer) (item.get("id")));
			        hotel.setType((String) item.get("type"));
			        hotel.setName((Map<String, String>) item.get("name"));
			        return hotel;
			}
}
*/				 
		
