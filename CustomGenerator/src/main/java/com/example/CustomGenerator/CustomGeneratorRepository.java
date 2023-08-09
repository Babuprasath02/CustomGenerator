package com.example.CustomGenerator;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.CustomGenerator.entity.CustomGenerator;
@Repository
public interface CustomGeneratorRepository extends JpaRepository<CustomGenerator, Serializable>{

}
