package com.example.springrestsqlpostgresql.repository;

import com.example.springrestsqlpostgresql.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {
    Produto save(Produto produto);

    List<Produto> findAll();
}
