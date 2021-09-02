package com.example.sendgriddemo.repositoty.jpa;

import com.example.sendgriddemo.repositoty.schema.EmailConfigEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;
import java.util.UUID;

public interface EmailConfigRepository extends JpaRepository<EmailConfigEntity, UUID> {

  Optional<EmailConfigEntity> findByEmailCode(String code);

}
