package com.example.sandbox.repository;

import com.example.sandbox.entity.Test;
import com.example.sandbox.entity.TestId;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TestRepo extends JpaRepository<Test, TestId> {
}
