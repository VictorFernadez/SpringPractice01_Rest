package com.codev.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.codev.model.Client;

@Repository
public interface IClient extends JpaRepository<Client, Long> {

}
