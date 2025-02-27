package com.example.breadbook.domain.member.repository;

import com.example.breadbook.domain.member.model.EmailVerify;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface EmailVerifyRepository extends JpaRepository<EmailVerify, Long> {
    Optional<EmailVerify> findByUuid(String uuid);
}