package com.starter.lifseed.com.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.starter.lifseed.com.models.Invoice;


@Repository
public interface InvoiceRepository extends JpaRepository<Invoice, Integer> {

}
