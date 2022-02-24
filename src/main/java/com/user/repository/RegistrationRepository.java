package com.user.repository;





import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.user.controller.entity.Registration;
@Repository
public interface RegistrationRepository extends JpaRepository<Registration, Long> {

}
