package com.example.multipledatasource.dao.oracle;

import com.example.multipledatasource.domain.DictArea;

import java.util.List;

public interface DictAreaMapper {
    List<DictArea> findAll();
}