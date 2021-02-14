package com.ainur.fastid.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class IdRangeRepositoryImpl implements IdGenerationRepository {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public Long getNextId() {
        return jdbcTemplate.queryForObject("SELECT nextval('idGen')", Long.class);
    }

}
