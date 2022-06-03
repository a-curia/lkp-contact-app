package com.linkhipu.contact.repository;

import com.linkhipu.contact.domain.Contact;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface ContactRepository extends PagingAndSortingRepository<Contact, Long>,
        JpaSpecificationExecutor<Contact> {
}