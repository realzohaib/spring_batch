/**
 * 
 */
package com.travel.datapump.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.travel.datapump.entity.Hotel;

/**
 * @author TA Admin
 *
 * 
 */
@Repository
public interface HotelRepository extends JpaRepository<Hotel, Integer> {

}
