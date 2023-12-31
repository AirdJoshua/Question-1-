package com.developer.JoshuaAird.repo;

import com.developer.JoshuaAird.en.ItemEn;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ItemRepo extends JpaRepository<EmployeeEntity, Long> {
}